package com.track.pokerchip.poker_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

// This file will contain all the player related info.

@Entity
@Table(name = "players")
public class Player {
    // Player Status Info
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(name = "position")
    private Integer position;

    @Column(name = "is_dealer")
    private Boolean isDealer = false;

    // Chip denominations
    @Column(name = "chips_5")
    private Integer chips5 = 0;

    @Column(name = "chips_10")
    private Integer chips10 = 0;

    @Column(name = "chips_25")
    private Integer chips25 = 0;

    @Column(name = "chips_50")
    private Integer chips50 = 0;

    @Column(name = "chips_100")
    private Integer chips100 = 0;

    @Column(name = "chips_500")
    private Integer chips500 = 0;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    // Constructors
    public Player() {
    } // Mandatory constructor for JPA: a no-arg constructor

    public Player(String name) { // My constructor
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    // Method to calculate the total chip value
    public long getTotalValue() {
        return chips5 * 5L
                + chips10 * 10L
                + chips25 * 25L
                + chips50 * 50L
                + chips100 * 100L
                + chips500 * 500L;
    }

    // Method to check if the player has enough chips for a bet
    public boolean hasEnoughChips(long amount) {
        return getTotalValue() >= amount;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getIsDealer() {
        return isDealer;
    }

    public void setIsDealer(Boolean isDealer) {
        this.isDealer = isDealer;
    }

    public Integer getChips5() {
        return chips5;
    }

    public void setChips5(Integer chips5) {
        this.chips5 = chips5;
    }

    public Integer getChips10() {
        return chips10;
    }

    public void setChips10(Integer chips10) {
        this.chips10 = chips10;
    }

    public Integer getChips25() {
        return chips25;
    }

    public void setChips25(Integer chips25) {
        this.chips25 = chips25;
    }

    public Integer getChips50() {
        return chips50;
    }

    public void setChips50(Integer chips50) {
        this.chips50 = chips50;
    }

    public Integer getChips100() {
        return chips100;
    }

    public void setChips100(Integer chips100) {
        this.chips100 = chips100;
    }

    public Integer getChips500() {
        return chips500;
    }

    public void setChips500(Integer chips500) {
        this.chips500 = chips500;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
