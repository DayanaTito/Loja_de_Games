package com.example.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.lojagames.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
