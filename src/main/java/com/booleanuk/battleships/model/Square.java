package com.booleanuk.battleships.model;

import lombok.Data;

import java.util.Optional;

@Data
public class Square {
  private Optional<Battleship> battleship;
}