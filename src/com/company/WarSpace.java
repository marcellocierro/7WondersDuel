package com.company;

public class WarSpace {
    boolean occupied;
    int victoryPoints;
    int moneyEffect;
    boolean endGame;

    public WarSpace(boolean occupied, int victoryPoints, int moneyEffect, boolean endGame){
        this.occupied = occupied;
        this.victoryPoints = victoryPoints;
        this.moneyEffect = moneyEffect;
        this.endGame = endGame;
    }
    public boolean isOccupied() {
        return occupied;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public int getMoneyEffect() {
        return moneyEffect;
    }

    public boolean isEndGame() {
        return endGame;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "WarSpace{" +
                "occupied=" + occupied +
                ", victoryPoints=" + victoryPoints +
                ", moneyEffect=" + moneyEffect +
                ", endGame=" + endGame +
                '}';
    }
}
