package com.booleanuk.battleships.model;

import lombok.Data;

import java.util.Optional;

@Data
public class Square {
  private Optional<Battleship> battleship;

  public void setBattleship(Battleship battleship) {
    this.battleship = Optional.of(battleship);
  }

  public void removeBattleship() {
    this.battleship = Optional.empty();
  }
}