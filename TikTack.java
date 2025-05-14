import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TikTack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char player = 'o';
        char[][] bord = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        while (true) {
            printBoard(bord);
            System.out.println("please enter position player (" + player + ")");
            int position = scanner.nextInt();



            if(position < 1 || position > 9) {
                System.out.println("Invalid option: position must be between 1 and 9");
                continue;
            }
            // position = 5
            position = position - 1;
            int row = position / 3;
            // 1
            int col = position % 3;
            if(bord[row][col] != ' ') {
                System.out.println("You can not override this position it's already played");
                continue;
            }

            bord[row][col] = player;

            if(isWinner(bord, player)) {
                System.out.println("Congratulations("+ player+")! You won!");
                break;
            }

            if(isBoardFull(bord)) {
                System.out.println("Congratulations! You lost!");
                break;
            }

            if(player == 'o') {
                player = 'x';
            }else {
                player = 'o';
            }

        }


    }



    static boolean isBoardFull(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }


    static boolean isWinner(char[][] board, char currentPlayer) {
        // Rows, Columns, Diagonals'

        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer &&
                    board[i][1] == currentPlayer &&
                    board[i][2] == currentPlayer) ||

                    (board[0][i] == currentPlayer &&
                            board[1][i] == currentPlayer &&
                            board[2][i] == currentPlayer)) {
                return true;
            }
        }

        return (board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer) ||

                (board[0][2] == currentPlayer &&
                        board[1][1] == currentPlayer &&
                        board[2][0] == currentPlayer);
    }

    static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (char[] row : board) {
            System.out.print("| ");
            for (char cell : row) {
                System.out.print(cell + " | ");
            }
            System.out.println("\n-------------");
        }
    }
}