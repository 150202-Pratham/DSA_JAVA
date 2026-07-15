package AdvancedRecursion.Graph.GraphQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves {
    public static class Pair{
        int row;
        int col ;

        public Pair(int row, int col){
            this.row = row;
            this.col = col;

        }
    }
    public static void convertToWater(int [][]arr , int row , int col , Queue<Pair> queue){
        queue.offer(new Pair(row,col)) ;
        arr[row][col] = 0 ;
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            int []dr = {-1,1,0,0} ;
            int []dc = {0 , 0,-1,1} ;

            for(int i = 0 ; i<4 ; i++){
                int nr =  p.row + dr[i];
                int nc = p.col + dc[i];

                if(nr>=0 && nr<row && nc>=0 && nc<col && arr[nr][nc] == 1) {
                    queue.offer(new Pair(nr,nc)) ;
                    arr[nr][nc] = 0 ;

                }
            }
        }
    }
    public static void main (String []args){
        int [][]arr = {{0,0,0,0},{1,0,1,0}, {0,1,1,0} , {0,0,0,0}} ;
        Queue<Pair> queue = new LinkedList<>();
        int m =  arr.length;
        int n = arr[0].length;
        for(int i = 0 ; i<m ; i++){
            if(arr[i][0]==1) convertToWater(arr, i , 0, queue) ;
            if(arr[i][n-1]==1) convertToWater(arr,i,n-1,queue) ;

        }
        for(int j = 0 ; j<n ; j++){
            if(arr[0][j]==1) convertToWater(arr, 0 , j , queue);
            if(arr[m-1][j]==1) convertToWater(arr,m-1 , j , queue) ;

        }

        int count = 0 ;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(arr[i][j]==1) count++;

            }
        }
        System.out.println(count);

    }
}
