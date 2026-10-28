package AdvancedRecursion.BackTracking.gridProblemBasics.nqueens;

import java.util.ArrayList;
import java.util.List;

public class NQueen {

    public static  List<List<String>> result = new ArrayList<>() ;

    public static List<List<String>> solveNQueens (int n){

        boolean [][] board = new boolean[n][n];
        queen(board , 0) ;
        return result ;

    }

    public static void queen(boolean [][]board , int row){

        if(row==board.length){
            result.add(construct(board)) ;

        }

        for(int col = 0 ; col<board.length ; col++){

            if(isSafe(board, row , col)){

                board[row][col] = true ;
                queen(board , row+1);
                board[row][col] = false ;

            }

        }
    }

    public static boolean isSafe(boolean [][]board , int row , int col){

//        Safety to Check Every Row
         for(int i = 0 ; i<row ; i++){
             if(board[i][col]) return false  ;
         }

//         Check Left Diagonal

        int maxLeft = Math.min(row , col) ;
         for(int i = 1 ; i<=maxLeft ; i++){

             if(board[row-i][col-i]){
                 return false ;
             }
         }

//         Now this is the Condition for finding in Right Diagonal

         int maxRight = Math.min(row , board.length-col-1) ;
         for(int i = 1 ;i<=maxRight ; i++){
             if(board[row-i][col+i]){
                 return false ;

             }
         }


        return true ;
    }

    public static List<String> construct (boolean [][]board){

        List<String> result = new ArrayList<>() ;

        for(boolean[]row :board){
            StringBuilder sb = new StringBuilder();
            for(boolean c : row){

                sb.append( c ? 'Q' : '.') ;

            }

            result.add(sb.toString()) ;
        }

        return result ;

    }
}
