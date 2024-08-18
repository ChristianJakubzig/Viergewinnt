package Viergewinnt.model;

public class Board {

    private String[][] Board = new String[6][7];

    public void setStone(int inputColumn){
        for (int i = Board.length -1; i >= 0; i--) {
            if (Board[i][inputColumn] == null){
                Board[i][inputColumn] = "X";
                break;
            }
        }
    }

    public Boolean boardFull(int inputColumn){
        for (int i = Board.length - 1; i >= 0 ; i--) {
            if (Board[0][inputColumn] != null){
                return true;
            }
        }
        return false;
    }

    public void printBoard(){
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                if (Board[i][j] == null){
                    System.out.print("- ");
                }else {
                    System.out.print(Board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
