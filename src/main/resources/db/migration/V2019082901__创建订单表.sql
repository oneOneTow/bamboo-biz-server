create table express_order(
    id int(11) not null auto_increment,
    user_id int(11) not null default '0';
    express_number varchar(64) not null default '',
    express_company_name varchar(512) not null default '',
    express_company int(1) not null default '0',
    phone varchar(20) not null default '',
    address varchar(2014) not null default '',
    student_name varchar(64) not null default '',
    access_day datetime not null default current_timestamp,
    access_number varchar(64) not null default '',
    order_type int(1) not null default '0',
    order_type_name varchar(64) not null default '',
    remark varchar(2048) not null default '',
    primary_key(`id`),
    key ix_user_id(`user_id`),
    key ix_express_number(`express_number`),
    key ix_phone(`phone`),
    key ix_access_number(`access_number`)
)engine=innodb auto_increment=1 default charset=utfmb4