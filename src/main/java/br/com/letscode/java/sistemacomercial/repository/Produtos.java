package br.com.letscode.java.sistemacomercial.repository;

import br.com.letscode.java.sistemacomercial.entity.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
