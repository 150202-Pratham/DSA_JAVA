package AdvancedRecursion.BackTracking.gridProblemBasics.SudokuGeneric;

public class Main {

    public static void main(String[] args) {

        Character [][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        SudokuRules<Character> rules = new CharacterSudokuRules(9);
        SudokuSolver<Character> solver = new SudokuSolver<>(rules) ;


        System.out.println("Board Before Sudoku");
        printBoard(board) ;

        boolean solved = solver.solve(board) ;

        if(solved){
            System.out.println("SudokuSolved");
            printBoard(board) ;

        }
        else {
            System.out.println("\nNo solution exists.");
        }


    }

    private static void printBoard(Character[][] board) {

        for (int i = 0; i < board.length; i++) {

            if (i > 0 && i % 3 == 0) {
                System.out.println("------+-------+------");
            }

            for (int j = 0; j < board[i].length; j++) {

                if (j > 0 && j % 3 == 0) {
                    System.out.print("| ");
                }

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
