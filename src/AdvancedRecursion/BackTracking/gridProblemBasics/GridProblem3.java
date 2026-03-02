package AdvancedRecursion.BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GridProblem3 {
//    This is an optimized code for Grid Path Problem with Movement in Direction Diagonal , and Horizonatal and Vertical
   public static List<String> printPath(int row , int col , String current){
       if(row ==1 && col==1){
           List<String> result = new ArrayList<>() ;
           result.add(current) ;
           return result ;


       }

       List<String> output =  new ArrayList<>() ;

       if(row>1){
           output.addAll(printPath(row-1, col, current+"H")) ;
       }
       if(row >1 && col >1){
           output.addAll(printPath(row -1 , col -1, current+"D")) ;
       }
       if(col>1){
           output.addAll(printPath(row, col-1, current+"V")) ;
       }

       return output;

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int row = sc.nextInt() ;
        int col = sc.nextInt() ;

        System.out.println(printPath(row , col, ""));
    }
}
