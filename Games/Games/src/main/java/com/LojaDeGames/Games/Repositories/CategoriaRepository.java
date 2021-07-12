package com.LojaDeGames.Games.Repositories;

import com.LojaDeGames.Games.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Produto, Long> {
}