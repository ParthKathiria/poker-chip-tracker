package com.track.pokerchip.poker_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

// This file will contain all the Betting Actions

@Entity
@Table(name = "action_history")
public class ActionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "action_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private ActionType actionType;

    @Column(name = "amount")
    private Long amount;

    // For Undo: JSON of previous game state
    @Column(name = "previous_state", columnDefinition = "TEXT")
    private String previousState;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    public enum ActionType {
        BET, CALL, FOLD, CLAIM_POT, RESET_CHIPS, ROTATE_DEALER, ADD_PLAYER, REMOVE_PLAYER, NEXT_BETTING_ROUND, NEW_HAND
    }

    // Constructors, Getters, and Setters
    public ActionHistory() {
    }

    public ActionHistory(Long playerId, ActionType actionType, Long amount, String previousState) {
        this.playerId = playerId;
        this.actionType = actionType;
        this.amount = amount;
        this.previousState = previousState;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getPreviousState() {
        return previousState;
    }

    public void setPreviousState(String previousState) {
        this.previousState = previousState;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
