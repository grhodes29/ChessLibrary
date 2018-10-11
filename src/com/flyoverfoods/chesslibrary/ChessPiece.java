package com.flyoverfoods.chesslibrary;


/**
 * @author      Giancarlo Rhodes <giancarlo.rhodes@gmail.com>
 * @version     x.x                 (current version number of program)
 * @since       x.x          (the version of the package this class was first added to)
 */
public class ChessPiece implements IChessPiece {

    private boolean _alive;
    private String _currentPosition;

    @Override
    public boolean IsAlive() {
        return this.getAlive();
    }

    @Override
    public String GetCurrentPosition(){
        return _currentPosition;
    }


    public boolean getAlive(){
        return _alive;
    }

    public void setAlive(boolean inValue) {
        _alive = inValue;
    }

    public ChessPiece(){
        this.setAlive(true);
    }

}

