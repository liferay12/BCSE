package rename.dms.folder.portlet;

import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import rename.dms.folder.constants.RenameDmsFolderPortletKeys;

/**
 * @author 12345
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=RenameDmsFolder", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RenameDmsFolderPortletKeys.RENAMEDMSFOLDER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class RenameDmsFolderPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		DynamicQuery dynamicQuery = DLFolderLocalServiceUtil.dynamicQuery();
		dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(38105));
		List<DLFolder> folders = DLFolderLocalServiceUtil.dynamicQuery(dynamicQuery);

		for (DLFolder folder : folders) {
			System.out.println(folder.getName());
			String newName = folder.getName().replaceAll("_", " ");
			folder.setName(newName);
			DLFolderLocalServiceUtil.updateDLFolder(folder);
		}

		super.doView(renderRequest, renderResponse);
	}

	public static List<DLFolder> fetchAllFolders(long groupId) throws PortalException {
		DynamicQuery dynamicQuery = DLFolderLocalServiceUtil.dynamicQuery();
		dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(38105));
		List<DLFolder> folders = DLFolderLocalServiceUtil.dynamicQuery(dynamicQuery);
		return folders;
	}

}