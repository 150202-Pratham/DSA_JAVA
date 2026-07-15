package AdvancedRecursion.BackTracking.gridProblemBasics;

import java.util.Scanner;

public class GridProblem1 {
//    In this Question we need to count the Number of paths it will take to make the Rat Move
    public static int countPath(int row , int col){

        if(row==1 || col==1){
            return 1 ;

        }

        int leftCount = countPath(row-1 , col) ;

        int rightCount = countPath(row , col-1) ;

       return leftCount+rightCount ;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in) ;

        int row = sc.nextInt() ;
        int col = sc.nextInt() ;

        System.out.println(countPath(row , col)) ;

    }
}
