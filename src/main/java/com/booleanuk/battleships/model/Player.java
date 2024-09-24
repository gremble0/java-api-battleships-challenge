package com.booleanuk.battleships.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class Player {
  @ManyToOne
  @JsonIgnoreProperties("players")
  private Game game;
}