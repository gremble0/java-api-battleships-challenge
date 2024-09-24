package com.booleanuk.battleships.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "games")
public class Game {
  private static final int NUM_ROWS = 10;
  private static final int NUM_COLUMNS = 10;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(nullable = false)
  @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
  private Pair<Player, Player> players;

  @Column(nullable = false)
  private List<List<Square>> grid = new ArrayList<>() {{
    for (int i = 0; i < Game.NUM_ROWS; i++) {
      List<Square> row = new ArrayList<>();
      for (int j = 0; j < Game.NUM_COLUMNS; j++)
        row.add(new Square());
      this.add(row);
    }
  }};
}