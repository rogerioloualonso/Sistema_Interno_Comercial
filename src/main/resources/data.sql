CREATE TABLE IF NOT EXISTS funcionario (
    id        INTEGER  PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cpf        INTEGER  NOT NULL
    );


insert into funcionario (id, nome, cpf) values (1, 'Manoel Abreu', 123456);
insert into funcionario (id, nome, cpf) values (2, 'Marilza Carla', 51785);
insert into funcionario (id, nome, cpf) values (3, 'Andre Silva', 65484);


CREATE TABLE IF NOT EXISTS produto (
    id        INTEGER  PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    qtdEstoque        INTEGER  NOT NULL,
    valor        FLOAT  NOT NULL
);

insert into produto (id, nome, qtdEstoque, valor) values (1, 'Pão', 100, 1);
insert into produto (id, nome, qtdEstoque, valor) values (2, 'Presunto', 50, 18);
insert into produto (id, nome, qtdEstoque, valor) values (3, 'Queijo', 70, 28);
insert into produto (id, nome, qtdEstoque, valor) values (4, 'Pão doce', 15, 6);
insert into produto (id, nome, qtdEstoque, valor) values (5, 'Sonho', 5, 4);
insert into produto (id, nome, qtdEstoque, valor) values (6, 'Coca-cola', 30, 11);


