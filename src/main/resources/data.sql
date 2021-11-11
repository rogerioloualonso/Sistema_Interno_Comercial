
insert into funcionario (nome, cpf) values ('Manoel Abreu', 123456);
insert into funcionario (nome, cpf) values ('Marilza Carla', 51785);
insert into funcionario (nome, cpf) values ('Andre Silva', 65484);


insert into produto (id, nome, qtdEstoque, valor) values (1, 'Pão', 100, 1);
insert into produto (id, nome, qtdEstoque, valor) values (2, 'Presunto', 50, 18);
insert into produto (id, nome, qtdEstoque, valor) values (3, 'Queijo', 70, 28);
insert into produto (id, nome, qtdEstoque, valor) values (4, 'Pão doce', 15, 6);
insert into produto (id, nome, qtdEstoque, valor) values (5, 'Sonho', 5, 4);
insert into produto (id, nome, qtdEstoque, valor) values (6, 'Coca-cola', 30, 11);


insert into vendas(id, data_venda, id_funcionario) values(1, '2020-10-20', 1);/*
insert into vendas(id, data_venda, id_funcionario) values(2, '2020-10-15', 2);
*/


insert into item(id, qtd, produto_id, venda_id) values (1, 2, 1, 1);/*
insert into item(id, qtd, id_venda, id_produto) values (2, 1, 2, 1);
insert into item(id, qtd, id_venda, id_produto) values (3, 2, 3, 1);
insert into item(id, qtd, id_venda, id_produto) values (4, 3, 4, 1);
 */