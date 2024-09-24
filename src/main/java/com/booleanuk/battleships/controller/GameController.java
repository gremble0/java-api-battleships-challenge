package com.booleanuk.battleships.controller;

import com.booleanuk.battleships.model.Game;
import com.booleanuk.battleships.repository.GameRepository;
import com.booleanuk.battleships.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("games")
public class GameController {
  @Autowired
  private GameRepository gameRepository;

  @Autowired
  private PlayerRepository playerRepository;

  @PostMapping
  public ResponseEntity<Game> start(@RequestBody Game game) {
    this.playerRepository.save(game.getPlayers().getFirst());
    this.playerRepository.save(game.getPlayers().getSecond());

    return ResponseEntity.status(HttpStatus.CREATED).body(game);
  }
}