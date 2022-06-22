package com.game.royalgameofur.main;

public final class GameSetup {


    //TODO: Write a test
    public Piece[] makePlayerPieces(Player player) {
        Piece[] pieces = new Piece[7];
        for (int i = 0; i < 7; i++) {
            pieces[i] = new Piece(player);
        }
        return pieces;
    }

}
