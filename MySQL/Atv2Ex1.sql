CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classe (
id_classe INT NOT NULL,
nome_classe VARCHAR(80) NOT NULL PRIMARY KEY,
forca_classe INT
);

CREATE TABLE tb_personagem (
id_personagem INT PRIMARY KEY,
nome_personagem VARCHAR(80),
ataque INT,
defesa INT,
inteligencia INT,
id_classe VARCHAR(90),
CONSTRAINT fk_id_classe FOREIGN KEY (id_classe) REFERENCES tb_classe (id_classe)
);

ALTER TABLE tb_personagem ADD id_classe VARCHAR(90);

INSERT INTO tb_classe (id_classe, nome_classe, forca_classe)
VALUES 
(1, "SNIPER", 5600),
(2, "ARQUEIRO", 4500),
(3, "MAGO", 6000),
(4, "GIGANTE", 5500);

INSERT INTO tb_personagem (id_personagem, nome_personagem, ataque, defesa, inteligencia, id_classe)
VALUES 
(1, "JUNINHO PLAY", 2300, 3000, 2000, 2),
(2, "GUSTAVINHO GAMEPLAYRJ", 4000, 1200, 3000, 3),
(3, "MURILIN BIGODON", 100, 2300, 4000, 3),
(4, "ALAN OVOMALTINE", 1000, 1000, 3400, 3),
(5, "TAVIN BRABO", 12000, 14000, 32000, 3);

#Faça um um select com Inner join entre tabela classe e personagem.
SELECT * FROM tb_classe
JOIN tb_personagem;

#Faça um select utilizando LIKE buscando os personagens com a letra C.
SELECT * FROM tb_personagem WHERE nome_personagem LIKE 'C%';

#Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).
SELECT * FROM tb_personagem WHERE id_classe = 2;

#Faça um select que retorne os personagens com o poder de ataque maior do que 2000.
SELECT ataque FROM tb_personagem WHERE ataque > 2000;

#Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000.
SELECT nome_personagem, defesa FROM tb_personagem WHERE defesa >= 1000 AND defesa < 2000;

