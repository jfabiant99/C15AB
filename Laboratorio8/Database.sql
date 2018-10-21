##Creacion de la base de datos sistema
create database sistema;
##Creacion de la tabla producto:
create table producto (
	codigo char(4) primary key,
	nombre varchar(45),
	precio double(7,2),
	stock int(3)
);
