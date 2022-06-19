package com.game.royalgameofur.main;

import java.util.concurrent.ThreadLocalRandom;

public enum Dice {

    INSTANCE;

    public int rollDice() {
        return ThreadLocalRandom.current().nextInt(0,5);
    }
}
