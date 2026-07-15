package AdvancedRecursion.BackTracking.gridProblemBasics;

public class MaxAreaIsland {

    public static int maxArea(int[][] grid , int row , int col) {

        if(grid[row][col]==0) return  0;

        grid[row][col] = 0 ;

        int count = 1 ;

        if(row<grid.length-1) count+= maxArea(grid , row+1 , col) ;
        if(row>0) count+= maxArea(grid , row - 1 , col) ;
        if(col<grid[0].length-1) count+= maxArea(grid , row , col+1) ;
        if(col>0) count+= maxArea(grid , row , col-1) ;

        return count ;




    }
    public static void main(String[] args) {
        int [][]arr = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}} ;

        int maxArea  = Integer.MIN_VALUE;

       for(int i = 0 ; i<arr.length ; i++){
           for(int j = 0 ; j<arr[i].length ; j++){

               if(arr[i][j]==1){
                   maxArea = Math.max(maxArea, maxArea(arr , i , j)) ;

               }
           }
       }
      System.out.println(maxArea) ;





    }
}
