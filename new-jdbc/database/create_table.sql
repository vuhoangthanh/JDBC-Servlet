use newservlet;

create table role(
	id bigint not null primary key auto_increment,
    name VARCHAR(255) not null,
    code VARCHAR(255) not null,
    createdddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

create table user(
	id bigint not null primary key auto_increment,
    username VARCHAR(255) not null,
    password VARCHAR(255) not null,
    fullname VARCHAR(255) null,
    status int not null,
    roleid BIGINT not null,
    createdddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

alter table user add CONSTRAINT fk_user_role FOREIGN KEY (roleid) REFERENCES role(id)

create table news(
	id bigint not null primary key auto_increment,
    title VARCHAR(255) null,
    thumbnail VARCHAR(255) null,
    shortdescription TEXT not null,
    content TEXT null,
    categoryid bigint not null,
    createdddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

create table category(
	id bigint not null primary key auto_increment,
    name VARCHAR(255) not null,
    code VARCHAR(255) not null,
    createdddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

alter table news add constraint fk_news_category foreign key (categoryid) references category(id)

create table comment(
	id bigint not null primary key auto_increment,
    content text not null,
    user_id bigint not null,
    new_id bigint not null,
    createdddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

alter table comment add constraint fk_comment_user foreign key (user_id) references user(id);
alter table comment add constraint fk_comment_new foreign key (new_id) references news(id);
