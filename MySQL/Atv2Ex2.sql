CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
id_categoria INT PRIMARY KEY,
tipo VARCHAR(20),
vegano boolean
);

INSERT INTO tb_categoria (id_categoria, tipo, vegano) VALUES
(1, "Salgada", false),
(2, "Salgada", true),
(3, "Doce", false),
(4, "Doce", true);

CREATE TABLE tb_pizza (
id_pizza INT,
nome VARCHAR(40),
tamanho VARCHAR(40),
preco DECIMAL,
id_categoria INT,
FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_pizza (id_pizza, nome, tamanho, preco, id_categoria) VALUES
(1000, "Frango c/ Catupiry", "Grande", 50, 1),
(1001, "Vegan Pass", "Broto", 29, 2),
(1002, "Banana c/ Chocolate", "Grande", 34, 3),
(1003, "Chocolate Vegano", "Broto", 22, 4);

#Faça um select que retorne os Produtos com o valor maior do que 45 reais.
SELECT nome, preco FROM tb_pizza WHERE preco > 45;

#Faça um select trazendo os Produtos com valor entre 29 e 60 reais.
SELECT nome, preco FROM tb_pizza WHERE preco >=29 AND preco <=60;

#Faça um select utilizando LIKE buscando os Produtos com a letra C.
SELECT nome FROM tb_pizza WHERE nome LIKE 'C%';

#Faça um um select com Inner join entre tabela categoria e pizza.
SELECT * FROM tb_categoria JOIN tb_pizza ON tb_categoria.id_categoria=tb_pizza.id_categoria;

#Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
SELECT * FROM tb_categoria JOIN tb_pizza ON tb_categoria.id_categoria= 3 AND 4;