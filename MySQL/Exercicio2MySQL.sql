CREATE DATABASE ESCOLA;
USE ESCOLA;

CREATE TABLE tb_estudante (
id_estudantes INT,
nome VARCHAR(255),
idade DECIMAL,
nota DECIMAL,
matriculaPendente BOOLEAN
);

INSERT INTO tb_estudante (id_estudantes, nome, idade, nota, matriculaPendente)
VALUES  (1, "João", 10, 5, true),
		(2, "Maria", 15, 8, false),
        (3, "José", 13, 10, true),
        (4, "Joaquina", 16, 7, false),
        (5, "Afonso", 20, 2, true);

USE ESCOLA;
SET SQL_SAFE_UPDATES =0;
SELECT id_estudantes, nome, nota FROM tb_estudante WHERE nota > 7;

SET SQL_SAFE_UPDATES =0;
SELECT id_estudantes, nome, nota FROM tb_estudante WHERE nota < 7;

ALTER TABLE tb_estudante ADD ensimomedio BOOLEAN;