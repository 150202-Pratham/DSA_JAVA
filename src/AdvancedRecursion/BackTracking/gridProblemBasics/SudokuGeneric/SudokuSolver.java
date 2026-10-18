package AdvancedRecursion.BackTracking.gridProblemBasics.SudokuGeneric;

public class SudokuSolver<T> {

    public final SudokuRules<T> rules ;

    public SudokuSolver(SudokuRules<T> rules){
        this.rules = rules ;

    }

    public boolean solve(T[][]board){

        for(int row = 0 ; row<board.length  ; row++ ){
            for(int col = 0 ; col<board[row].length ; col++){

                if(rules.isEmpty(board[row][col])){

                    for(T candidate : rules.candidates()){

                        if(rules.isSafe(board ,row,col,candidate)){

                            board[row][col] = candidate ;

                            if(solve(board)) return true ;

                            board[row][col] = null ;

                        }

                    }

                    return false ;
                }
            }
        }

        return true ;

    }





}
