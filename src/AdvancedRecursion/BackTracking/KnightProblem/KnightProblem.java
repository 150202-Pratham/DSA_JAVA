package AdvancedRecursion.BackTracking.KnightProblem;

import java.util.Scanner;

public class KnightProblem {
    public static void knight(boolean[][]board , int row , int col , int knights){

        if(knights==0){
            display(board) ;
            return ;
        }
        if(col==board[0].length){
            knight(board , row+1 , 0 , knights);
            return ;
        }

        if(row==board.length){
            return ;
        }

        if(isSafe(board , row , col)){
            board[row][col] = true ;
            knight(board , row , col+1 , knights-1) ;
            board[row][col]  = false ;
        }

        knight(board , row , col+1 , knights) ;
    }

    public static boolean isSafe(boolean [][]board , int row , int col ){
        if(isValid(board , row-2 , col-1)){
            if(board[row-2][col-1]) return false ;

        }
        if(isValid(board , row-1 , col-2)){
            if(board[row-1][col-2]) return false ;

        }
        if(isValid(board , row-2 , col+1 )){
            if(board[row-2][col+1]) return false ;
        }
        if(isValid(board , row-1 , col+2)){
            if(board[row-1][col+2]) return false ;
        }
        return true ;


    }

    public static boolean isValid(boolean[][]board , int row , int col){
        if(row>=0 && row<board.length && col>=0 && col<board[0].length){
            return true;


        }
        else{
            return false;

        }

    }

    public static void display(boolean [][] board){
        for(boolean []row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("_ ");

                }
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        boolean [][]board = new boolean[n][n] ;

         knight(board,0 , 0 , n);


    }

}
