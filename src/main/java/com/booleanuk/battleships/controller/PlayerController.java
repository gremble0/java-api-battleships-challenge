package com.booleanuk.battleships.controller;

import com.booleanuk.battleships.model.Player;
import com.booleanuk.battleships.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("players")
public class PlayerController {
  @Autowired
  private PlayerRepository repository;

  @PostMapping
  public ResponseEntity<Player> register(@RequestBody Player player) {
    return ResponseEntity.status(HttpStatus.CREATED).body(this.repository.save(player));
  }
}