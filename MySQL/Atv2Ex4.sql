CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;

CREATE TABLE tb_categoria (
id_categoria INT PRIMARY KEY,
tipo VARCHAR(20),
importado boolean
);

INSERT INTO tb_categoria (id_categoria, tipo, importado) VALUES
(1, "Suina", true),
(2, "Bovina", true),
(3, "Ave", false);

CREATE TABLE tb_produto (
id_produto INT,
nome VARCHAR(40),
preco DECIMAL,
id_categoria INT,
FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_produto (id_produto, nome, preco, id_categoria) VALUES
(1001, "Bacon", 30, 1),
(1002, "Acém", 60, 2),
(1003, "Peito de Frango", 18, 3);


#Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT nome, preco FROM tb_produto WHERE preco > 50;

#Faça um select trazendo os Produtos com valor entre 3 e 60 reais..
SELECT nome, preco FROM tb_produto WHERE preco >=3 AND preco <=60;

#Faça um select utilizando LIKE buscando os Produtos com a letra C.
SELECT nome FROM tb_produto WHERE nome LIKE 'C%';

#Faça um um select com Inner join entre tabela categoria e produto.
SELECT * FROM tb_categoria JOIN tb_produto ON tb_categoria.id_categoria=tb_produto.id_categoria;

#Faça um select onde traga todos os Produtos de uma categoria específica.
SELECT * FROM tb_categoria JOIN tb_produto ON tb_categoria.id_categoria= 1;