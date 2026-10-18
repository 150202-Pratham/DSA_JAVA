package AdvancedRecursion.BackTracking.gridProblemBasics;

public class SudokuSolver<T> {

    public boolean solve(T [][]board){


        for(int i = 0 ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){


            }
        }
        return true ;

    }
    public boolean isSafe( T [][]board , int row , int col , T num){

//        Check For Row

        for(int j = 0 ; j<9 ; j++){

            if(board[row][j]== num){
                return false ;

            }
        }

//        Check for Column

        for(int i = 0 ; i<9 ; i++){

            if(board[i][col]==num){
                return false;

            }
        }

//        Check the Entire 3x3 submatrix

        int startRow = (row/3)*3 ;
        int startCol = (col/3)*3 ;

        for(int i = startRow ; i<startRow+3 ; i++){

            for(int j = startCol ; j<startCol+3 ; j++){

                if(board[i][j]==num){
                    return false ;

                }
            }
        }


        return true ;

    }
}
