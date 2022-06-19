package com.game.royalgameofur.main;

public final class Field {

    private final char position;
    private final int number;
    private final boolean doubleRoll;
    private final boolean unkillable;

    public Field(final char position, final int number, final boolean doubleRoll, final boolean unkillable) {
        this.position = position;
        this.number = number;
        this.doubleRoll = doubleRoll;
        this.unkillable = unkillable;
    }

    public char getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public boolean isDoubleRoll() {
        return doubleRoll;
    }

    public boolean isUnkillable() {
        return unkillable;
    }
}
