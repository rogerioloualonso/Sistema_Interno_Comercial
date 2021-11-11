CREATE TABLE IF NOT EXISTS funcionario (
    id_funcionario        INTEGER  PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cpf        INTEGER  NOT NULL
    );


insert into funcionario (id_funcionario, nome, cpf) values (1, 'Manoel Abreu', 123456);
insert into funcionario (id_funcionario, nome, cpf) values (2, 'Marilza Carla', 51785);
insert into funcionario (id_funcionario, nome, cpf) values (3, 'Andre Silva', 65484);


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


CREATE TABLE IF NOT EXISTS vendas (
    id        INTEGER  PRIMARY KEY AUTO_INCREMENT,
    data_venda        DATE  NOT NULL,
    id_funcionario        INT  NOT NULL REFERENCES funcionario(id_funcionario)
    );

/*
insert into vendas(id, data_venda, id_funcionario) values(1, '2020-10-20', 1);
insert into vendas(id, data_venda, id_funcionario) values(2, '2020-10-15', 2);
*/

CREATE TABLE IF NOT EXISTS item (
        id        INTEGER  PRIMARY KEY AUTO_INCREMENT,
        qtd        INTEGER  NOT NULL,
        id_venda        INT  NOT NULL REFERENCES vendas(id),
        id_produto        INT  NOT NULL REFERENCES produto(id)
);

/*
insert into item(id, qtd, id_venda, id_produto) values (1, 2, 1, 1);
insert into item(id, qtd, id_venda, id_produto) values (2, 1, 1, 2);
insert into item(id, qtd, id_venda, id_produto) values (3, 2, 1, 3);
insert into item(id, qtd, id_venda, id_produto) values (4, 3, 2, 4);
 */