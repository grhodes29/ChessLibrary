package com.flyoverfoods.chesslibrary;

public class Square {

    public String location;
    public boolean isOccupied;
    public ColorType color;

    public Square(String inLocation, boolean inIsOccupied, ColorType inColor) {
        location = inLocation;
        isOccupied = inIsOccupied;
        color = inColor;
    }
}
