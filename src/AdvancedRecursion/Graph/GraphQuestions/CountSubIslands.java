package AdvancedRecursion.Graph.GraphQuestions;


import java.util.LinkedList;
import java.util.Queue;

public class CountSubIslands {
    public static class Pair{
        int row ;
        int col ;

        public Pair(int row, int col){
            this.row = row ;
            this.col = col ;
        }
    }

    public static boolean checkConverterBFS(int [][] grid1 , int[][]grid2 , int row , int col){
        Queue<Pair> queue = new LinkedList<>() ;

        queue.offer(new Pair(row , col)) ;
        grid2[row][col] = 0 ;

        boolean isSubIsland = true ;

        if(grid1[row][col]==0){
            isSubIsland = false ;
        }
        int [] dr = {-1,1,0,0} ;
        int [] dc = {0,0,-1,1} ;

        while(!queue.isEmpty()){
            Pair pair = queue.poll();

            for(int i = 0 ; i<4 ;i++){
                int nr = pair.row+dr[i] ;
                int nc = pair.col+dc[i] ;

                if(nr>=0 && nr<grid2.length && nc>=0 && nc<grid2[0].length && grid2[nr][nc]==1){
                    if(grid1[nr][nc]==0){
                        isSubIsland = false ;
                    }
                    grid2[nr][nc] = 0 ;
                    queue.offer(new Pair(nr, nc)) ;

                }

            }

        }

        return isSubIsland ;

    }
    public static void main(String[] args) {
        int [][]grid1 = {{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}} ;
        int [][]grid2 = {{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}} ;

        int count = 0 ;

        for(int i = 0 ; i<grid2.length ; i++){
            for(int j = 0 ; j<grid2[i].length ; j++){
                if(grid2[i][j]==1){
                    if(checkConverterBFS(grid1 , grid2 , i , j )) {
                        count++;

                    }

                }
            }
        }

        System.out.println(count);
    }
}
