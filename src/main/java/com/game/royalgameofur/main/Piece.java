package com.game.royalgameofur.main;

public class Piece {

    private Field position;
    private final Player player;

    public Piece(Field position, final Player player) {
        this.position = position;
        this.player = player;
    }

    public Field getPosition() {
        return position;
    }

    public void setPosition(Field position) {
        this.position = position;
    }

    public Player getPlayer() {
        return player;
    }
}
