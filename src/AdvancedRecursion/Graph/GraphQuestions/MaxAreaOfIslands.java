package AdvancedRecursion.Graph.GraphQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIslands {
    public static int countIslands(int [][]arr , int row , int col , boolean [][]isVisited){
        int count = 0 ;

        Queue<int[]> queue = new LinkedList<>() ;
        queue.add(new int[]{row , col}) ;
        isVisited[row][col] = true ;

        int []dr = {1,-1, 0 , 0} ;
        int []dc = {0 , 0 , 1 , -1} ;

        while(!queue.isEmpty()){
            int []brr = queue.poll() ;
            for(int i = 0 ; i<4 ; i++){
                int nr = brr[0]+dr[i] ;
                int nc = brr[1]+dc[i] ;

                if(nr>= 0 && nr<arr.length && nc>=0 && nc<arr[0].length && arr[nr][nc]==1 && !isVisited[nr][nc]){
                    count ++ ;
                    queue.offer(new int[]{nr, nc}) ;
                    isVisited[nr][nc] = true;

                }

            }



        }

        return count ;

    }
    public static  int maxAreaOfIsland(int [][]arr){
        boolean [][]isVisited = new boolean [arr.length][arr[0].length] ;
        int max = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                max = Math.max(max , countIslands(arr , i , j , isVisited)) ;

            }
        }

        return max;


    }
    public static  void main(String[] args) {
        int [][]arr = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        System.out.println(maxAreaOfIsland(arr));


    }

}
