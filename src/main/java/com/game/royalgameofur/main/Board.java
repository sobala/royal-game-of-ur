package com.game.royalgameofur.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Board {

    private final Field L1 = new Field(FieldType.PRIVATE);
    private final Field L2 = new Field(FieldType.PRIVATE);
    private final Field L3 = new Field(FieldType.PRIVATE);
    private final Field L4 = new Field(FieldType.DOUBLEROLL);
    private final Field L13 = new Field(FieldType.PRIVATE);
    private final Field L14 = new Field(FieldType.DOUBLEROLL);

    private final Field R1 = new Field(FieldType.PRIVATE);
    private final Field R2 = new Field(FieldType.PRIVATE);
    private final Field R3 = new Field(FieldType.PRIVATE);
    private final Field R4 = new Field(FieldType.DOUBLEROLL);
    private final Field R13 = new Field(FieldType.PRIVATE);
    private final Field R14 = new Field(FieldType.DOUBLEROLL);

    private final Field C5 = new Field(FieldType.SHARED);
    private final Field C6 = new Field(FieldType.SHARED);
    private final Field C7 = new Field(FieldType.SHARED);
    private final Field C8 = new Field(FieldType.PROTECTEDDOUBLEROLL);
    private final Field C9 = new Field(FieldType.SHARED);
    private final Field C10 = new Field(FieldType.SHARED);
    private final Field C11 = new Field(FieldType.SHARED);
    private final Field C12 = new Field(FieldType.SHARED);

    private final Field[][] board = {
            {L4, C5, R4},
            {L3, C6, R3},
            {L2, C7, R2},
            {L1, C8, R1},
            {null, C9, null},
            {null, C10, null},
            {L14, C11, R14},
            {L13, C12, R13}
    };

    private final List<Field> leftPath = new ArrayList<>(Arrays.asList(L1, L2, L3, L4, C5, C6, C7, C8, C9, C10, C11, C12, L13, L14));
    private final List<Field> rightPath = new ArrayList<>(Arrays.asList(R1, R2, R3, R4, C5, C6, C7, C8, C9, C10, C11, C12, R13, R14));

    public List<Field> getLeftPath() {
        return leftPath;
    }

    public List<Field> getRightPath() {
        return rightPath;
    }

    public Field[][] getBoard() {
        return board;
    }

    //TODO: Add new game option
    public void resetBoard() {}
}
