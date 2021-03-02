package com.company;

public class Player {
    int victoryPoints;
    int cardsHeld;

    public Player(int victoryPoints, int cardsHeld){
        this.victoryPoints = victoryPoints;
        this.cardsHeld = cardsHeld;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public int getCardsHeld() {
        return cardsHeld;
    }

    public void setCardsHeld(int cardsHeld) {
        this.cardsHeld = cardsHeld;
    }
}
