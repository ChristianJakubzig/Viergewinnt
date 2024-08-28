package Viergewinnt.model;

public class Board {

    private Player player;
    private final String[][] Board = new String[6][7];

    public Board() {
        this.player = new Player();
    }

    public void setStone(int inputColumn) {
        for (int i = Board.length - 1; i >= 0; i--) {
            if (Board[i][inputColumn] == null && player.getPlayer1Turn()) {
                Board[i][inputColumn] = "X";
                player.setPlayer1Turn(false);
                break;
            } else if (Board[i][inputColumn] == null && !player.getPlayer1Turn()) {
                Board[i][inputColumn] = "O";
                player.setPlayer1Turn(true);
                break;
            }
        }
    }

    public Boolean boardFull(int inputColumn) {
        for (int i = Board.length - 1; i >= 0; i--) {
            if (Board[0][inputColumn] != null) {
                return true;
            }
        }
        return false;
    }

    public Boolean winningCondition() {
        for (int i = 0; i <= Board.length - 4; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                if (Board[i][j] != null &&
                        Board[i][j].equals(Board[i + 1][j]) &&
                        Board[i][j].equals(Board[i + 2][j]) &&
                        Board[i][j].equals(Board[i + 3][j])) {
                    return true;
                }
            }
        }
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length - 4; j++) {
                if (Board[i][j] != null &&
                        Board[i][j].equals(Board[i][j + 1]) &&
                        Board[i][j].equals(Board[i][j + 2]) &&
                        Board[i][j].equals(Board[i][j + 3])) {
                    return true;
                }
            }
        }
        for (int i = 0; i <= Board.length - 4; i++) {
            for (int j = 0; j <= Board[i].length - 4; j++) {
                if (Board[i][j] != null &&
                        Board[i][j].equals(Board[i + 1][j + 1]) &&
                        Board[i][j].equals(Board[i + 2][j + 2]) &&
                        Board[i][j].equals(Board[i + 3][j + 3])) {
                    return true;
                }
            }
        }
        for (int i = 0; i <= Board.length - 4; i++) {
            for (int j = 3; j < Board[i].length; j++) {
                if (Board[i][j] != null &&
                        Board[i][j].equals(Board[i + 1][j - 1]) &&
                        Board[i][j].equals(Board[i + 2][j - 2]) &&
                        Board[i][j].equals(Board[i + 3][j - 3])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                if (Board[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(Board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
