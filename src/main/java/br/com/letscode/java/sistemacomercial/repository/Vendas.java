package br.com.letscode.java.sistemacomercial.repository;

import br.com.letscode.java.sistemacomercial.entity.venda.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Vendas extends JpaRepository<Venda,Integer> {
}
