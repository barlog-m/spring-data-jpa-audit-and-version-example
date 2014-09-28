create table USER (
	ID identity primary key,
	NAME varchar not null,
	VERSION BIGINT,
	CREATED_DATE TIMESTAMP,
	LAST_MODIFIED_DATE TIMESTAMP,
	CREATED_BY_ID BIGINT,
	LAST_MODIFIED_BY_ID BIGINT,
	constraint USER_CREATED_BY_USER foreign key (CREATED_BY_ID) references USER (ID),
	constraint USER_LAST_MODIFIED_BY_USER foreign key (LAST_MODIFIED_BY_ID) references USER (ID)
);

create table FOO (
	ID identity primary key,
	DATA varchar not null,
	VERSION BIGINT,
	CREATED_DATE TIMESTAMP,
	LAST_MODIFIED_DATE TIMESTAMP,
	CREATED_BY_ID BIGINT,
	LAST_MODIFIED_BY_ID BIGINT,
	constraint FOO_CREATED_BY_USER foreign key (CREATED_BY_ID) references USER (ID),
	constraint FOO_LAST_MODIFIED_BY_USER foreign key (LAST_MODIFIED_BY_ID) references USER (ID)
);

