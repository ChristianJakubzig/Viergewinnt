package Viergewinnt.model;

import Viergewinnt.controller.Inputhandler;

public class Game {
    private Boolean running;
    private Board board;
    private Inputhandler inputhandler;
    private Player player;

    public Game() {
        this.running = true;
        this.board = new Board();
        this.inputhandler = new Inputhandler();
        this.player = new Player();
    }

    public void gameRunning() {
        while (running) {
            board.setStone(inputhandler.userColumn());
            board.printBoard();
            if (board.boardFull(inputhandler.getInputColumn())) {
                running = false;
            }
        }
    }
}
