package com.game.royalgameofur.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HumanPlayer implements Player {

    private List<Field> path;
    private Set<Piece> startPieces = new HashSet<>(Arrays.asList());
    private Set<Piece> endPieces = new HashSet<>();

    public HumanPlayer(Board board) {
        this.path = board.getLeftPath();
    }
}
