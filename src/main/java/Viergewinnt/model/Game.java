package Viergewinnt.model;

import Viergewinnt.controller.Inputhandler;

public class Game {
    private Boolean running;
    private Board board;
    private Inputhandler inputhandler;

    public Game(){
        this.running = true;
        this.board = new Board();
        this.inputhandler = new Inputhandler();
    }

    public void gameRunning(){
        while (running){
            board.setStone(inputhandler.userColumn());
            board.printBoard();
            if (board.boardFull(inputhandler.getInputColumn())){ //hier ist der Fehler -> es wird hier nochmal nach einer eingabe gefragt anstatt das ergebnis zu nutzen
                running = false;
            }
        }
    }
}
