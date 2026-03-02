package AdvancedRecursion.BackTracking;

import java.util.ArrayList;

public class PractiseDay3 {
    public static ArrayList<String> findPath(int row , int col , boolean [][]maze , String current){

        if(row==maze.length-1 && col==maze[0].length-1){
            ArrayList<String> result = new ArrayList<>() ;

            result.add(current);

            return result ;


        }

        if(!maze[row][col]){
            return new ArrayList<>() ;
        }
        maze[row][col] = false ;
        ArrayList<String> output = new ArrayList<>() ;

        if(row<maze.length-1){
            output.addAll(findPath(row+1 , col , maze , current+"D" ));

        }
        if(row>0){
            output.addAll(findPath(row-1 , col , maze , current+"U")) ;

        }
        if(col<maze[0].length-1){
            output.addAll(findPath(row , col+1 , maze , current+"R"));

        }
        if(col>0){
            output.addAll(findPath(row , col-1 , maze , current+"L")) ;

        }

        maze[row][col] = true ;



        return output ;


    }
    public static void main(String []args){

        boolean [][] maze = {{true , true , true},
                {true , true , true},
                {true , true , true}
        };


        System.out.println(findPath(0 , 0 , maze , ""));

    }
}
