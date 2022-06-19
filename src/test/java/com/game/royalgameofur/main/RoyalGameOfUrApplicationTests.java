package com.game.royalgameofur.main;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class DiceTestSuite {

    @Test
    void rollDiceTest() {
        //Given
        Dice dice = Dice.INSTANCE;
        //When
        int result = dice.rollDice();
        //Then
        assertThat(result, allOf(greaterThanOrEqualTo(0), lessThanOrEqualTo(4)));
    }

}
