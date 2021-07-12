package com.LojaDeGames.Games.Repositories;

import com.LojaDeGames.Games.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Categoria, Long> {

}