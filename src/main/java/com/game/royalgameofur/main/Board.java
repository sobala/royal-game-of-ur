package com.game.royalgameofur.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Board {

    INSTANCE;

    private final Field L1 = new Field('L', 1, false, false);
    private final Field L2 = new Field('L', 2, false, false);
    private final Field L3 = new Field('L', 3, false, false);
    private final Field L4 = new Field('L', 4, true, false);
    private final Field L12 = new Field('L', 12, false, false);
    private final Field L13 = new Field('L', 13, true, false);

    private final Field R1 = new Field('R', 1, false, false);
    private final Field R2 = new Field('R', 2, false, false);
    private final Field R3 = new Field('R', 3, false, false);
    private final Field R4 = new Field('R', 4, true, false);
    private final Field R12 = new Field('R', 12, false, false);
    private final Field R13 = new Field('R', 13, true, false);

    private final Field C5 = new Field('C', 5, false, false);
    private final Field C6 = new Field('C', 6, false, false);
    private final Field C7 = new Field('C', 7, false, false);
    private final Field C8 = new Field('C', 8, true, true);
    private final Field C9 = new Field('C', 9, false, false);
    private final Field C10 = new Field('C', 10, false, false);
    private final Field C11 = new Field('C', 11, false, false);

    private List<Field> leftPath = new ArrayList<>(Arrays.asList(L1, L2, L3, L4, C5, C6, C7, C8, C9, C10, C11, L12, L13));
    private List<Field> rightPath = new ArrayList<>(Arrays.asList(R1, R2, R3, R4, C5, C6, C7, C8, C9, C10, C11, R12, R13));

}
