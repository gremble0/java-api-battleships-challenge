package com.booleanuk.battleships.repository;

import com.booleanuk.battleships.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}