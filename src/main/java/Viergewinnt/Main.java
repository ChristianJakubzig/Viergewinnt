package Viergewinnt;

import Viergewinnt.controller.Inputhandler;
import Viergewinnt.model.Board;
import Viergewinnt.model.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.gameRunning();
    }
}