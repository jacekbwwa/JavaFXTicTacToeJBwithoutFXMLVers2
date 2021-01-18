package com;

import java.util.ArrayList;
import java.util.Random;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Jacek Byzdra email: jacekbwwa@gmail.com
 */
class Model {

    Player player1;
    Player comp;
    Player player2;
    Cell[][] CellArr;

    ToggleGroup groupPlayer1Signs;
    ToggleGroup groupPlayer2Signs;
    ToggleGroup groupCompSign;
    ToggleGroup groupPlayer1;
    ToggleGroup groupPlayer2;
    ToggleGroup groupComp;

    private int fireRowXComp;
    private int fireColYComp;
    private String returnPlayerSign;
    private String fireSign;
    private Pair pairXYArr;
    private Pair pair;
    private ArrayList<Pair> tempArrList;

    int sumWinPlayer1;
    int sumWinPlayer2;
    int sumWinComp;
    boolean winPlayer1;
    boolean winPlayer2;
    boolean winComp;
    private int int1;
    private int int2;

    public Model() {
        this.player1 = new Player();
        this.comp = new Player();
        this.player2 = new Player();
        Cell cell = new Cell();
        this.CellArr = new Cell[3][3];

        this.groupPlayer1Signs = new ToggleGroup();
        this.groupPlayer2Signs = new ToggleGroup();
        this.groupCompSign = new ToggleGroup();
        this.groupPlayer1 = new ToggleGroup();
        this.groupPlayer2 = new ToggleGroup();
        this.groupComp = new ToggleGroup();
        this.tempArrList = new ArrayList<>();
        this.pairXYArr = new Pair(int1, int2);
        this.pair = new Pair();

    }

    void addCellAndNameToCellArr() {
        CellArr = new Cell[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[i][j] == null) {
                    CellArr[i][j] = new Cell();
                    CellArr[i][j].setCellName("c" + i + j);
                }

            }
        }
    }

    void addPairToCellArr() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pair = new Pair(i, j);
                CellArr[i][j].setPair(pair);
                CellArr[i][j].getPair().setInt1(i);
                CellArr[i][j].getPair().setInt2(j);

            }
        }

    }

    boolean checkIfPlayersArrayIsFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[i][j].getCellState().equals(CellState.N.name())) {
                    return false;
                }
            }

        }
        return true;
    }

    void addNtoCellsStatePlayersArray() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (CellArr[i][j].getCellState() == null) {
                    CellArr[i][j].setCellState(CellState.N.name());
                }
            }
        }
    }

    void addNtoCellSignArr() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (CellArr[i][j].getCellState() == null) {
                    CellArr[i][j].setCellState(CellState.N.name());
                }
            }
        }
    }

    private void addPlayerNametoCellState(String playerName, int i, int j) {
        for (int v = 0; v < 3; v++) {
            for (int y = 0; y < 3; y++) {
                if ((v == i) && (y == j)) {

                    CellArr[i][j].setCellState(playerName);
                }
            }

        }

    }

    private void addWeightNumPlayerToCell(int v, int y) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == v) && (j == y) && (CellArr[i][j] != null)) {
                    switch (CellArr[i][j].getCellState()) {
                        case "N":
                            CellArr[i][j].setWeightNumberPlayers(0);

                        case "PL1TAKEN":
                            CellArr[i][j].setWeightNumberPlayers(5);

                            break;
                        case "PL2TAKEN":
                            CellArr[i][j].setWeightNumberPlayers(20);

                            break;
                        case "COMPTAKEN":
                            CellArr[i][j].setWeightNumberPlayers(100);

                            break;
                        default:
                            break;
                    }

                }

            }
        }

    }

    void addWeightsNumbersPlayersToCell() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[i][j] != null) {
                    switch (CellArr[i][j].getCellState()) {
                        case "N":
                            CellArr[i][j].setWeightNumberPlayers(0);
                            break;
                        case "PL1TAKEN":
                            CellArr[i][j].setWeightNumberPlayers(5);

                            break;
                        case "PL2TAKEN":
                            CellArr[i][j].setWeightNumberPlayers(20);

                            break;
                        case "COMPTAKEN":
                            CellArr[i][j].setWeightNumberPlayers(100);

                            break;
                        default:
                            break;
                    }

                }

            }
        }

    }


    private int getXPriorCellsComp() {
        int x = 5;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (CellArr[i][j].getPriorCellsComp()) {
                    case 1000:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    case 900:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    case 800:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    case 700:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    default:
                        break;
                }

            }
        }
        return x;
    }

    private int getYPriorCellsComp() {
        int y = 5;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (CellArr[i][j].getPriorCellsComp()) {
                    case 1000:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    case 900:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    case 800:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    case 700:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    default:
                        break;
                }
            }
        }
        return y;
    }

    private int getXPriorCellsPlayer1() {
        int x = 5;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (CellArr[i][j].getPriorCellsPlayer1()) {
                    case 1000:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    case 900:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    case 800:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    case 700:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    default:
                        break;
                }

            }
        }
        return x;
    }

    private int getYPriorCellsPlayer1() {
        int y = 5;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (CellArr[i][j].getPriorCellsPlayer1()) {
                    case 1000:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    case 900:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    case 800:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    case 700:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    default:
                        break;
                }

            }
        }
        return y;
    }

    private int getXPriorCellsPlayer2() {
        int x = 5;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (CellArr[i][j].getPriorCellsPlayer2()) {
                    case 1000:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    case 900:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    case 800:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    case 700:
                        x = CellArr[i][j].getPair().getInt1();
                        return x;
                    default:
                        break;
                }

            }
        }
        return x;
    }

    private int getYPriorCellsPlayer2() {
        int y = 5;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (CellArr[i][j].getPriorCellsPlayer2()) {
                    case 1000:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    case 900:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    case 800:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    case 700:
                        y = CellArr[i][j].getPair().getInt2();
                        return y;
                    default:
                        break;
                }

            }
        }
        return y;
    }

    private void calcPriorCellsComp() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                CellArr[i][j].setPriorCellsComp(CellArr[i][j].getWeightsMoveComp());
            }
        }

        // sumWeightsRow0 Comp has two cells in row0
        if (checkSumWeightsRow0Comp() == 1100) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[0][j].getWeightsMoveComp() == 100) {
                    CellArr[0][j].setPriorCellsComp(1000);
                    return;
                }
            }
        } // sumWeightsRow1 Comp has two cells in row1
        else if (checkSumWeightsRow1Comp() == 1100) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[1][j].getWeightsMoveComp() == 100) {
                    CellArr[1][j].setPriorCellsComp(1000);
                    return;
                }
            }
        } // sumWeightsRow2 Comp has two cells in row2
        else if (checkSumWeightsRow2Comp() == 1100) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[2][j].getWeightsMoveComp() == 100) {
                    CellArr[2][j].setPriorCellsComp(1000);
                    return;
                }
            }
        } // sumWeightsCol0 Comp has two cells in col0
        else if (checkSumWeightsCol0Comp() == 1100) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][0].getWeightsMoveComp() == 100) {
                    CellArr[i][0].setPriorCellsComp(1000);
                    return;
                }
            }
        } // sumWeightsCol1 Comp has two cells in col1
        else if (checkSumWeightsCol1Comp() == 1100) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][1].getWeightsMoveComp() == 100) {
                    CellArr[i][1].setPriorCellsComp(1000);
                    return;
                }
            }
        } // sumWeightsCol2 Comp has two cells in col2
        else if (checkSumWeightsCol2Comp() == 1100) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][2].getWeightsMoveComp() == 100) {
                    CellArr[i][2].setPriorCellsComp(1000);
                    return;
                }
            }
        } // sumWeightsDiagf Comp has two cells in Diagf
        else if (checkSumWeightsDiagfComp() == 1100) {
            if (CellArr[0][0].getWeightsMoveComp() == 100) {
                CellArr[0][0].setPriorCellsComp(1000);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsComp(1000);
            } else if (CellArr[2][2].getWeightsMoveComp() == 100) {
                CellArr[2][2].setPriorCellsComp(1000);
            }

        } // sumWeightsDiagb Comp has two cells in Diagb
        else if (checkSumWeightsDiagbComp() == 1100) {
            if (CellArr[0][2].getWeightsMoveComp() == 100) {
                CellArr[0][2].setPriorCellsComp(1000);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsComp(1000);
            } else if (CellArr[2][0].getWeightsMoveComp() == 100) {
                CellArr[2][0].setPriorCellsComp(1000);
            }

        } // sumWeightsRow0 Pl1 has two cells in row0
        else if (checkSumWeightsRow0Comp() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[0][j].getWeightsMoveComp() == 100) {
                    CellArr[0][j].setPriorCellsComp(900);
                    return;
                }
            }
        } // sumWeightsRow1 PL1 has two cells in row1
        else if (checkSumWeightsRow1Comp() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[1][j].getWeightsMoveComp() == 100) {
                    CellArr[1][j].setPriorCellsComp(900);
                    return;
                }
            }
        } // sumWeightsRow2 PL1 has two cells in row2
        else if (checkSumWeightsRow2Comp() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[2][j].getWeightsMoveComp() == 100) {
                    CellArr[2][j].setPriorCellsComp(900);
                    return;
                }
            }
        } // sumWeightsCol0 Pl1 has two cells in col0
        else if (checkSumWeightsCol0Comp() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][0].getWeightsMoveComp() == 100) {
                    CellArr[i][0].setPriorCellsComp(900);
                    return;
                }
            }
        } // sumWeightsCol1 Pl1 has two cells in col1
        else if (checkSumWeightsCol1Comp() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][1].getWeightsMoveComp() == 100) {
                    CellArr[i][1].setPriorCellsComp(900);
                    return;
                }
            }
        } // sumWeightsCol2 Pl1 has two cells in col2
        else if (checkSumWeightsCol2Comp() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][2].getWeightsMoveComp() == 100) {
                    CellArr[i][2].setPriorCellsComp(900);
                    return;
                }
            }
        } // sumWeightsDiagf Pl1 has two cells in Diagf
        else if (checkSumWeightsDiagfComp() == -900) {
            if (CellArr[0][0].getWeightsMoveComp() == 100) {
                CellArr[0][0].setPriorCellsComp(900);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsComp(900);
            } else if (CellArr[2][2].getWeightsMoveComp() == 100) {
                CellArr[2][2].setPriorCellsComp(900);
            }

        } // sumWeightsDiagb Pl1 has two cells in Diagb
        else if (checkSumWeightsDiagbComp() == -900) {
            if (CellArr[0][2].getWeightsMoveComp() == 100) {
                CellArr[0][2].setPriorCellsComp(900);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsComp(900);
            } else if (CellArr[2][0].getWeightsMoveComp() == 100) {
                CellArr[2][0].setPriorCellsComp(900);
            }

        } //diagF = 100 Player1 and diagB=700  Player1
        else if (checkSumWeightsDiagfComp() == 100 && checkSumWeightsDiagbComp() == 700) {
            if (CellArr[0][1].getCellState().equals(CellState.N.name())) {
                CellArr[0][1].setPriorCellsComp(800);

            } else if (CellArr[1][0].getCellState().equals(CellState.N.name())) {
                CellArr[1][0].setPriorCellsComp(800);

            } else if (CellArr[1][2].getCellState().equals(CellState.N.name())) {
                CellArr[1][2].setPriorCellsComp(800);

            } else if (CellArr[2][1].getCellState().equals(CellState.N.name())) {
                CellArr[2][1].setPriorCellsComp(800);

            }

        } //diagF = 700 Player1  and diagB=100 Comp
        else if (checkSumWeightsDiagfComp() == 700 && checkSumWeightsDiagbComp() == 100) {
            if (CellArr[0][1].getCellState().equals(CellState.N.name())) {
                CellArr[0][1].setPriorCellsComp(800);

            } else if (CellArr[1][0].getCellState().equals(CellState.N.name())) {
                CellArr[1][0].setPriorCellsComp(800);

            } else if (CellArr[1][2].getCellState().equals(CellState.N.name())) {
                CellArr[1][2].setPriorCellsComp(800);

            } else if (CellArr[2][1].getCellState().equals(CellState.N.name())) {
                CellArr[2][1].setPriorCellsComp(800);

            }

        } //c00,c11,c22,c20,c02 is free
        else if ((comp.getPlayerQueue().equals(PlayerQueue.FIRST.name())) && (CellArr[1][1].getWeightsMoveComp() == 100) && (CellArr[0][0].getWeightsMoveComp() == 100) && (CellArr[2][2].getWeightsMoveComp() == 100) && (CellArr[0][2].getWeightsMoveComp() == 100) && (CellArr[2][0].getWeightsMoveComp() == 100)) {

            tempArrList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != 1 && j != 1) {
                        pairXYArr = new Pair(i, j);

                        tempArrList.add(pairXYArr);

                    }
                }
            }

            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsComp(800);
        } // cell middle is taken by player1 and cell 00 && c22 && c02 && c20 is free, and no two in row
        else if ((CellArr[1][1].getWeightsMoveComp() == -500) && (!checkTwoInRow()) && (CellArr[0][0].getWeightsMoveComp() == 100) && (CellArr[2][2].getWeightsMoveComp() == 100) && (CellArr[0][2].getWeightsMoveComp() == 100) && (CellArr[2][0].getWeightsMoveComp() == 100)) {
            tempArrList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != 1 && j != 1) {
                        pairXYArr = new Pair(i, j);

                        tempArrList.add(pairXYArr);

                    }
                }
            }
            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsComp(800);

        } // player1 has one cell in 00 or 22 or 02 or 20, and cell middle is free, and no two in row
        else if (((CellArr[0][0].getWeightsMoveComp() == -500) || (CellArr[2][2].getWeightsMoveComp() == -500) || (CellArr[0][2].getWeightsMoveComp() == -500) || (CellArr[2][0].getWeightsMoveComp() == -500)) && (CellArr[1][1].getWeightsMoveComp() == 100) && (!checkTwoInRow())) {
            CellArr[1][1].setPriorCellsComp(800);

        } //computer has one in middle, and player has opposite corners
        else if ((CellArr[1][1].getWeightsMoveComp() == 500) && (checkTwoInDiagfPlayer() || checkTwoInDiagbPlayer()) && ((CellArr[0][1].getWeightsMoveComp() == 100) && (CellArr[1][0].getWeightsMoveComp() == 100) && (CellArr[2][1].getWeightsMoveComp() == 100) && (CellArr[1][2].getWeightsMoveComp() == 100))) {

            tempArrList = new ArrayList<>();
            pairXYArr = new Pair(0, 1);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 0);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 2);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(2, 1);
            tempArrList.add(pairXYArr);

            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsComp(800);

        } //computer has one in middle, and player has opposite corners, and c01,c10,c21,c12 are free
        else if ((CellArr[1][1].getWeightsMoveComp() == 500) && (checkSumWeightsRow0Comp() == -300 && checkSumWeightsRow2Comp() == -300 && checkSumWeightsCol0Comp() == -300 && checkSumWeightsCol2Comp() == -300) && (checkSumWeightsDiagfComp() == -500 || checkSumWeightsDiagbComp() == -500) && ((CellArr[0][1].getWeightsMoveComp() == 100) && (CellArr[1][0].getWeightsMoveComp() == 100) && (CellArr[2][1].getWeightsMoveComp() == 100) && (CellArr[1][2].getWeightsMoveComp() == 100))) {

            tempArrList = new ArrayList<>();
            pairXYArr = new Pair(0, 1);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 0);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 2);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(2, 1);
            tempArrList.add(pairXYArr);

            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsComp(800);

        } //random from N
        else {
            tempArrList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (CellArr[i][j].getCellState().equals(CellState.N.name())) {
                        pairXYArr = new Pair(i, j);

                        tempArrList.add(pairXYArr);

                    }
                }
            }
            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsComp(700);
        }

    }

    private void calcPriorCellsPlayer1() {

        // Priority2CellsPlayer1Arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                CellArr[i][j].setPriorCellsPlayer1(CellArr[i][j].getWeightsMoveComp());
            }
        }
        // sumWeightsRow0 Player1 has two cells in row0
        if (checkSumWeightsRow0Player1() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[0][j].getWeightsMoveComp() == 100) {
                    CellArr[0][j].setPriorCellsPlayer1(1000);
                    return;
                }
            }
        } // sumWeightsRow2 Player1 has two cells in row2
        else if (checkSumWeightsRow2Player1() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[2][j].getWeightsMoveComp() == 100) {
                    CellArr[2][j].setPriorCellsPlayer1(1000);
                    return;
                }
            }
        } // sumWeightsCol0 Player1 has two cells in col0
        else if (checkSumWeightsCol0Player1() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][0].getWeightsMoveComp() == 100) {
                    CellArr[i][0].setPriorCellsPlayer1(1000);
                    return;
                }
            }
        } // sumWeightsCol1 Player1 has two cells in col1
        else if (checkSumWeightsCol1Player1() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][1].getWeightsMoveComp() == 100) {
                    CellArr[i][1].setPriorCellsPlayer1(1000);
                    return;
                }
            }
        } // sumWeightsCol2 Player1 has two cells in col2
        else if (checkSumWeightsCol2Player1() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][2].getWeightsMoveComp() == 100) {
                    CellArr[i][2].setPriorCellsPlayer1(1000);
                    return;
                }
            }
        } // sumWeightsDiagf Player1 has two cells in Diagf
        else if (checkSumWeightsDiagfPlayer1() == -900) {
            if (CellArr[0][0].getWeightsMoveComp() == 100) {
                CellArr[0][0].setPriorCellsPlayer1(1000);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsPlayer1(1000);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[2][2].setPriorCellsPlayer1(1000);
            }

        } // sumWeightsDiagb Player1 has two cells in Diagb
        else if (checkSumWeightsDiagbPlayer1() == -900) {
            if (CellArr[0][2].getWeightsMoveComp() == 100) {
                CellArr[0][2].setPriorCellsPlayer1(1000);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsPlayer1(1000);
            } else if (CellArr[2][0].getWeightsMoveComp() == 100) {
                CellArr[2][0].setPriorCellsPlayer1(1000);
            }

        } // sumWeightsRow0 Pl1 has two cells in row0
        else if (checkSumWeightsRow0Player1() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[0][j].getWeightsMoveComp() == 100) {
                    CellArr[0][j].setPriorCellsPlayer1(900);
                    return;
                }
            }
        } // sumWeightsRow1 PL1 has two cells in row1
        else if (checkSumWeightsRow1Player1() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[1][j].getWeightsMoveComp() == 100) {
                    CellArr[1][j].setPriorCellsPlayer1(900);
                    return;
                }
            }
        } // sumWeightsRow2 PL1 has two cells in row2
        else if (checkSumWeightsRow2Player1() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[2][j].getWeightsMoveComp() == 100) {
                    CellArr[2][j].setPriorCellsPlayer1(900);
                    return;
                }
            }
        } // sumWeightsCol0 Pl1 has two cells in col0
        else if (checkSumWeightsCol0Player1() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][0].getWeightsMoveComp() == 100) {
                    CellArr[i][0].setPriorCellsPlayer1(900);
                    return;
                }
            }
        } // sumWeightsCol1 Pl1 has two cells in col1
        else if (checkSumWeightsCol1Player1() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][1].getWeightsMoveComp() == 100) {
                    CellArr[i][1].setPriorCellsPlayer1(900);
                    return;
                }
            }
        } // sumWeightsCol2 Pl1 has two cells in col2
        else if (checkSumWeightsCol2Player1() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][2].getWeightsMoveComp() == 100) {
                    CellArr[i][2].setPriorCellsPlayer1(900);
                    return;
                }
            }
        } // sumWeightsDiagf Pl1 has two cells in Diagf
        else if (checkSumWeightsDiagfPlayer1() == -900) {
            if (CellArr[0][0].getWeightsMoveComp() == 100) {
                CellArr[0][0].setPriorCellsPlayer1(900);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsPlayer1(900);
            } else if (CellArr[2][2].getWeightsMoveComp() == 100) {
                CellArr[2][2].setPriorCellsPlayer1(900);
            }

        } // sumWeightsDiagb Pl1 has two cells in Diagb
        else if (checkSumWeightsDiagbPlayer1() == -900) {
            if (CellArr[0][2].getWeightsMoveComp() == 100) {
                CellArr[0][2].setPriorCellsPlayer1(900);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsPlayer1(900);
            } else if (CellArr[2][0].getWeightsMoveComp() == 100) {
                CellArr[2][0].setPriorCellsPlayer1(900);
            }

        } //diagF = 100 and diagB=700
        else if (checkSumWeightsDiagfPlayer1() == 100 && checkSumWeightsDiagbPlayer1() == 700) {
            if (CellArr[0][1].getCellState().equals(CellState.N.name())) {
                CellArr[0][1].setPriorCellsPlayer1(800);

            } else if (CellArr[1][0].getCellState().equals(CellState.N.name())) {
                CellArr[1][0].setPriorCellsPlayer1(800);

            } else if (CellArr[1][2].getCellState().equals(CellState.N.name())) {
                CellArr[1][2].setPriorCellsPlayer1(800);

            } else if (CellArr[2][1].getCellState().equals(CellState.N.name())) {
                CellArr[2][1].setPriorCellsPlayer1(800);

            }

        } //diagF = 700 and diagB=100
        else if (checkSumWeightsDiagfPlayer1() == 700 && checkSumWeightsDiagbPlayer1() == 100) {
            if (CellArr[0][1].getCellState().equals(CellState.N.name())) {
                CellArr[0][1].setPriorCellsPlayer1(800);

            } else if (CellArr[1][0].getCellState().equals(CellState.N.name())) {
                CellArr[1][0].setPriorCellsPlayer1(800);

            } else if (CellArr[1][2].getCellState().equals(CellState.N.name())) {
                CellArr[1][2].setPriorCellsPlayer1(800);

            } else if (CellArr[2][1].getCellState().equals(CellState.N.name())) {
                CellArr[2][1].setPriorCellsPlayer1(800);

            }

        } //c00, c11, c22, c20, c02 is free
        else if ((comp.getPlayerQueue().equals(PlayerQueue.FIRST.name())) && (CellArr[1][1].getWeightsMoveComp() == 100) && (CellArr[0][0].getWeightsMoveComp() == 100) && (CellArr[2][2].getWeightsMoveComp() == 100) && (CellArr[0][2].getWeightsMoveComp() == 100) && (CellArr[2][0].getWeightsMoveComp() == 100)) {

            tempArrList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != 1 && j != 1) {
                        pairXYArr = new Pair(i, j);

                        tempArrList.add(pairXYArr);

                    }
                }
            }
            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer1(800);
        } // cell middle is taken by comp and cell 00 && c22 && c02 && c20 is free, and no two in row
        else if ((CellArr[1][1].getWeightsMoveComp() == 500) && (!checkTwoInRow()) && (CellArr[0][0].getWeightsMoveComp() == 100) && (CellArr[2][2].getWeightsMoveComp() == 100) && (CellArr[0][2].getWeightsMoveComp() == 100) && (CellArr[2][0].getWeightsMoveComp() == 100)) {
            tempArrList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != 1 && j != 1) {
                        pairXYArr = new Pair(i, j);

                        tempArrList.add(pairXYArr);

                    }
                }
            }
            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer1(800);

        } // comp has one cell in 00 or 22 or 02 or 20, and cell middle is free, and no two in row
        else if (((CellArr[0][0].getWeightsMoveComp() == 500) || (CellArr[2][2].getWeightsMoveComp() == 500) || (CellArr[0][2].getWeightsMoveComp() == 500) || (CellArr[2][0].getWeightsMoveComp() == 500)) && (CellArr[1][1].getWeightsMoveComp() == 100) && (!checkTwoInRow())) {
            CellArr[1][1].setPriorCellsPlayer1(800);

        } //player has one in middle, and comp has opposite corners, and no two in row
        else if ((CellArr[1][1].getWeightsMoveComp() == -500) && (!checkTwoInRow()) && (checkSumWeightsDiagfPlayer1() == 500 || checkSumWeightsDiagbPlayer1() == 500) && ((CellArr[0][1].getWeightsMoveComp() == 100) && (CellArr[1][0].getWeightsMoveComp() == 100) && (CellArr[2][1].getWeightsMoveComp() == 100) && (CellArr[1][2].getWeightsMoveComp() == 100))) {

            tempArrList = new ArrayList<>();
            pairXYArr = new Pair(0, 1);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 0);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 2);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(2, 1);
            tempArrList.add(pairXYArr);

            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer1(800);

        } //player has one in middle, and comp has opposite corners, and c01,c10,c21,c12 are free
        else if ((CellArr[1][1].getWeightsMoveComp() == -500) && (checkSumWeightsRow0Player1() == 700 && checkSumWeightsRow2Player1() == 700 && checkSumWeightsCol0Player1() == 700 && checkSumWeightsCol2Player1() == 700) && (checkSumWeightsDiagfPlayer1() == 500 || checkSumWeightsDiagbPlayer1() == 500) && ((CellArr[0][1].getWeightsMoveComp() == 100) && (CellArr[1][0].getWeightsMoveComp() == 100) && (CellArr[2][1].getWeightsMoveComp() == 100) && (CellArr[1][2].getWeightsMoveComp() == 100))) {

            tempArrList = new ArrayList<>();
            pairXYArr = new Pair(0, 1);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 0);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 2);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(2, 1);
            tempArrList.add(pairXYArr);

            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer1(800);

        } //random from N
        else {
            tempArrList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (CellArr[i][j].getCellState().equals(CellState.N.name())) {
                        pairXYArr = new Pair(i, j);

                        tempArrList.add(pairXYArr);

                    }
                }
            }
            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer1(700);
        }

    }

    private void calcPriorCellsPlayer2() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                CellArr[i][j].setPriorCellsPlayer2(CellArr[i][j].getWeightsMoveComp());
            }
        }
        // sumWeightsRow0 Player2 has two cells in row0
        if (checkSumWeightsRow0Player2() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[0][j].getWeightsMoveComp() == 100) {
                    CellArr[0][j].setPriorCellsPlayer2(1000);
                    return;
                }
            }
        } // sumWeightsRow2 Player2 has two cells in row2
        else if (checkSumWeightsRow2Player2() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[2][j].getWeightsMoveComp() == 100) {
                    CellArr[2][j].setPriorCellsPlayer2(1000);
                    return;
                }
            }
        } // sumWeightsCol0 Player2 has two cells in col0
        else if (checkSumWeightsCol0Player2() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][0].getWeightsMoveComp() == 100) {
                    CellArr[i][0].setPriorCellsPlayer2(1000);
                    return;
                }
            }
        } // sumWeightsCol1 Player2 has two cells in col1
        else if (checkSumWeightsCol1Player2() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][1].getWeightsMoveComp() == 100) {
                    CellArr[i][1].setPriorCellsPlayer2(1000);
                    return;
                }
            }
        } // sumWeightsCol2 Player2 has two cells in col2
        else if (checkSumWeightsCol2Player2() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][2].getWeightsMoveComp() == 100) {
                    CellArr[i][2].setPriorCellsPlayer2(1000);
                    return;
                }
            }
        } // sumWeightsDiagf Player2 has two cells in Diagf
        else if (checkSumWeightsDiagfPlayer2() == -900) {
            if (CellArr[0][0].getWeightsMoveComp() == 100) {
                CellArr[0][0].setPriorCellsPlayer2(1000);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsPlayer2(1000);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[2][2].setPriorCellsPlayer2(1000);
            }

        } // sumWeightsDiagb Player2 has two cells in Diagb
        else if (checkSumWeightsDiagbPlayer2() == -900) {
            if (CellArr[0][2].getWeightsMoveComp() == 100) {
                CellArr[0][2].setPriorCellsPlayer2(1000);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsPlayer2(1000);
            } else if (CellArr[2][0].getWeightsMoveComp() == 100) {
                CellArr[2][0].setPriorCellsPlayer2(1000);
            }

        } // sumWeightsRow0 Pl1 has two cells in row0
        else if (checkSumWeightsRow0Player2() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[0][j].getWeightsMoveComp() == 100) {
                    CellArr[0][j].setPriorCellsPlayer2(900);
                    return;
                }
            }
        } // sumWeightsRow1 PL1 has two cells in row1
        else if (checkSumWeightsRow1Player2() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[1][j].getWeightsMoveComp() == 100) {
                    CellArr[1][j].setPriorCellsPlayer2(900);
                    return;
                }
            }
        } // sumWeightsRow2 PL1 has two cells in row2
        else if (checkSumWeightsRow2Player2() == -900) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[2][j].getWeightsMoveComp() == 100) {
                    CellArr[2][j].setPriorCellsPlayer2(900);
                    return;
                }
            }
        } // sumWeightsCol0 Pl1 has two cells in col0
        else if (checkSumWeightsCol0Player2() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][0].getWeightsMoveComp() == 100) {
                    CellArr[i][0].setPriorCellsPlayer2(900);
                    return;
                }
            }
        } // sumWeightsCol1 Pl1 has two cells in col1
        else if (checkSumWeightsCol1Player2() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][1].getWeightsMoveComp() == 100) {
                    CellArr[i][1].setPriorCellsPlayer2(900);
                    return;
                }
            }
        } // sumWeightsCol2 Pl1 has two cells in col2
        else if (checkSumWeightsCol2Player2() == -900) {
            for (int i = 0; i < 3; i++) {
                if (CellArr[i][2].getWeightsMoveComp() == 100) {
                    CellArr[i][2].setPriorCellsPlayer2(900);
                    return;
                }
            }
        } // sumWeightsDiagf Pl1 has two cells in Diagf
        else if (checkSumWeightsDiagfPlayer2() == -900) {
            if (CellArr[0][0].getWeightsMoveComp() == 100) {
                CellArr[0][0].setPriorCellsPlayer2(900);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsPlayer2(900);
            } else if (CellArr[2][2].getWeightsMoveComp() == 100) {
                CellArr[2][2].setPriorCellsPlayer2(900);
            }

        } // sumWeightsDiagb Pl1 has two cells in Diagb
        else if (checkSumWeightsDiagbPlayer2() == -900) {
            if (CellArr[0][2].getWeightsMoveComp() == 100) {
                CellArr[0][2].setPriorCellsPlayer2(900);
            } else if (CellArr[1][1].getWeightsMoveComp() == 100) {
                CellArr[1][1].setPriorCellsPlayer2(900);
            } else if (CellArr[2][0].getWeightsMoveComp() == 100) {
                CellArr[2][0].setPriorCellsPlayer2(900);
            }

        } //diagF = 100 and diagB=700
        else if (checkSumWeightsDiagfPlayer2() == 100 && checkSumWeightsDiagbPlayer2() == 700) {
            if (CellArr[0][1].getCellState().equals(CellState.N.name())) {
                CellArr[0][1].setPriorCellsPlayer2(800);

            } else if (CellArr[1][0].getCellState().equals(CellState.N.name())) {
                CellArr[1][0].setPriorCellsPlayer2(800);

            } else if (CellArr[1][2].getCellState().equals(CellState.N.name())) {
                CellArr[1][2].setPriorCellsPlayer2(800);

            } else if (CellArr[2][1].getCellState().equals(CellState.N.name())) {
                CellArr[2][1].setPriorCellsPlayer2(800);

            }

        } //diagF = 700 and diagB=100
        else if (checkSumWeightsDiagfPlayer2() == 700 && checkSumWeightsDiagbPlayer2() == 100) {
            if (CellArr[0][1].getCellState().equals(CellState.N.name())) {
                CellArr[0][1].setPriorCellsPlayer2(800);

            } else if (CellArr[1][0].getCellState().equals(CellState.N.name())) {
                CellArr[1][0].setPriorCellsPlayer2(800);

            } else if (CellArr[1][2].getCellState().equals(CellState.N.name())) {
                CellArr[1][2].setPriorCellsPlayer2(800);

            } else if (CellArr[2][1].getCellState().equals(CellState.N.name())) {
                CellArr[2][1].setPriorCellsPlayer2(800);

            }

        } //c00, c11, c22, c20, c02 is free
        else if ((comp.getPlayerQueue().equals(PlayerQueue.FIRST.name())) && (CellArr[1][1].getWeightsMoveComp() == 100) && (CellArr[0][0].getWeightsMoveComp() == 100) && (CellArr[2][2].getWeightsMoveComp() == 100) && (CellArr[0][2].getWeightsMoveComp() == 100) && (CellArr[2][0].getWeightsMoveComp() == 100)) {

            tempArrList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != 1 && j != 1) {
                        pairXYArr = new Pair(i, j);

                        tempArrList.add(pairXYArr);

                    }
                }
            }
            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer2(800);
        } // cell middle is taken by comp and cell 00 && c22 && c02 && c20 is free, and no two in row
        else if ((CellArr[1][1].getWeightsMoveComp() == 500) && (!checkTwoInRow()) && (CellArr[0][0].getWeightsMoveComp() == 100) && (CellArr[2][2].getWeightsMoveComp() == 100) && (CellArr[0][2].getWeightsMoveComp() == 100) && (CellArr[2][0].getWeightsMoveComp() == 100)) {
            tempArrList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != 1 && j != 1) {
                        pairXYArr = new Pair(i, j);

                        tempArrList.add(pairXYArr);

                    }
                }
            }
            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer2(800);

        } // comp has one cell in 00 or 22 or 02 or 20, and cell middle is free, and no two in row
        else if (((CellArr[0][0].getWeightsMoveComp() == 500) || (CellArr[2][2].getWeightsMoveComp() == 500) || (CellArr[0][2].getWeightsMoveComp() == 500) || (CellArr[2][0].getWeightsMoveComp() == 500)) && (CellArr[1][1].getWeightsMoveComp() == 100) && (!checkTwoInRow())) {
            CellArr[1][1].setPriorCellsPlayer2(800);

        } //player has one in middle, and comp has opposite corners, and no two in row
        else if ((CellArr[1][1].getWeightsMoveComp() == -500) && (!checkTwoInRow()) && (checkSumWeightsDiagfPlayer2() == 500 || checkSumWeightsDiagbPlayer2() == 500) && ((CellArr[0][1].getWeightsMoveComp() == 100) && (CellArr[1][0].getWeightsMoveComp() == 100) && (CellArr[2][1].getWeightsMoveComp() == 100) && (CellArr[1][2].getWeightsMoveComp() == 100))) {

            tempArrList = new ArrayList<>();
            pairXYArr = new Pair(0, 1);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 0);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 2);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(2, 1);
            tempArrList.add(pairXYArr);

            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer2(800);

        } //player has one in middle, and comp has opposite corners, and c01,c10,c21,c12 are free
        else if ((CellArr[1][1].getWeightsMoveComp() == -500) && (checkSumWeightsRow0Player2() == 700 && checkSumWeightsRow2Player2() == 700 && checkSumWeightsCol0Player2() == 700 && checkSumWeightsCol2Player2() == 700) && (checkSumWeightsDiagfPlayer2() == 500 || checkSumWeightsDiagbPlayer2() == 500) && ((CellArr[0][1].getWeightsMoveComp() == 100) && (CellArr[1][0].getWeightsMoveComp() == 100) && (CellArr[2][1].getWeightsMoveComp() == 100) && (CellArr[1][2].getWeightsMoveComp() == 100))) {

            tempArrList = new ArrayList<>();
            pairXYArr = new Pair(0, 1);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 0);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(1, 2);
            tempArrList.add(pairXYArr);
            pairXYArr = new Pair(2, 1);
            tempArrList.add(pairXYArr);

            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer2(800);

        } //random from N
        else {
            tempArrList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (CellArr[i][j].getCellState().equals(CellState.N.name())) {
                        pairXYArr = new Pair(i, j);

                        tempArrList.add(pairXYArr);

                    }
                }
            }
            Random randomGener = new Random();
            int index = randomGener.nextInt(tempArrList.size());
            pairXYArr = tempArrList.get(index);
            CellArr[pairXYArr.getInt1()][pairXYArr.getInt2()].setPriorCellsPlayer2(700);
        }

    }

    private void calcSumWeightsMoveComp() {
        int sumWeightsRow0 = checkSumWeightsRow0Comp();
        int sumWeightsRow1 = checkSumWeightsRow1Comp();
        int sumWeightsRow2 = checkSumWeightsRow2Comp();
        int sumWeightsCol0 = checkSumWeightsCol0Comp();
        int sumWeightsCol1 = checkSumWeightsCol1Comp();
        int sumWeightsCol2 = checkSumWeightsCol2Comp();
        int sumWeightsDiagf = checkSumWeightsDiagfComp();
        int sumWeightsDiagb = checkSumWeightsDiagbComp();
    }

    private void calcSumWeightsMovePlayer1() {
        int sumWeightsRow0 = checkSumWeightsRow0Player1();
        int sumWeightsRow1 = checkSumWeightsRow1Player1();
        int sumWeightsRow2 = checkSumWeightsRow2Player1();
        int sumWeightsCol0 = checkSumWeightsCol0Player1();
        int sumWeightsCol1 = checkSumWeightsCol1Player1();
        int sumWeightsCol2 = checkSumWeightsCol2Player1();
        int sumWeightsDiagf = checkSumWeightsDiagfPlayer1();
        int sumWeightsDiagb = checkSumWeightsDiagbPlayer1();

    }

    private void calcSumWeightsMovePlayer2() {
        int sumWeightsRow0 = checkSumWeightsRow0Player2();
        int sumWeightsRow1 = checkSumWeightsRow1Player2();
        int sumWeightsRow2 = checkSumWeightsRow2Player2();
        int sumWeightsCol0 = checkSumWeightsCol0Player2();
        int sumWeightsCol1 = checkSumWeightsCol1Player2();
        int sumWeightsCol2 = checkSumWeightsCol2Player2();
        int sumWeightsDiagf = checkSumWeightsDiagfPlayer2();
        int sumWeightsDiagb = checkSumWeightsDiagbPlayer2();


    }


    private void setUpWeightsMoveComp() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[i][j] != null) {
                    switch (CellArr[i][j].getCellState()) {
                        case "N":
                            CellArr[i][j].setWeightsMoveComp(100);
                            break;
                        case "COMPTAKEN":
                            CellArr[i][j].setWeightsMoveComp(500);
                            break;
                        case "PL1TAKEN":
                            CellArr[i][j].setWeightsMoveComp(-500);
                            break;
                        case "PL2TAKEN":
                            CellArr[i][j].setWeightsMoveComp(-500);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    private void setUpAvailMovesPlayer1() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[i][j] != null) {
                    switch (CellArr[i][j].getCellState()) {
                        case "N":
                            CellArr[i][j].setMovePlayer1(CellState.PLAYER1.name());
                            break;
                        case "COMPTAKEN":
                            CellArr[i][j].setMovePlayer1(CellState.COMPTAKEN.name());
                            break;
                        case "PL1TAKEN":
                            CellArr[i][j].setMovePlayer1(CellState.PL1TAKEN.name());
                            break;
                        case "PL2TAKEN":
                            CellArr[i][j].setMovePlayer1(CellState.PL2TAKEN.name());
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    private void setUpAvailMovesComp() {
        //MoveCompArr = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[i][j] != null) {
                    switch (CellArr[i][j].getCellState()) {
                        case "N":
                            CellArr[i][j].setMoveComp(CellState.COMP.name());
                            break;
                        case "PL1TAKEN":
                            CellArr[i][j].setMoveComp(CellState.PL1TAKEN.name());
                            break;
                        case "COMPTAKEN":
                            CellArr[i][j].setMoveComp(CellState.COMPTAKEN.name());
                            break;
                        case "PL2TAKEN":
                            CellArr[i][j].setMoveComp(CellState.PL2TAKEN.name());
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    private void setUpAvailMovesPlayer2() {
        //MovePlayer2Arr = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (CellArr[i][j] != null) {
                    switch (CellArr[i][j].getCellState()) {
                        case "N":
                            CellArr[i][j].setMovePlayer2(CellState.PLAYER2.name());
                            break;
                        case "PL1TAKEN":
                            CellArr[i][j].setMovePlayer2(CellState.PL1TAKEN.name());
                            break;
                        case "COMPTAKEN":
                            CellArr[i][j].setMovePlayer2(CellState.COMPTAKEN.name());
                            break;
                        case "PL2TAKEN":
                            CellArr[i][j].setMovePlayer2(CellState.PL2TAKEN.name());
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }




    boolean checkNullToogleForPl1() {
        return (groupPlayer1.getSelectedToggle() == null) && ((groupPlayer2.getSelectedToggle() == null) || (groupComp.getSelectedToggle() == null));
    }

    boolean checkNullToogleForComp() {
        return (groupComp.getSelectedToggle() == null) && ((groupPlayer1.getSelectedToggle() == null) || (groupPlayer2.getSelectedToggle() == null));
    }

    boolean checkNullToogleForPl2() {
        return (groupPlayer2.getSelectedToggle() == null) && ((groupPlayer1.getSelectedToggle() == null) || (groupComp.getSelectedToggle() == null));
    }

    boolean checkNullGroupPlayer1Signs() {
        return groupPlayer1Signs.getSelectedToggle() == null;
    }

    boolean checkNullGroupPlayer2Signs() {
        return groupPlayer2Signs.getSelectedToggle() == null;
    }

    boolean checkNullGroupCompSigns() {
        return groupCompSign.getSelectedToggle() == null;
    }

    boolean checkNullGroupPlayer1() {
        return groupPlayer1.getSelectedToggle() == null;
    }

    boolean checkNullGroupPlayer2() {
        return groupPlayer2.getSelectedToggle() == null;
    }

    boolean checkNullGroupComp() {
        return groupComp.getSelectedToggle() == null;
    }

    void fireButtonComp() {
        if ((comp.getPlayerState().equals(PlayerState.IN_GAME.name())) && (comp.getPlayerQueue().equals(PlayerQueue.FIRST.name()))) {
            setUpAvailMovesComp();

            setUpWeightsMoveComp();

            calcSumWeightsMoveComp();

            calcPriorCellsComp();

            if (player1.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                calcPriorCellsPlayer1();

            }
            if (player2.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                calcPriorCellsPlayer2();

            }

            if (getXPriorCellsComp() != 5) {
                int i = getXPriorCellsComp();
                int j = getYPriorCellsComp();
                if (CellArr[i][j].getMoveComp().equals(PlayerName.COMP.name())) {
                    fireRowXComp = i;
                    fireColYComp = j;
                }

            } else if ((getXPriorCellsPlayer1() != 5) && (player1.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                int i = getXPriorCellsPlayer1();
                int j = getYPriorCellsPlayer1();
                if (CellArr[i][j].getMoveComp().equals(PlayerName.COMP.name())) {
                    fireRowXComp = i;
                    fireColYComp = j;
                }

            } else if ((getXPriorCellsPlayer2() != 5) && (player2.getPlayerState().equals(PlayerState.IN_GAME.name()))) {
                int i = getXPriorCellsPlayer2();
                int j = getYPriorCellsPlayer2();
                if (CellArr[i][j].getMoveComp().equals(PlayerName.COMP.name())) {
                    fireRowXComp = i;
                    fireColYComp = j;
                }

            }
        }

    }

    int getFireRowXComp() {
        return fireRowXComp;
    }

    int getfireColYComp() {
        return fireColYComp;
    }

    void setFireSign(String fireSign) {
        this.fireSign = fireSign;

    }

    String getCheckPlayersQueueAndReturnSign(int i, int j) {

        if ((player1.getPlayerState().equals(PlayerState.IN_GAME.name())) && (player1.getPlayerQueue().equals(PlayerQueue.FIRST.name())) && !(CellArr[i][j].getCellState().equals(CellState.FREE.name()))) {

            player1.setPlayerQueue(PlayerQueue.SECOND.name());
            addPlayerNametoCellState(PlayerName.PL1TAKEN.name(), i, j);
            addWeightNumPlayerToCell(i, j);
            calcSumWeightsMovePlayer1();

            setUpAvailMovesPlayer1();
            if (player2.getPlayerQueue().equals(PlayerQueue.SECOND.name()) && player2.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                player2.setPlayerQueue(PlayerQueue.FIRST.name());
            } else if (comp.getPlayerQueue().equals(PlayerQueue.SECOND.name()) && comp.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                comp.setPlayerQueue(PlayerQueue.FIRST.name());
            }

            if (player1.getPlayerSign() != null) {
                switch (player1.getPlayerSign()) {
                    case "X_SIGN":
                        returnPlayerSign = player1.getPlayerSign();
                        return returnPlayerSign;
                    case "O_SIGN":
                        returnPlayerSign = player1.getPlayerSign();
                        return returnPlayerSign;
                    case "T_SIGN":
                        returnPlayerSign = player1.getPlayerSign();
                        return returnPlayerSign;
                    default:
                        break;
                }
            }

        } else if ((player2.getPlayerState().equals(PlayerState.IN_GAME.name())) && (player2.getPlayerQueue().equals(PlayerQueue.FIRST.name())) && !CellArr[i][j].getCellState().equals(CellState.FREE.name())) {

            player2.setPlayerQueue(PlayerQueue.SECOND.name());
            addPlayerNametoCellState(PlayerName.PL2TAKEN.name(), i, j);
            addWeightNumPlayerToCell(i, j);
            calcSumWeightsMovePlayer2();

            setUpAvailMovesPlayer2();
            if (player1.getPlayerQueue().equals(PlayerQueue.SECOND.name()) && player1.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                player1.setPlayerQueue(PlayerQueue.FIRST.name());
            } else if (comp.getPlayerQueue().equals(PlayerQueue.SECOND.name()) && comp.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                comp.setPlayerQueue(PlayerQueue.FIRST.name());
            }

            if (player2.getPlayerSign() != null) {
                switch (player2.getPlayerSign()) {
                    case "PLUS_SIGN":
                        returnPlayerSign = player2.getPlayerSign();
                        return returnPlayerSign;
                    case "Q_SIGN":
                        returnPlayerSign = player2.getPlayerSign();
                        return returnPlayerSign;
                    case "V_SIGN":
                        returnPlayerSign = player2.getPlayerSign();
                        return returnPlayerSign;
                    default:
                        break;
                }
            }
        } else if ((comp.getPlayerState().equals(PlayerState.IN_GAME.name())) && (comp.getPlayerQueue().equals(PlayerQueue.FIRST.name())) && !CellArr[i][j].getCellState().equals(CellState.FREE.name())) {

            comp.setPlayerQueue(PlayerQueue.SECOND.name());
            addPlayerNametoCellState(PlayerName.COMPTAKEN.name(), i, j);
            addWeightNumPlayerToCell(i, j);
            calcSumWeightsMoveComp();

            setUpAvailMovesComp();

            if (player1.getPlayerQueue().equals(PlayerQueue.SECOND.name()) && player1.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                player1.setPlayerQueue(PlayerQueue.FIRST.name());
            } else if (player2.getPlayerQueue().equals(PlayerQueue.SECOND.name()) && player2.getPlayerState().equals(PlayerState.IN_GAME.name())) {
                player2.setPlayerQueue(PlayerQueue.FIRST.name());
            }

            if (comp.getPlayerSign() != null) {
                switch (comp.getPlayerSign()) {
                    case "AT_SIGN":
                        returnPlayerSign = comp.getPlayerSign();
                        return returnPlayerSign;
                    case "HASH_SIGN":
                        returnPlayerSign = comp.getPlayerSign();
                        return returnPlayerSign;
                    case "H_SIGN":
                        returnPlayerSign = comp.getPlayerSign();
                        return returnPlayerSign;
                    default:
                        break;
                }
            }
        }
        return returnPlayerSign;
    }

    boolean checkActivePlayer1HaveSign() {
        return (!player1.getPlayerSign().equals("N")) && ((!comp.getPlayerSign().equals("N")) || (!player2.getPlayerSign().equals("N")));
    }

    boolean checkActivePlayer2HaveSign() {
        return (!player2.getPlayerSign().equals("N")) && ((!comp.getPlayerSign().equals("N")) || (!player1.getPlayerSign().equals("N")));
    }

    void trigglePlayer1SignButton() {
        groupPlayer1Signs = new ToggleGroup();

        if (fireSign != null) {
            switch (fireSign) {
                case "K01":
                    player1.setPlayerSign("X_SIGN");

                    return;
                case "K02":
                    player1.setPlayerSign("O_SIGN");

                    return;
                case "K03":
                    player1.setPlayerSign("T_SIGN");

                    break;
                default:
                    break;
            }
        }
    }

    void trigglePlayer2SignButton() {
        groupPlayer2Signs = new ToggleGroup();

        if (fireSign != null) {
            switch (fireSign) {
                case "K11":
                    player2.setPlayerSign("PLUS_SIGN");

                    return;
                case "K12":
                    player2.setPlayerSign("Q_SIGN");

                    return;
                case "K13":
                    player2.setPlayerSign("V_SIGN");

                    break;
                default:
                    break;
            }
        }
    }

    void triggleCompSignButton() {
        groupCompSign = new ToggleGroup();

        if (fireSign != null) {
            switch (fireSign) {
                case "K21":
                    comp.setPlayerSign("HASH_SIGN");

                    return;
                case "K22":
                    comp.setPlayerSign("AT_SIGN");

                    return;
                case "K23":
                    comp.setPlayerSign("H_SIGN");

                    break;
                default:
                    break;
            }
        }
    }

    void initPlayer1() {
        player1 = new Player();
        if (!checkNullToogleForComp() || !checkNullToogleForPl2()) {
            player1.setPlayerQueue(PlayerQueue.SECOND.name());
        } else {
            player1.setPlayerQueue(PlayerQueue.FIRST.name());
        }

        groupPlayer1 = new ToggleGroup();
        player1.setPlayerName(PlayerName.PLAYER1.name());
        player1.setPlayerState(PlayerState.IN_GAME.name());
        player1.setPlayerTurn(PlayerTurn.P_START.name());

    }

    void initComp() {
        comp = new Player();
        if (!checkNullToogleForPl1() || !checkNullToogleForPl2()) {
            comp.setPlayerQueue(PlayerQueue.SECOND.name());
        } else {
            comp.setPlayerQueue(PlayerQueue.FIRST.name());
        }
        groupComp = new ToggleGroup();
        comp.setPlayerName(PlayerName.COMP.name());
        comp.setPlayerState(PlayerState.IN_GAME.name());
        comp.setPlayerTurn(PlayerTurn.P_START.name());

    }

    void initPlayer2() {
        player2 = new Player();
        if (!checkNullToogleForComp() || !checkNullToogleForPl1()) {
            player2.setPlayerQueue(PlayerQueue.SECOND.name());
        } else {
            player2.setPlayerQueue(PlayerQueue.FIRST.name());
        }

        groupPlayer2 = new ToggleGroup();
        player2.setPlayerName(PlayerName.PLAYER2.name());
        player2.setPlayerState(PlayerState.IN_GAME.name());
        player2.setPlayerTurn(PlayerTurn.P_START.name());

    }

    boolean checkThreeInRow() {
        int sumPlayersRow0 = 0;
        int sumPlayersRow1 = 0;
        int sumPlayersRow2 = 0;
        int sumPlayersCol0 = 0;
        int sumPlayersCol1 = 0;
        int  sumPlayersCol2 = 0;
        int sumPlayersDiagF = 0;
        int sumPlayersDiagB = 0;

        for (int j = 0; j < 3; j++) {
            int row0 = CellArr[0][j].getWeightNumPlayers();
            int row1 = CellArr[1][j].getWeightNumPlayers();
            int row2 = CellArr[2][j].getWeightNumPlayers();
            sumPlayersRow0 = sumPlayersRow0 + row0;
            sumPlayersRow1 = sumPlayersRow1 + row1;
            sumPlayersRow2 = sumPlayersRow2 + row2;

            if (sumPlayersRow0 == 15 || sumPlayersRow0 == 60 || sumPlayersRow0 == 300) {
                return true;
            }

            if (sumPlayersRow1 == 15 || sumPlayersRow1 == 60 || sumPlayersRow1 == 300) {
                return true;
            }

            if (sumPlayersRow2 == 15 || sumPlayersRow2 == 60 || sumPlayersRow2 == 300) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            int col0 = CellArr[i][0].getWeightNumPlayers();
            int col1 = CellArr[i][1].getWeightNumPlayers();
            int col2 = CellArr[i][2].getWeightNumPlayers();
            sumPlayersCol0 = sumPlayersCol0 + col0;
            sumPlayersCol1 = sumPlayersCol1 + col1;
            sumPlayersCol2 = sumPlayersCol2 + col2;

            if (sumPlayersCol0 == 15 || sumPlayersCol0 == 60 || sumPlayersCol0 == 300) {
                return true;
            }

            if (sumPlayersCol1 == 15 || sumPlayersCol1 == 60 || sumPlayersCol1 == 300) {
                return true;
            }

            if (sumPlayersCol2 == 15 || sumPlayersCol2 == 60 || sumPlayersCol2 == 300) {

                return true;
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {

                    int diagf = CellArr[i][j].getWeightNumPlayers();
                    sumPlayersDiagF = sumPlayersDiagF + diagf;

                    if (sumPlayersDiagF == 15 || sumPlayersDiagF == 60 || sumPlayersDiagF == 300) {
                        return true;
                    }
                }

                if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) {
                    int diagb = CellArr[i][j].getWeightNumPlayers();
                    sumPlayersDiagB = sumPlayersDiagB + diagb;
                    if (sumPlayersDiagB == 15 || sumPlayersDiagB == 60 || sumPlayersDiagB == 300) {
                        return true;
                    }
                }

            }
        }
        return false;

    }

    private boolean checkTwoInRow() {
        int sumPlayersRow0 = 0;
        int sumPlayersRow1 = 0;
        int sumPlayersRow2 = 0;
        int sumPlayersCol0 = 0;
        int sumPlayersCol1 = 0;
        int sumPlayersCol2 = 0;
        int  sumPlayersDiagF = 0;
        int sumPlayersDiagB = 0;

        for (int j = 0; j < 3; j++) {
            int row0 = CellArr[0][j].getWeightNumPlayers();
            int row1 = CellArr[1][j].getWeightNumPlayers();
            int row2 = CellArr[2][j].getWeightNumPlayers();
            sumPlayersRow0 = sumPlayersRow0 + row0;
            sumPlayersRow1 = sumPlayersRow1 + row1;
            sumPlayersRow2 = sumPlayersRow2 + row2;

            if (sumPlayersRow0 == 10 || sumPlayersRow0 == 40 || sumPlayersRow0 == 200) {
                return true;
            }

            if (sumPlayersRow1 == 10 || sumPlayersRow1 == 40 || sumPlayersRow1 == 200) {
                return true;
            }

            if (sumPlayersRow2 == 10 || sumPlayersRow2 == 40 || sumPlayersRow2 == 200) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            int col0 = CellArr[i][0].getWeightNumPlayers();
            int col1 = CellArr[i][1].getWeightNumPlayers();
            int col2 = CellArr[i][2].getWeightNumPlayers();
            sumPlayersCol0 = sumPlayersCol0 + col0;
            sumPlayersCol1 = sumPlayersCol1 + col1;
            sumPlayersCol2 = sumPlayersCol2 + col2;

            if (sumPlayersCol0 == 10 || sumPlayersCol0 == 40 || sumPlayersCol0 == 200) {
                return true;
            }

            if (sumPlayersCol1 == 10 || sumPlayersCol1 == 40 || sumPlayersCol1 == 200) {
                return true;
            }

            if (sumPlayersCol2 == 10 || sumPlayersCol2 == 40 || sumPlayersCol2 == 200) {
                return true;
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {

                    int diagf = CellArr[i][j].getWeightNumPlayers();
                    sumPlayersDiagF = sumPlayersDiagF + diagf;

                    if (sumPlayersDiagF == 10 || sumPlayersDiagF == 40 || sumPlayersDiagF == 200) {
                        return true;
                    }
                }

                if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) {
                    int diagb = CellArr[i][j].getWeightNumPlayers();
                    sumPlayersDiagB = sumPlayersDiagB + diagb;
                    if (sumPlayersDiagB == 10 || sumPlayersDiagB == 40 || sumPlayersDiagB == 200) {
                        return true;
                    }
                }

            }
        }
        return false;

    }



    private boolean checkTwoInDiagfPlayer() {
        int sumPlayersDiagF = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    int diagf = CellArr[i][j].getWeightNumPlayers();
                    sumPlayersDiagF = sumPlayersDiagF + diagf;

                    if (sumPlayersDiagF == 10 || sumPlayersDiagF == 40) {
                        return true;
                    }
                }

            }
        }

        return false;

    }

    private boolean checkTwoInDiagbPlayer() {
        int sumPlayersDiagB = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) {
                    int diagb = CellArr[i][j].getWeightNumPlayers();
                    sumPlayersDiagB = sumPlayersDiagB + diagb;
                    if (sumPlayersDiagB == 10 || sumPlayersDiagB == 40) {
                        return true;
                    }
                }

            }
        }

        return false;

    }




    private int  checkSumPlayersRow0(){
        int sumPlayersRow0 = 0;
        for (int j = 0; j < 3; j++) {
            int row0 = CellArr[0][j].getWeightNumPlayers();
            sumPlayersRow0 = sumPlayersRow0 + row0;
        }
        return sumPlayersRow0;
    }

    private int checksumPlayersRow1(){
        int sumPlayersRow1 = 0;
        for (int j = 0; j < 3; j++) {
            int row1 = CellArr[1][j].getWeightNumPlayers();
            sumPlayersRow1 = sumPlayersRow1 + row1;
        }
        return sumPlayersRow1;
    }

    private int checkSumPlayersRow2(){
        int sumPlayersRow2 = 0;
        for (int j = 0; j < 3; j++) {
            int row2 = CellArr[2][j].getWeightNumPlayers();
            sumPlayersRow2 = sumPlayersRow2 + row2;
        }
        return sumPlayersRow2;
    }

    private int checkSumPlayersCol0(){
        int sumPlayersCol0 = 0;
        for (int i = 0; i < 3; i++) {
            int col0 = CellArr[i][0].getWeightNumPlayers();
            sumPlayersCol0 = sumPlayersCol0 + col0;
        }
        return sumPlayersCol0;
    }

    private int checkSumPlayersCol1(){
        int sumPlayersCol1 = 0;
        for (int i = 0; i < 3; i++) {
            int col1 = CellArr[i][1].getWeightNumPlayers();
            sumPlayersCol1 = sumPlayersCol1 + col1;
        }
        return sumPlayersCol1;
    }

    private int checkSumPlayersCol2(){
        int sumPlayersCol2 = 0;
        for (int i = 0; i < 3; i++) {
            int col2 = CellArr[i][2].getWeightNumPlayers();
            sumPlayersCol2 = sumPlayersCol2 + col2;
        }
        return sumPlayersCol2;
    }

    private int checkSumPlayersDiagF(){
        int sumPlayersDiagF = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    int diagf = CellArr[i][j].getWeightNumPlayers();
                    sumPlayersDiagF = sumPlayersDiagF + diagf;
                }
            }
        }
        return sumPlayersDiagF;
    }

    private int checkSumPlayersDiagB(){
        int sumPlayersDiagB = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) {
                    int diagb = CellArr[i][j].getWeightNumPlayers();
                    sumPlayersDiagB = sumPlayersDiagB + diagb;
                }
            }
        }
        return sumPlayersDiagB;
    }

    private int checkSumWeightsRow0Comp(){
        int sumWeightsRow0 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsRow0 = CellArr[0][j].getWeightsMoveComp();
            sumWeightsRow0 = AsumWeightsRow0 + sumWeightsRow0;
        }
        return sumWeightsRow0;
    }

    private int checkSumWeightsRow1Comp(){
        int sumWeightsRow1=0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsRow1 = CellArr[1][j].getWeightsMoveComp();
            sumWeightsRow1 = AsumWeightsRow1 + sumWeightsRow1;
        }
        return sumWeightsRow1;
    }

    private int checkSumWeightsRow2Comp(){
        int sumWeightsRow2=0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsRow2 = CellArr[2][j].getWeightsMoveComp();
            sumWeightsRow2 = AsumWeightsRow2 + sumWeightsRow2;
        }
        return sumWeightsRow2;
    }


    private int checkSumWeightsCol0Comp(){
        int sumWeightsCol0 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsCol0 = CellArr[j][0].getWeightsMoveComp();
            sumWeightsCol0 = AsumWeightsCol0 + sumWeightsCol0;
        }
        return sumWeightsCol0;
    }

    private int checkSumWeightsCol1Comp(){
        int sumWeightsCol1 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsCol1 = CellArr[j][1].getWeightsMoveComp();
            sumWeightsCol1 = AsumWeightsCol1 + sumWeightsCol1;
        }
        return sumWeightsCol1;
    }

    private int checkSumWeightsCol2Comp(){
        int sumWeightsCol2 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsCol2 = CellArr[j][2].getWeightsMoveComp();
            sumWeightsCol2 = AsumWeightsCol2 + sumWeightsCol2;
        }
        return sumWeightsCol2;
    }

    private int checkSumWeightsDiagfComp(){
        return CellArr[0][0].getWeightsMoveComp() + CellArr[1][1].getWeightsMoveComp() + CellArr[2][2].getWeightsMoveComp();
    }

    private int checkSumWeightsDiagbComp(){
        return CellArr[0][2].getWeightsMoveComp() + CellArr[1][1].getWeightsMoveComp() + CellArr[2][0].getWeightsMoveComp();
    }



    private int checkSumWeightsRow0Player1(){
        int sumWeightsRow0 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsRow0 = CellArr[0][j].getWeightsMovePlayer1();
            sumWeightsRow0 = AsumWeightsRow0 + sumWeightsRow0;
        }
        return sumWeightsRow0;
    }

    private int checkSumWeightsRow1Player1(){
        int sumWeightsRow1=0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsRow1 = CellArr[1][j].getWeightsMovePlayer1();
            sumWeightsRow1 = AsumWeightsRow1 + sumWeightsRow1;
        }
        return sumWeightsRow1;
    }

    private int checkSumWeightsRow2Player1(){
        int sumWeightsRow2=0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsRow2 = CellArr[2][j].getWeightsMovePlayer1();
            sumWeightsRow2 = AsumWeightsRow2 + sumWeightsRow2;
        }
        return sumWeightsRow2;
    }


    private int checkSumWeightsCol0Player1(){
        int sumWeightsCol0 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsCol0 = CellArr[j][0].getWeightsMovePlayer1();
            sumWeightsCol0 = AsumWeightsCol0 + sumWeightsCol0;
        }
        return sumWeightsCol0;
    }

    private int checkSumWeightsCol1Player1(){
        int sumWeightsCol1 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsCol1 = CellArr[j][1].getWeightsMovePlayer1();
            sumWeightsCol1 = AsumWeightsCol1 + sumWeightsCol1;
        }
        return sumWeightsCol1;
    }

    private int checkSumWeightsCol2Player1(){
        int sumWeightsCol2 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsCol2 = CellArr[j][2].getWeightsMovePlayer1();
            sumWeightsCol2 = AsumWeightsCol2 + sumWeightsCol2;
        }
        return sumWeightsCol2;
    }

    private int checkSumWeightsDiagfPlayer1(){
        return CellArr[0][0].getWeightsMovePlayer1() + CellArr[1][1].getWeightsMovePlayer1() + CellArr[2][2].getWeightsMovePlayer1();
    }

    private int checkSumWeightsDiagbPlayer1(){
        return CellArr[0][2].getWeightsMovePlayer1() + CellArr[1][1].getWeightsMovePlayer1() + CellArr[2][0].getWeightsMovePlayer1();
    }



    private int checkSumWeightsRow0Player2(){
        int sumWeightsRow0 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsRow0 = CellArr[0][j].getWeightsMovePlayer2();
            sumWeightsRow0 = AsumWeightsRow0 + sumWeightsRow0;
        }
        return sumWeightsRow0;
    }

    private int checkSumWeightsRow1Player2(){
        int sumWeightsRow1=0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsRow1 = CellArr[1][j].getWeightsMovePlayer2();
            sumWeightsRow1 = AsumWeightsRow1 + sumWeightsRow1;
        }
        return sumWeightsRow1;
    }

    private int checkSumWeightsRow2Player2(){
        int sumWeightsRow2=0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsRow2 = CellArr[2][j].getWeightsMovePlayer2();
            sumWeightsRow2 = AsumWeightsRow2 + sumWeightsRow2;
        }
        return sumWeightsRow2;
    }


    private int checkSumWeightsCol0Player2(){
        int sumWeightsCol0 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsCol0 = CellArr[j][0].getWeightsMovePlayer2();
            sumWeightsCol0 = AsumWeightsCol0 + sumWeightsCol0;
        }
        return sumWeightsCol0;
    }

    private int checkSumWeightsCol1Player2(){
        int sumWeightsCol1 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsCol1 = CellArr[j][1].getWeightsMovePlayer2();
            sumWeightsCol1 = AsumWeightsCol1 + sumWeightsCol1;
        }
        return sumWeightsCol1;
    }

    private int checkSumWeightsCol2Player2(){
        int sumWeightsCol2 =0;
        for (int j = 0; j < 3; j++) {
            int AsumWeightsCol2 = CellArr[j][2].getWeightsMovePlayer2();
            sumWeightsCol2 = AsumWeightsCol2 + sumWeightsCol2;
        }
        return sumWeightsCol2;
    }

    private int checkSumWeightsDiagfPlayer2(){
        return CellArr[0][0].getWeightsMovePlayer2() + CellArr[1][1].getWeightsMovePlayer2() + CellArr[2][2].getWeightsMovePlayer2();
    }

    private int checkSumWeightsDiagbPlayer2(){
        return CellArr[0][2].getWeightsMovePlayer2() + CellArr[1][1].getWeightsMovePlayer2() + CellArr[2][0].getWeightsMovePlayer2();
    }


    void checkWhowWins() {
        winPlayer1 = false;
        winPlayer2 = false;
        winComp = false;
        if (checkSumPlayersRow0() == 15
                || checksumPlayersRow1() == 15
                || checkSumPlayersRow2() == 15
                || checkSumPlayersCol0() == 15
                || checkSumPlayersCol1() == 15
                || checkSumPlayersCol2() == 15
                || checkSumPlayersDiagF() == 15
                || checkSumPlayersDiagB() == 15) {
            sumWinPlayer1 = sumWinPlayer1 + 1;

            winPlayer1 = true;
            winPlayer2 = false;
            winComp = false;
        }

        if (checkSumPlayersRow0() == 60
                || checksumPlayersRow1() == 60
                || checkSumPlayersRow2() == 60
                || checkSumPlayersCol0() == 60
                || checkSumPlayersCol1() == 60
                || checkSumPlayersCol2() == 60
                || checkSumPlayersDiagF() == 60
                || checkSumPlayersDiagB() == 60) {
            sumWinPlayer2 = sumWinPlayer2 + 1;

            winPlayer1 = false;
            winPlayer2 = true;
            winComp = false;
        }

        if (checkSumPlayersRow0() == 300
                || checksumPlayersRow1() == 300
                || checkSumPlayersRow2() == 300
                || checkSumPlayersCol0() == 300
                || checkSumPlayersCol1() == 300
                || checkSumPlayersCol2() == 300
                || checkSumPlayersDiagF() == 300
                || checkSumPlayersDiagB() == 300) {
            sumWinComp = sumWinComp + 1;

            winPlayer1 = false;
            winPlayer2 = false;
            winComp = true;
        }

    }

    /*

      @author Jacek Byzdra email: jacekbwwa@gmail.com
     */
}
