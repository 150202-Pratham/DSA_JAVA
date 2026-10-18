package UCA.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CountPaths {

    public static int countPaths(int row , int col){

        if(row==1 &&  col==1){
            return 1 ;

        }
        int totalPaths= 0 ;

        if(row>1){
            totalPaths += countPaths(row-1 , col) ;
        }
        if(col>1){
            totalPaths += countPaths(row , col-1) ;

        }

        return totalPaths ;
    }

    public static List<String> findPaths(int row , int col , String path){

        List<String> paths = new ArrayList<>() ;

        if(row==1 && col==1){
            paths.add(path) ;

        }

        if(row > 1){
            paths.addAll(findPaths(row-1 , col , path+'D')) ;

        }
        if(col > 1){
            paths.addAll(findPaths(row , col-1 , path+'R' )) ;

        }

        return paths ;


    }

    public static List<String> findPathsDiagonal( int row , int col , String path){
        List<String> paths = new ArrayList<>() ;

        if(row==1 && col==1){
            paths.add(path) ;

        }

        if(row>1){
            paths.addAll( findPathsDiagonal(row -1 , col , path+'R')) ;
        }

        if(col > 1){
            paths.addAll(findPathsDiagonal(row , col-1, path+'C')) ;
        }

        if(row>1 && col>1){
            paths.addAll(findPathsDiagonal(row-1 , col-1 , path+"D")) ;

        }

        return paths ;

    }

   public static List<String> findPathsWithObstruction( boolean [][]maze , int row , int col , String path){
        List<String> paths = new ArrayList<>();
       if(row >= maze.length || col >= maze[0].length){
           return paths ;

       }
       if(!maze[row][col]){
           return paths;
       }
        if(row==maze.length-1 &&  col==maze[0].length-1){
            paths.add(path) ;
            return paths;

        }

        if(row<maze.length-1){
            paths.addAll(findPathsWithObstruction( maze , row+1 , col , path+"H")) ;
        }
        if(col<maze[0].length-1){
            paths.addAll(findPathsWithObstruction( maze , row , col+1 , path+"V")) ;
        }

        if(row<maze.length-1 && col<maze[0].length-1){
            paths.addAll(findPathsWithObstruction(maze , row+1 , col+1 , path+"D")) ;
        }

        return paths ;


    }

    public static void main(String[] args) {

//         Count the Total Number of Paths

        System.out.println(countPaths(4 , 4)) ;

//        When there are 2 Directions Right and Down

        System.out.println(findPaths(3,3,"").toString());

//        When there are 3 Directions , Right , Down and Diagonal ;

        System.out.println(findPathsDiagonal(3,3, "").toString()) ;

//        when there is obstruction in path;

        boolean[][] maze = {{true, true, true} , {true , false , true} , {true , true , true}} ;

        System.out.println(findPathsWithObstruction(maze, 0,0,""));





    }

}
