package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Funcionarios extends JpaRepository<Funcionario, Integer> {

    @Query(value = " select * from Funcionario f where f.nome like '%:nome%' ", nativeQuery = true)
    List<Funcionario> encontrarPorNome(@Param("nome") String nome );

    @Query(" delete from Funcionario f where f.nome =:nome ")
    @Modifying
    void deleteByNome(String nome);

    boolean existsByNome(String nome);

}
