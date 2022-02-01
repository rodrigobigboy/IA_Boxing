package com.company;
public class Game {

    Boxer Player1, Player2;
    String results;
    int[][] points = new int[12][2];

    public Game(Boxer player1, Boxer player2, String results, int[][] points) {
        Player1 = player1;
        Player2 = player2;
        this.results = results;
        this.points = points;
    }

    public Boxer getPlayer1() {
        return Player1;
    }

    public void setPlayer1(Boxer player1) {
        Player1 = player1;
    }

    public Boxer getPlayer2() {
        return Player2;
    }

    public void setPlayer2(Boxer player2) {
        Player2 = player2;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public int[][] getPoints() {
        return points;
    }

    public void setPoints(int[][] points) {
        this.points = points;
    }

}