#Creando la base de datos
create database sistema;
#Usando la db
use sistema;
#Creando la tabla empleado
create table empleado (
	id char(4) primary key,
	first_name varchar(45),
	last_name varchar(45),
	age int(2),
	rol varchar(45)
);