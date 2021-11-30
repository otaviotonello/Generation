CREATE DATABASE prototipo_pi;
USE prototipo_pi;

CREATE TABLE tb_usuario(
id_usuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome_completo VARCHAR(455),
email VARCHAR(255),
senha VARCHAR(255)
);

CREATE TABLE tb_categoria (
id_categoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome_categoria VARCHAR(255),
descricao VARCHAR(2000),
tempo_categoria DECIMAL
);

CREATE TABLE tb_produto(
id_produto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titulo_video VARCHAR(455),
tempo_video DECIMAL,
nome_instrutor VARCHAR (300),
url_capa_video VARCHAR(555),
fk_id_categoria INT,
fk_id_usuario INT,
FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria),
FOREIGN KEY (fk_id_usuario) REFERENCES tb_usuario (id_usuario)
);

ALTER TABLE tb_produto ADD fk_id_usuario INT;
ALTER TABLE tb_produto ADD FOREIGN KEY (fk_id_usuario) REFERENCES tb_usuario (id_usuario);
