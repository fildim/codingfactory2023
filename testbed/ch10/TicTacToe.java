package testbed.ch10;

import java.util.Scanner;

public class TicTacToe {

    public static Scanner sc = new Scanner(System.in);
    public static int rows = 3;
    public static int columns = 3;
    public static char[][] board = new char[rows][columns];
    public static char currentPlayer = 'x';

    public static void main(String[] args) {

        initializeBoard();

        System.out.println("Welcome to the game!");

        do {

            try {
                updateBoard();
            } catch (Exception e) {
                System.out.println("Please insert a valid number input");
                sc.nextLine();
                continue;
            }


            printBoard();

            if (checkForWinner()) {

                System.out.println("We have a winner! Congratulations!");
                break;
            }

            if (isBoardFull()) {

                System.out.println("We have a draw!");
                break;
            }

            changePlayer();
        } while (true);


    }


    /**
     * Set all positions of the board to blank
     */
    public static void initializeBoard() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = ' ';
            }
        }
    }


    public static void printBoard() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("| " + board[i][j] + " |");
            }
            System.out.println();
        }
    }


    public static boolean isBoardFull() {

        boolean isFull = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (board[i][j] == ' ') {
                    isFull = false;
                }
            }
        }

        return isFull;
    }


    public static boolean checkForWinner() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    /**
     * checks if there is a win in a row
     * @return
     *          true if there is a win, false otherwise
     */
    public static boolean checkRows() {

        boolean check = false;

        for (int i = 0; i< rows; i++) {

            if ( (board[i][0] != ' ') && ( board[i][0] == board[i][1]) && ( board[i][0] == board[i][2])) {
                check = true;
            }
        }

        return check;
    }


    public static boolean checkColumns() {

        boolean check = false;

        for (int i = 0; i < columns; i++) {

            if ( ( board[0][i] != ' ') && ( board[0][i] == board[1][i]) && ( board[0][i] == board[2][i]) ) {
                check = true;
            }
        }

        return check;
    }


    public static boolean checkDiagonals() {

        boolean check = false;

        if (    (( board[0][0] != ' ') && ( board[0][0] == board[1][1]) && ( board[0][0] == board[2][2]) )
                ||
                ( (board[0][2] != ' ') && ( board[0][2] == board[1][1]) && ( board[0][2] == board[2][0]) )
            ) {

            check = true;
        }

        return check;
    }


    public static void changePlayer() {
        currentPlayer = (currentPlayer == 'x') ? 'o' : 'x';
    }



    public static void updateBoard() {

        boolean validInput = false;

        do {

            if (currentPlayer == 'x') {
                System.out.println("Player 'X', enter your move: ");
            } else {
                System.out.println("Player 'O', enter your move: ");
            }

            System.out.print("Insert row :");
            int row = sc.nextInt() - 1;
            System.out.print("Insert column :");
            int col = sc.nextInt() - 1;

            if ( ( row >= 0) && ( row < rows) && ( col >= 0) && ( col < columns) && ( board[row][col] == ' ' ) ) {

                board[row][col] = currentPlayer;
                validInput = true;

            } else {

                System.out.println("The move at (" + (row + 1) + ", " + (col + 1) + ") is not valid. Please choose another move");
            }
        } while (!validInput);
    }

}