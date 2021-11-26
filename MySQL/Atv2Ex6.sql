CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria (
id_categoria INT PRIMARY KEY,
tipo VARCHAR(20),
suporte boolean
);

INSERT INTO tb_categoria (id_categoria, tipo, suporte) VALUES
(1, "POO", true),
(2, "Versionamento", true),
(3, "Lógica", false);

CREATE TABLE tb_produto (
id_produto INT,
nome VARCHAR(40),
preco DECIMAL,
id_categoria INT,
FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_produto (id_produto, nome, preco, id_categoria) VALUES
(1001, "Java: POO", 350, 1),
(1002, "Git/GitHub", 60, 2),
(1003, "Fundamentos da Programção", 27, 3);


#Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT nome, preco FROM tb_produto WHERE preco > 50;

#Faça um select trazendo os Produtos com valor entre 3 e 60 reais..
SELECT nome, preco FROM tb_produto WHERE preco >=3 AND preco <=60;

#Faça um select utilizando LIKE buscando os Produtos com a letra C.
SELECT nome FROM tb_produto WHERE nome LIKE 'J%';

#Faça um um select com Inner join entre tabela categoria e produto.
SELECT * FROM tb_categoria JOIN tb_produto ON tb_categoria.id_categoria=tb_produto.id_categoria;

#Faça um select onde traga todos os Produtos de uma categoria específica.
SELECT * FROM tb_categoria JOIN tb_produto ON tb_categoria.id_categoria= 1;