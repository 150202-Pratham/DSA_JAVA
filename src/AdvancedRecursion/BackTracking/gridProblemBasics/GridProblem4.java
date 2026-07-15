package AdvancedRecursion.BackTracking.gridProblemBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GridProblem4 {
//    Grid Path Problem to Print Path in Horizontal and Vertical along with the obstacle

    public static List<String> printPath(boolean [][]maze , int row , int col , String current){

        if(row==maze.length-1 && col==maze[0].length-1){
            List<String> list = new ArrayList<>() ;
            list.add(current)  ;
            return list ;
        }
        if(maze[row][col]==false){
            return new ArrayList<>() ;
        }

        List<String> output = new ArrayList<>() ;

        if(row<maze.length-1){
           output.addAll( printPath(maze , row+1 , col , current+"D"));

        }
        if(col<maze[0].length-1){
           output.addAll( printPath(maze , row , col+1 , current+"R"));

        }

        return output ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        boolean [][]maze =
                {{true,true,true},
                {true , false , true},
                {true , true , true}} ;

        int row = sc.nextInt() ;
        int col = sc.nextInt() ;

        System.out.println(printPath(maze , 0, 0 , "")) ;







    }


}
