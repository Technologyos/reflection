package com.technologyos.reflection.services.internal;

class BoardLocation {
    private final int row;
    private final int column;

    public BoardLocation(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
