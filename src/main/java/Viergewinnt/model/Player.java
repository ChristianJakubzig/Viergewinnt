package Viergewinnt.model;

public class Player {
    private Boolean player1Turn;

    public Player(){
        this.player1Turn = true;
    }

    public Boolean getPlayer1Turn(){
        return player1Turn;
    }
}
