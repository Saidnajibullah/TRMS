
CREATE TABLE application(
id1 serial not null unique
id varchar(80) not null,
supid varchar(80) not null,
fullname varchar(150) not null,
eventtype varchar(80) not null,
eventlocation varchar(80) not null,
eventcost numeric not null,
amount numeric default 1000 not null,
grade varchar not null,
presentaion varchar not null,
submitdate date not null,
justification varchar(250) not null,
supconfirm boolean default false not null,
headconfirm boolean default false not null,
bencoconfirm boolean default false not null, 
file1 bytea not null,
file2 bytea not null


);

create table files(
id varchar(80) references application(id),
 file1 bytea not null,
 file2 bytea not null
);

update application set amount = 1000;

insert into files (id, file1, file2) values 
((select id from application where id = 'e1234'), 'files', 'file2');
select id from application where supconfirm
insert into employee3 (id, fullname) values('e12356', 'Jordan');
drop table application;
truncate application;
delete from application;
