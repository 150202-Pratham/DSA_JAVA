package AdvancedRecursion.Graph.GraphQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridgeApproach2 {
    public static class Pair{
        int row;
        int col;
        int dis ;
        public Pair(int row, int col, int dis) {
            this.row = row;
            this.col = col;
            this.dis = dis;


        }
    }
    public static int largeIsland(int [][]grid){
        Queue<Pair> queue = new LinkedList<>() ;
        int []dr = {-1,1,0,0} ;
        int []dc = {0,0,-1,1} ;


        boolean found = false ;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(!found && grid[i][j]==1){
                    makeConnectOne(grid , queue ,i , j, dr, dc) ;
                    found = true ;

                }
            }
        }

        return flippBits(grid , queue , dr,dc) ;




    }
    public static void makeConnectOne(int[][] grid, Queue<Pair> queue, int row, int col, int []dr , int []dc){
        Queue<Pair> q = new  LinkedList<>() ;
        q.add(new Pair(row ,col , 0)) ;
        grid[row][col] = 2 ;
        while(!q.isEmpty()){
            Pair p = q.poll() ;
            queue.offer(new Pair(p.row , p.col , p.dis )) ;

            for(int i = 0 ; i<4 ; i++){
                int nr = dr[i]+p.row ;
                int nc = dc[i]+p.col ;

                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                    q.add(new Pair(nr , nc , p.dis)) ;
                    grid[nr][nc] = 2 ;
                }
            }

        }
    }

    public static int flippBits(int[][] grid, Queue<Pair> queue, int []dr , int []dc){
        while(!queue.isEmpty()){
            Pair p = queue.poll() ;

            for(int i = 0 ; i<4 ; i++){
                int nr = dr[i]+p.row ;
                int nc = dc[i]+p.col ;

                if(nr<0 || nr>=grid.length || nc<0 || nc>=grid[0].length){
                    continue ;
                }
                if(grid[nr][nc]==1){
                    return p.dis ;

                }

                if(grid[nr][nc]==0) {
                    queue.offer(new Pair(nr , nc , p.dis+1)) ;
                    grid[nr][nc] = 2 ;

                }
            }
        }

        return -1;

    }
    public static void main(String []args){
        int [][] grid = {{0,1} , {1,0}} ;
        System.out.println(largeIsland(grid)) ;



    }
}
