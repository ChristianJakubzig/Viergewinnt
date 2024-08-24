package Viergewinnt.model;

public class Player {
    private Boolean player1Turn;
    private Boolean player2Turn;

    public Player(){
        this.player1Turn = true;
        this.player2Turn = false;
    }

    public Boolean getPlayer1Turn(){
        return player1Turn;
    }

    public void setPlayer1Turn(boolean update){
        this.player1Turn = update;
    }
}
