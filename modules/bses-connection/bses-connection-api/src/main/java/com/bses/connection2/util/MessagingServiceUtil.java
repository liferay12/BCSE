package com.bses.connection2.util;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.mail.internet.InternetAddress;

import org.apache.commons.lang3.StringUtils;

public class MessagingServiceUtil {

	private static final Log log = LogFactoryUtil.getLog(MessagingServiceUtil.class);

	public static boolean sendSMS(String mobileNo, String message) {
		log.info("MessagingServiceUtil..sendSMS()----");
		boolean messageFlag = false;
		if(!StringUtils.equalsIgnoreCase(PropsUtil.get("bses.otp.service.mobile"), "true")) {
			return messageFlag;
		}
		
		String requestUrl = PropsUtil.get("bses.otp.service");
		if(StringUtils.isBlank(requestUrl)) {
			return messageFlag;
		}
		
		try {
			System.out.println("send sms ...");
			
			String encodedURL = requestUrl;
			StringBuffer postData = new StringBuffer(StringPool.BLANK);
			postData.append("mnumber").append(StringPool.EQUAL).append(mobileNo);
			postData.append(StringPool.AMPERSAND);
			postData.append("message").append(StringPool.EQUAL).append(URLEncoder.encode(message, "UTF-8"));

			System.out.println("post data ...." + postData);
			byte[] postDataBytes = postData.toString().getBytes("UTF-8");
			URL url = new URL(encodedURL);
			HttpURLConnection uc = (HttpURLConnection) url.openConnection();
			uc.setDoOutput(true);
			uc.setRequestMethod("POST");
			uc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			uc.setRequestProperty("charset", "utf-8");
			uc.setRequestProperty("Content-Length", Integer.toString(postDataBytes.length));
			uc.getOutputStream().write(postDataBytes);

			uc.getResponseMessage();

			// get SMS response String
			log.debug("SMS response code - " + uc.getResponseCode());
			StringBuffer response = new StringBuffer();
			if (uc.getResponseCode() == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
				String inputLine;

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

			}
			String responseStr = response.toString();
			StringBuffer sb1 = new StringBuffer("responseStr === ");
			sb1.append(responseStr);
			log.info(sb1);

			if (uc.getResponseCode() == 200) {
				log.info("SMS successfully sent .... !!!");
				messageFlag = true;
			} else {
				log.info("Failed to send SMS with erro code.... " + uc.getResponseCode());
			}

		} catch (Exception e) {
			log.error("sendSMSTest() Exception - " + e);
		}
		
		return messageFlag;

	}
	
	public static boolean sendEmail(String from, String to, String subject, String body) {
		log.info("MessagingServiceUtil..sendEmail()----");
		boolean emailSent = false;
		if(!StringUtils.equalsIgnoreCase(PropsUtil.get("bses.otp.service.email"), "true")) {
			return emailSent;
		}
		
		log.info("Sending an email...FROM="+ from +" TO="+to);
		MailMessage mailMessage = new MailMessage();
		try {
			mailMessage.setTo(new InternetAddress(to));
			mailMessage.setFrom(new InternetAddress(from));
			mailMessage.setSubject(subject);
			mailMessage.setBody(body);
			mailMessage.setHTMLFormat(true);
		//	log.info("EmailServiceImpl.sendEmail() - "+mailMessage.getSMTPAccount().getPort()+" | "+mailMessage.getSMTPAccount().getHost());
			MailServiceUtil.sendEmail(mailMessage);	
			emailSent = true;
		} catch (Exception e) {
			log.error(e);	
		}
		return emailSent;
		
	}

}
