CREATE DATABASE professors_db;

USE professors_db;

CREATE TABLE professors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    fecha_nacimiento VARCHAR(10) NOT NULL,
    lugar_origen VARCHAR(50) NOT NULL,
    genero VARCHAR(10) NOT NULL,
    tecnologias VARCHAR(255) NOT NULL,
    modalidad VARCHAR(20) NOT NULL
);

SELECT * FROM professors;
