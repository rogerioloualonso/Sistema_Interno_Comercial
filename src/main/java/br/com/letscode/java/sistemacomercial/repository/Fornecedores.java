package br.com.letscode.java.sistemacomercial.repository;

import br.com.letscode.java.sistemacomercial.entity.fornecedor.Fornecedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Fornecedores extends JpaRepository<Fornecedor,Integer> {
}
