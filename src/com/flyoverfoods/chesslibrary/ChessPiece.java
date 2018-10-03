package com.flyoverfoods.chesslibrary;


/**
 * @author      Giancarlo Rhodes <giancarlo.rhodes@gmail.com>
 * @version     x.x                 (current version number of program)
 * @since       x.x          (the version of the package this class was first added to)
 */
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

