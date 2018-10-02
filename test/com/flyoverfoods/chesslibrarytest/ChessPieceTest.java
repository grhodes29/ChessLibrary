package com.flyoverfoods.chesslibrarytest;

import com.flyoverfoods.chesslibrary.ChessPiece;
import org.junit.Assert;
import org.junit.Test;

public class ChessPieceTest {

    @Test
    public void NewPieceIsAlive(){

        // arrange
        ChessPiece _piece = new ChessPiece();

        // act

        // assert
        Assert.assertTrue(_piece.IsAlive());
    }

}
