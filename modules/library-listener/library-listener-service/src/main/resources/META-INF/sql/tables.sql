create table liblistener_Library (
	libraryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	libraryGroupId VARCHAR(75) null,
	libraryArtifactId VARCHAR(75) null,
	latestVersion VARCHAR(75) null,
	lastUpdated VARCHAR(75) null,
	currentVersion VARCHAR(75) null
);

create table liblistener_Repository (
	repositoryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	repositoryName VARCHAR(75) null,
	repositoryRootUrl VARCHAR(75) null,
	repositoryUserName VARCHAR(75) null,
	repositoryPassword VARCHAR(75) null
);