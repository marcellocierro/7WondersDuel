package com.company;

public class GameBoard {
    Card[][] cardTree;
    int gameRound;
    public GameBoard(int gameRound) {
        if (gameRound == 1){
            cardTree = new Card[4][5];
            cardTree[0][0] = new Card("null", "null", false, -1, CardColor.NULL);
            cardTree[0][1] = new Card("null", "null", false, -1, CardColor.NULL);
        }
    }

}
