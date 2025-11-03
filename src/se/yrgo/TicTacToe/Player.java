package se.yrgo.TicTacToe;

public class Player {
    private String name;
    private int roundsPlayed;
    private int highScore; // antal vinster
    private String playerMarker; // X eller O

    public Player(String name, String playerMarker) {
        if (name == null || name.trim().isEmpty()) {
            name = "Spelare";
        }
        this.name = name.trim();
        this.roundsPlayed = 0;
        this.highScore = 0;
        this.playerMarker = playerMarker;
    }

    public String getName() {
        return name;
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public int getHighScore() {
        return highScore;
    }

    public String getMarker() {
        return playerMarker;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            name = "Spelare";
        }
        this.name = name.trim();
    }

    public void setRoundsPlayed(int roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    public void addRound() {
        roundsPlayed++;
    }

    public void addWin() {
        highScore++;
    }

    @Override
    public String toString() {
        return name + " (" + playerMarker + ") - Omgångar: " + roundsPlayed + ", Vinster: " + highScore;
    }
}










