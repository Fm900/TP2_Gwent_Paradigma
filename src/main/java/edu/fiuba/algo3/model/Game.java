package edu.fiuba.algo3.model;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;

    public Game(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }
    public void startGame(){
        //rondas
    }
    public Player getPlayer1() {
        return player1;
    }
    public Player getPlayer2() {
        return player2;
    }
    public Board getBoard() {
        return board;
    }


}
