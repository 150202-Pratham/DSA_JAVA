package AdvancedRecursion.BackTracking.gridProblemBasics.SudokuGeneric;

import java.util.ArrayList;
import java.util.List;

public class CharacterSudokuRules implements SudokuRules<Character>{

    private final int n ;
    private final int boxSize ;
    private final List<Character> values ;

    public CharacterSudokuRules(int n){

        int size = (int)Math.sqrt(n) ;

        if(n<=0 || size*size !=n  || n>9){
            throw new IllegalArgumentException("Character Sudoku requires a perfect square size from 1 to 9");
        }
        this.n = n ;
        this.boxSize = size ;
        this.values = new ArrayList<>() ;

        for(char ch = '1' ; ch <'1'+n ; ch++){
            values.add(ch) ;
        }


    }

    @Override
    public boolean isEmpty(Character value) {

        return value==null || value=='.' ;

    }

    @Override
    public List<Character> candidates() {
        return values ;

    }

    @Override
    public boolean isSafe(Character[][] board, int row, int col, Character candidate) {

//        For Rows
        for(int i = 0 ; i<n ; i++){

            if(candidate.equals(board[row][i])){
                return false ;

            }
        }

//        For Columns

        for(int i = 0 ; i<n ; i++){

            if(candidate.equals(board[i][col])){
                return false ;

            }
        }

//        For the Entire 3x3 box

        int startRow = (row/boxSize)*boxSize ;
        int startCol = (col/boxSize)*boxSize ;

        for(int i = startRow ; i<startRow+boxSize ; i++){
            for(int j = startCol ; j<startCol+boxSize ; j++){

                if(candidate.equals(board[i][j])){
                    return false ;
                }
            }
        }


        return true ;

    }
}
