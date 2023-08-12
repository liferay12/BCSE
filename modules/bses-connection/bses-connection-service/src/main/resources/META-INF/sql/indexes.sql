create index IX_2333FCB2 on bsesconn_ConnectionDocument (connectionRequestId, documentType[$COLUMN_LENGTH:255$]);
create index IX_83B5AA47 on bsesconn_ConnectionDocument (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8D621689 on bsesconn_ConnectionDocument (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7456660E on bsesconn_ConnectionRequest (bpNumber[$COLUMN_LENGTH:75$]);
create index IX_AB9DFD1 on bsesconn_ConnectionRequest (caNumber[$COLUMN_LENGTH:75$], changeRequest);
create index IX_ED89744 on bsesconn_ConnectionRequest (emailId[$COLUMN_LENGTH:75$]);
create index IX_5C960A95 on bsesconn_ConnectionRequest (mobileNo[$COLUMN_LENGTH:75$], changeRequest);
create index IX_27014846 on bsesconn_ConnectionRequest (mobileNo[$COLUMN_LENGTH:75$], requestNo[$COLUMN_LENGTH:75$]);
create index IX_2BC640B7 on bsesconn_ConnectionRequest (mobileNo[$COLUMN_LENGTH:75$], requestStatus[$COLUMN_LENGTH:75$]);
create index IX_A189691D on bsesconn_ConnectionRequest (requestNo[$COLUMN_LENGTH:75$]);
create index IX_A6EB0A97 on bsesconn_ConnectionRequest (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_98134AD9 on bsesconn_ConnectionRequest (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BAC04FE6 on bsesconn_LocalityDivision (complaintCenter[$COLUMN_LENGTH:75$]);
create index IX_873DC998 on bsesconn_LocalityDivision (divisionCode[$COLUMN_LENGTH:75$]);
create index IX_9941E6B6 on bsesconn_LocalityDivision (divisionName[$COLUMN_LENGTH:75$]);
create index IX_A535D2EC on bsesconn_LocalityDivision (localityName[$COLUMN_LENGTH:75$]);
create index IX_71A8CEDE on bsesconn_LocalityDivision (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6A3374E0 on bsesconn_LocalityDivision (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_31B880AA on bsesconn_OTP (emailId[$COLUMN_LENGTH:75$]);
create index IX_398EBF34 on bsesconn_OTP (mobileNo[$COLUMN_LENGTH:75$]);
create index IX_7C2453F1 on bsesconn_OTP (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A1E322B3 on bsesconn_OTP (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_95D730BC on bsesconn_RequestNumberSeq (seqDate[$COLUMN_LENGTH:75$]);
create index IX_CA7694B5 on bsesconn_RequestNumberSeq (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4E96C477 on bsesconn_RequestNumberSeq (uuid_[$COLUMN_LENGTH:75$], groupId);