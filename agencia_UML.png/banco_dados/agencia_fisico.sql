CREATE DATABASE realizeSonhos;
USE realizeSonhos;
CREATE TABLE Usuario (
id_usuario INTEGER PRIMARY KEY auto_increment,
telefone_usuario FLOAT (20),
nome_usuario VARCHAR (40),
sobrenome_usuario VARCHAR (80),
email_usuario VARCHAR(80)
);

CREATE TABLE Cadastro (
id_cadastro INTEGER PRIMARY KEY auto_increment,
email_usuario VARCHAR(80),
id_usuario INTEGER,
nome_usuario VARCHAR (40),
sobrenome_usuario VARCHAR(80),
telefone_usuario VARCHAR (20),
FOREIGN KEY(id_usuario) REFERENCES Usuario (id_usuario)
);

select * FROM usuario;
select * from cadastro;

insert into usuario values (default,'17997426262', 'Gabriela','Camila','gabi@gmail.com');
insert into cadastro values ('1', 'gabi@gmail.com', '1', 'gabriela', 'camila','1176554328', default);