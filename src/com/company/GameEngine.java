package com.company;

public class GameEngine {
    Player player1;
    Player player2;
    WarTrack warTrack;
    GameBoard gameBoard1;
    GameBoard gameBoard2;
    GameBoard gameBoard3;

    public GameEngine(Player player1, Player player2, WarTrack warTrack, GameBoard gameBoard1, GameBoard gameBoard2, GameBoard gameBoard3) {
        this.player1 = player1;
        this.player2 = player2;
        this.warTrack = warTrack;
        this.gameBoard1 = gameBoard1;
        this.gameBoard2 = gameBoard2;
        this.gameBoard3 = gameBoard3;
    }


}
