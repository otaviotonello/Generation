CREATE DATABASE rh;
USE rh;

CREATE TABLE tb_funcionarios (
id_funcionario INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
idade INT,
email VARCHAR(255),
salario DECIMAL NOT NULL
);

SELECT * FROM rh.tb_funcionarios;

USE rh;
INSERT INTO tb_funcionarios (id_funcionario, salario)
VALUES
(1001, 1300),
(1002, 3000),
(1003, 6000),
(1004, 300);

SET SQL_SAFE_UPDATES =0;
SELECT id_funcionario, salario FROM tb_funcionarios WHERE salario > 2000;

SET SQL_SAFE_UPDATES =0;
SELECT id_funcionario, salario FROM tb_funcionarios WHERE salario < 2000;

ALTER TABLE tb_funcionarios MODIFY COLUMN idade DECIMAL;