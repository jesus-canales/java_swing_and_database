-- Crear base de datos
CREATE DATABASE coursedb;

-- Poner en uso la base de datos
USE coursedb;

-- Crear tabla curso
CREATE TABLE course
(
    id       int auto_increment primary key,
    nombre   varchar(100),
    creditos decimal(10, 2)
);

-- Listar tabla curso
SELECT * FROM course;