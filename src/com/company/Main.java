package com.company;

public class Main {

    public static void main(String[] args) {
        WarTrack warTrack =  new WarTrack();
        warTrack.printWarSpace();
        warTrack.moveWarPawn(1, 5);
        warTrack.printWarSpace();
        warTrack.getSpaceVp();

        Card test = new Card("Test of Card", "Regular", false, 10, CardColor.BLUE);

        System.out.printf(test.toString());

        Player player1 =  new Player(0, 0);
        Player player2 =  new Player(0, 0);


    }
}
