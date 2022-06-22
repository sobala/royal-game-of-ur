package com.game.royalgameofur.main;

public class Piece implements FieldProperty {

    private Field fieldPosition;
    private final Player player;

    public Piece(final Player player) {
        this.fieldPosition = null;
        this.player = player;
    }

    public Field getFieldPosition() {
        return fieldPosition;
    }

    public void setFieldPosition(Field field) {
        this.fieldPosition = fieldPosition;
    }

    public Player getPlayer() {
        return player;
    }

    //TODO: Implement piece check move function
    public boolean canMove(){ return false; }
}
