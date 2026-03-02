package AdvancedRecursion.BackTracking;

public class RatInMaze {
    public static void traceBack(boolean [][]maze , int row , int col , String st){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.print(st +" ");
            return ;

        }

        if(!maze[row][col]){
            return  ;
        }
        maze[row][col] = false ;

        if(row<maze.length-1){
            traceBack(maze,row+1,col,st+"D");
        }
        if(row>0){
            traceBack(maze , row -1 , col , st+"U") ;
        }
        if(col<maze[0].length-1){
            traceBack(maze , row , col +1 , st+"R") ;

        }
        if(col>0){
            traceBack(maze , row , col -1 , st+"L") ;
        }

        maze[row][col] = true ;

    }
    public static void main(String []args){

        boolean [][]maze = {{true, true , true},
                {true , true , true},
                {true , true , true}
        };

        traceBack(maze , 0 , 0 , "") ;



    }
}
