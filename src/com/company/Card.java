package com.company;

public class Card {
    String name;
    String type;
    boolean flipped;
    int value;
    CardColor color;

    public Card (String name, String type, boolean flipped, int value, CardColor color){
        this.name = name;
        this.type = type;
        this.flipped = flipped;
        this.value = value;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public CardColor getColor(){
        return color;
    }

    public String getType(){
        return type;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", flipped=" + flipped +
                ", value=" + value +
                ", color=" + color +
                '}';
    }
}
