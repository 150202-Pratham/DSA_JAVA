package AdvancedRecursion.BackTracking;

public class GridProblem5 {
//    this is a Simulation to learn all the Paths and core behind BackTracking
//    this will tell how simulation works for Rat in Maze Problem
    public static void backTrack(boolean [][]maze , int row , int col , StringBuilder st){

        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(st.toString() +" ");
        }

        if(!maze[row][col]){
            return ;
        }

        if(row<maze.length-1){
            backTrack(maze , row+1 , col , st.append("D")) ;

        }
        if(row>0){
            backTrack(maze , row-1 , col , st.append("U") ) ;

        }
        if(col<maze[0].length-1){
            backTrack(maze, row , col+1 , st.append("R")) ;

        }
        if(col>0){
            backTrack(maze, row , col-1 , st.append("L")) ;
        }

    }
    public static void main(String[] args) {

        boolean [][]maze = {{true , true , true},
                {true , true , true},
                {true , true , true}
        };
        backTrack(maze , 0 , 0 , new StringBuilder());

    }

}


//This Code will Surely throw a Stack OverFlow Error but Why it is throwing

//the Correct Answer to it is because it is getting back to the Base Condition nd infinite paths can be possible to it
