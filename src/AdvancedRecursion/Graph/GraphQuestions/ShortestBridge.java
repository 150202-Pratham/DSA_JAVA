package AdvancedRecursion.Graph.GraphQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    public static class Pair{
        int row ;
        int col ;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int  checkShortestBridge(int [][]grid , int i , int j){
        int count = 0 ;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        grid[i][j] = 2 ;

        while(!q.isEmpty()){
            Pair p = q.poll() ;
            int []dr = {-1 ,1,0,0} ;
            int []dc = {0,0,-1,1} ;

            for(int k = 0 ; k<4 ; k++){
                int nr = p.row + dr[k] ;
                int nc = p.col + dc[k] ;
                if(grid[nr][nc]==1) return count ;

                if(nr>=0 && nr<grid.length &&  nc>=0 && nc<grid[0].length && grid[nr][nc]==0){
                    q.add(new Pair(nr,nc));
                    grid[nr][nc] = 2;
                    count++;

                }
            }
        }

        return 0 ;


    }
    public static int shortestBridge(int[][] grid) {
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[i].length ; j++){
                if(grid[i][j]==1){
                    checkShortestBridge(grid , i ,j );


                }
            }
        }

        return 0 ;

    }
    public static void main(String[] args) {
        int [][] grid = {{0,1} , {1,0}} ;
        System.out.println(shortestBridge(grid));





    }
}
