package com.game.royalgameofur.main;

public interface StateTransition {
    /**
     * Perform one-time initialization tasks, such as constructing game objects,
     * opening files, setting up the timers, audio and images, and setting up
     * the key/mouse event handlers.
     */
    default void initGame() { }

    /**
     * Perform per-game initialization tasks for a new game, such as
     * resetting the score and all the game properties, clear the board, etc.
     */
    default void newGame() { }

    /**
     * Start the game, e.g., start the timers
     */
    default void startGame() { }

    /**
     * Stop the game (game over), stop the timers and update game statistics
     * such as high score.
     */
    default void stopGame() { }

    /**
     * Run one step of the game, either due to user action (via key/mouse) or timer task.
     * Hard to define here as it may have different parameters and return type.
     */
// default Xxx stepGame(Aaa) { }

    /**
     * Pause the game, e.g., pause the timers
     */
    default void pauseGame() { }

    /**
     * Resume the paused game, e.g., resume the timers
     */
    default void resumeGame() { }

    /**
     * Perform housekeeping tasks such as closing the files before exiting.
     */
    default void destroyGame() { }
}
