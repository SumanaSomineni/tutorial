package com.example.player;

public class Player {
    private int PlayerId;
    private String PlayerName;
    private int jerseyNumber;
    private String role;

    public Player(int PlayerId, String PlayerName, int jerseyNumber, String role) {
        this.PlayerId = PlayerId;
        this.PlayerName = PlayerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;

    }

    public int getPlayerId() {
        return PlayerId;
    }

    public void setPlayerId(int PlayerId) {
        this.PlayerId = PlayerId;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}