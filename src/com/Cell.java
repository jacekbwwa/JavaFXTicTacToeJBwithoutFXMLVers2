package com;

/**
 *
 * @author Jacek Byzdra email: jacekbwwa@gmail.com
 */
class Cell {

    private String cellState;
    private int weightsMoveComp;
    private int weightsMovePlayer1;
    private int weightsMovePlayer2;
    private String moveComp;
    private String movePlayer1;
    private String movePlayer2;
    private String cellName;
    private int priorCellsComp;
    private int priorCellsPlayer1;
    private int priorCellsPlayer2;
    private int weightNumberPlayers;
    private Pair pair;

    public Cell() {
        this.pair = new Pair();
    }

    void setCellName(String cellName) {
        this.cellName = cellName;
    }

    void setCellState(String cellState) {
        this.cellState = cellState;
    }

    String getCellState() {
        return cellState;
    }

    /*
     *
     * @author Jacek Byzdra email: jacekbwwa@gmail.com
     *
     */
    void setMoveComp(String moveComp) {
        this.moveComp = moveComp;
    }

    String getMoveComp() {
        return moveComp;
    }

    void setMovePlayer1(String movePlayer1) {
        this.movePlayer1 = movePlayer1;
    }

    void setMovePlayer2(String movePlayer2) {
        this.movePlayer2 = movePlayer2;
    }

    void setWeightsMoveComp(int weightsMoveComp) {
        this.weightsMoveComp = weightsMoveComp;
    }

    int getWeightsMoveComp() {
        return weightsMoveComp;
    }

    int getWeightsMovePlayer1() {
        return weightsMovePlayer1;
    }

    int getWeightsMovePlayer2() {
        return weightsMovePlayer2;
    }

    void setPriorCellsComp(int priorCellsComp) {
        this.priorCellsComp = priorCellsComp;
    }

    int getPriorCellsComp() {
        return priorCellsComp;
    }

    void setPriorCellsPlayer1(int priorCellsPlayer1) {
        this.priorCellsPlayer1 = priorCellsPlayer1;
    }

    int getPriorCellsPlayer1() {
        return priorCellsPlayer1;
    }

    void setPriorCellsPlayer2(int priorCellsPlayer2) {
        this.priorCellsPlayer2 = priorCellsPlayer2;
    }

    int getPriorCellsPlayer2() {
        return priorCellsPlayer2;
    }

    void setWeightNumberPlayers(int weightNumberPlayers) {
        this.weightNumberPlayers = weightNumberPlayers;
    }

    int getWeightNumPlayers() {
        return weightNumberPlayers;
    }

    /*
     *
     * @author Jacek Byzdra email: jacekbwwa@gmail.com
     *
     */
    void setPair(Pair pair) {
        this.pair = pair;
    }

    Pair getPair() {
        return pair;
    }

}
