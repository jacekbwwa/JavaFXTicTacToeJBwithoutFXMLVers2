package com;

import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Jacek Byzdra email: jacekbwwa@gmail.com
 */
class Player {

    private String playerName = PlayerName.N.name();
    private String playerSign = PlayerName.N.name();
    private String playerState = PlayerName.N.name();
    private String playerQueue = PlayerName.N.name();
    private ToggleGroup groupPlayerSigns;
    private ToggleGroup groupPlayer;
    private String playerTurn;
    private int sumWin;

    public Player() {

    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    String getPlayerSign() {
        return playerSign;
    }

    void setPlayerSign(String playerSign) {
        this.playerSign = playerSign;
    }

    void setPlayerTurn(String playerTurn) {
        this.playerTurn = playerTurn;
    }

    String getPlayerState() {
        return playerState;
    }

    void setPlayerState(String playerState) {
        this.playerState = playerState;
    }

    String getPlayerQueue() {  //
        return playerQueue;
    }

    void setPlayerQueue(String playerQueue) {
        this.playerQueue = playerQueue;
    }

    protected void setGroupPlayer(ToggleGroup groupPlayer) {
        this.groupPlayer = groupPlayer;
    }

    protected void setGroupPlayerSigns(ToggleGroup groupPlayerSigns) {
        this.groupPlayerSigns = groupPlayerSigns;
    }

    protected void setSumWin(int sumWin) {
        this.sumWin = sumWin;
    }

    /*

      @author Jacek Byzdra email: jacekbwwa@gmail.com
     */
}
