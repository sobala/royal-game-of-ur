package com.game.royalgameofur.main;

import java.util.concurrent.ThreadLocalRandom;

public final class Dice {

    public int rollDice() {
        return ThreadLocalRandom.current().nextInt(0,5);
    }
}
