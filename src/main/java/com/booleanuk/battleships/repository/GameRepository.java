package com.booleanuk.battleships.repository;

import com.booleanuk.battleships.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}