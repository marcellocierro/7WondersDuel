package com.company;

public class WarTrack {
    WarSpace[] warSpaces =  new WarSpace[19];

    public WarTrack(){
        warSpaces[0] = new WarSpace(false, 0, 0, true);
        warSpaces[1] = new WarSpace(false, 10, -5, false);
        warSpaces[2] = new WarSpace(false, 10, -5, false);
        warSpaces[3] = new WarSpace(false, 10, -5, false);
        warSpaces[4] = new WarSpace(false, 5, -2, false);
        warSpaces[5] = new WarSpace(false, 5, -2, false);
        warSpaces[6] = new WarSpace(false, 5, -2, false);
        warSpaces[7] = new WarSpace(false, 2, 0, false);
        warSpaces[8] = new WarSpace(false, 2, 0, false);
        warSpaces[9] = new WarSpace(true, 0, 0, false);
        warSpaces[10] = new WarSpace(false, 2, 0, false);
        warSpaces[11] = new WarSpace(false, 2, 0, false);
        warSpaces[12] = new WarSpace(false, 5, -2, false);
        warSpaces[13] = new WarSpace(false, 5, -2, false);
        warSpaces[14] = new WarSpace(false, 5, -2, false);
        warSpaces[15] = new WarSpace(false, 10, -5, false);
        warSpaces[16] = new WarSpace(false, 10, -5, false);
        warSpaces[17] = new WarSpace(false, 10, -5, false);
        warSpaces[18] = new WarSpace(false, 0, 0, true);

    }

    public void moveWarPawn(int player, int distance){
        for (int i = 0; i < warSpaces.length; i++) {
            if (warSpaces[i].isOccupied()){
                if (player == 0 ){
                    if ((i - distance) > 0){
                        warSpaces[i].setOccupied(false);
                        warSpaces[i-distance].setOccupied(true);
                        break;
                    }
                }
                if (player == 1){
                    if ((i+distance) < 18){
                        warSpaces[i].setOccupied(false);
                        warSpaces[i+distance].setOccupied(true);
                        break;
                    }
                }
            }
        }
    }

    public void printWarSpace(){
        for (WarSpace space : warSpaces) {
            System.out.printf(String.valueOf(space.toString()) + "\n");
        }
    }

    public int getSpaceVp() {
        for (int i = 0; i < warSpaces.length; i++) {
            if (warSpaces[i].isOccupied()){
                return warSpaces[i].getVictoryPoints();
            }
        }
        return -1;
    }

    public int getOccupiedSPace(){
        for (int i = 0; i < warSpaces.length; i++){
            if (warSpaces[i].isOccupied()){
                return i;
            }
        }
        return -1;
    }
}
