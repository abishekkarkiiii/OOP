package Tic_Tac_Toe;

import java.util.Scanner;




// Class representing the player

// Main class to run the game
public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");

        // Create players
        System.out.print("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name, 'X');

        System.out.print("Enter Player 2 name: ");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name, 'O');

        Board board = new Board();
        Player currentPlayer = player1;

        while (true) {
            board.display();
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();

            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                if (board.checkWin(currentPlayer.getSymbol())) {
                    board.display();
                    System.out.println("Congratulations " + currentPlayer.getName() + "! You win!");
                    break;
                }
                if (board.isFull()) {
                    board.display();
                    System.out.println("It's a draw!");
                    break;
                }
                // Switch player
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }
}
