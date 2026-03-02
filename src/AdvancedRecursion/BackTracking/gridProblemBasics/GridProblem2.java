package AdvancedRecursion.BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GridProblem2 {

//    In this Question we are moving in the direction of the Horizontal , vertical , Diagonal
    public static List<String> printPath(int row , int col , String current){

        if(row==1 && col==1){
            List<String> result = new ArrayList<>() ;
            result.add(current) ;

            return result ;

        }




        List<String> result = new ArrayList<>() ;

        if(row>1){
          result.addAll(printPath(row-1 , col , current+"H") );

        }


        if(col>1){
            result.addAll( printPath(row , col-1 , current+"V")) ;
        }
        return result ;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        int row = sc.nextInt() ;
        int col = sc.nextInt() ;

        System.out.println(printPath(row,col,""));


    }
}
