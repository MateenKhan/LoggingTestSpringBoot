create sequence hibernate_sequence start with 1 increment by 1;
create table employee (id integer not null, age integer, name varchar(255), primary key (id));
