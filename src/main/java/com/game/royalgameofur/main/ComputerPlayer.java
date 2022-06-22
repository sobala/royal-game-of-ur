package com.game.royalgameofur.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComputerPlayer implements Player {

    List<Field> path;
    private Set<Piece> startPieces = new HashSet<>();
    private Set<Piece> endPieces = new HashSet<>();

    public ComputerPlayer(Board board) {
        this.path = board.getRightPath();
    }
}
