package com.flyoverfoods.chesslibrary;

public class ChessPiece implements IChessPiece {

    private boolean _alive;

    @Override
    public boolean IsAlive() {
        return _alive;
    }


    public ChessPiece(){
        _alive = true;
    }

}
