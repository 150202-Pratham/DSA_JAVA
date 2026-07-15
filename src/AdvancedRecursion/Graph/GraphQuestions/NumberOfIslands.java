package AdvancedRecursion.Graph.GraphQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    static boolean [][] visited;
    public static void findIslands(char [][]arr , int row , int col){

        Queue<int[]>queue = new LinkedList<>() ;
        visited[row][col] = true ;
        queue.offer(new int[]{row , col}) ;

        int []dr = {1 ,-1 ,0 ,0} ;
        int []dc = {0 , 0 ,1 ,-1} ;

        while(!queue.isEmpty()){

            int []inter = queue.poll() ;
            for(int i = 0 ; i<4 ; i++){
                int nr = inter[0]+ dr[i];
                int nc = inter[1]+ dc[i] ;

                if(nr>=0 && nr<row && nc>=0 && nc<col && arr[nr][nc]=='1'&& !visited[nr][nc] ){
                    visited[nr][nc] = true ;
                    queue.offer(new int[]{nr, nc}) ;
                }



            }


        }
     }
    public static int printIslands(char [][]arr){
        int islands =0 ;
        visited = new boolean[arr.length][arr[0].length];
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ;j<arr[i].length ; j++){
                if(arr[i][j]=='1' && !visited[i][j]){
                    findIslands(arr ,i , j ) ;
                    islands++ ;

                }
            }
        }
        return islands;
    }
    public  static void main(String []args){
        char [][]arr= {
                {'1','1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        int value = printIslands(arr) ;
        System.out.println(value);
    }
}
