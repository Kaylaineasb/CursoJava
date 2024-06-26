package com.example.demo.models.repositories;

import com.example.demo.models.entites.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepository
        extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto,Integer> {
        public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

        @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
        public Iterable<Produto> searchByNameLike(@Param("nome")String nome);
}
