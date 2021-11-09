package br.com.letscode.java.sistemacomercial.repository;

import br.com.letscode.java.sistemacomercial.entity.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Itens extends JpaRepository<Item,Integer> {
}
