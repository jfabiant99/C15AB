create database app02;
use app02;

create table employees (
codigo int primary key,
salary decimal(8,2)
)

insert into employees values (1, 500);
insert into employees values (2, 1500);
insert into employees values (3, 300);
insert into employees values (4, 800);

alter table employees add column ocupacion varchar (35);

select * from employees;

update employees set ocupacion = "Contador" where codigo = 1 or codigo = 3 or codigo = 4;
update employees set ocupacion = "Adrministrador" where codigo = 1 or codigo = 2;


select ocupacion, count(codigo) as codigo from employees GROUP by ocupacion;

select ocupacion, sum(salary) as total from employees GROUP by ocupacion;

