
insert into funcionario (id, nome, cpf) values (1, 'Manoel Abreu', 123456);
insert into funcionario (id, nome, cpf) values (2, 'Marilza Carla', 51785);
insert into funcionario (id, nome, cpf) values (3, 'Andre Silva', 65484);


insert into produto (id, nome, qtd_Estoque, valor) values (1, 'Pão', 100, 1);
insert into produto (id, nome, qtd_Estoque, valor) values (2, 'Presunto', 50, 18);
insert into produto (id, nome, qtd_Estoque, valor) values (3, 'Queijo', 70, 28);
insert into produto (id, nome, qtd_Estoque, valor) values (4, 'Pão doce', 15, 6);
insert into produto (id, nome, qtd_Estoque, valor) values (5, 'Sonho', 5, 4);
insert into produto (id, nome, qtd_Estoque, valor) values (6, 'Coca-cola', 30, 11);

insert into vendas(id, data, id_funcionario) values(1, '2020-10-20', 1);
insert into vendas(id, data, id_funcionario) values(2, '2020-10-15', 2);

insert into item(id, qtd, venda_id, produto_id) values (1, 2, 1, 1);
insert into item(id, qtd, venda_id, produto_id) values (2, 1, 2, 2);
insert into item(id, qtd, venda_id, produto_id) values (3, 2, 2, 3);
insert into item(id, qtd, venda_id, produto_id) values (4, 3, 1, 4);
