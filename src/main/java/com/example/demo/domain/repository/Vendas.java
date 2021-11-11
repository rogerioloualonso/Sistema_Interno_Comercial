package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface Vendas extends JpaRepository<Venda, Integer>{
    @Query(value = " select * from vendas f where f.id like '%:id%' ", nativeQuery = true)
    List<Venda> encontrarPorId(@Param("id") int id );

    @Query(" delete from vendas f where f.id =:id ")
    @Modifying
    void deleteById(int id);

    boolean existsById(int id);
}
