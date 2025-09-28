package com.track.pokerchip.poker_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

// This file will contain all the Game related stuff

@Entity
@Table(name = "game_state")
public class GameState {
    // Game Status Info
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pot_value")
    private Long potValue = 0L;

    @Column(name = "current_dealer_id")
    private Long currentDealerId;

    @Column(name = "current_bet")
    private Long currentBet = 0L;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    // Constructors, Getters, and Setters
    public GameState() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPotValue() {
        return potValue;
    }

    public void setPotValue(Long potValue) {
        this.potValue = potValue;
    }

    public Long getCurrentDealerId() {
        return currentDealerId;
    }

    public void setCurrentDealerId(Long currentDealerId) {
        this.currentDealerId = currentDealerId;
    }

    public Long getCurrentBet() {
        return currentBet;
    }

    public void setCurrentBet(Long currentBet) {
        this.currentBet = currentBet;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
