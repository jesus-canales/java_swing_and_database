-- Crear base de datos
CREATE DATABASE coursedb;

-- Poner en uso la base de datos
USE coursedb;

-- Crear tabla curso
CREATE TABLE course
(
    id       int auto_increment primary key,
    nombre   varchar(100),
    precio decimal(10, 2)
);

-- Listar tabla curso
SELECT * FROM course;

-- Eliminar tabla
DROP TABLE course;