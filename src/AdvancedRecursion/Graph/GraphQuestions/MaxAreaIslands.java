package AdvancedRecursion.Graph.GraphQuestions;

import java.util.*;

public class MaxAreaIslands {
    public static class Pair{
        int row ;
        int col ;
        public Pair(int row ,int col){
            this.row = row;
            this.col = col ;

        }
    }

    public static int largestIsland(int [][]grid){
        int inIslands = 2 ;
        Map<Integer, Integer> map = new HashMap<>() ;

        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j]==1){
                    int area = connectIslands(grid, inIslands , i , j) ;
                    map.put(inIslands , area) ;
                    inIslands++ ;


                }
            }
        }
        int maxArea = 0 ;

        for(int val : map.values()){
            maxArea = Math.max(maxArea , val) ;
        }
        int []dr = {-1 , 1 , 0,0} ;
        int []dc = {0,0,-1,1} ;

        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j]==0){
                    Set<Integer> set  = new HashSet<>() ;
                    int flipArea = 1 ;

                    for(int k = 0 ; k<4 ; k++){

                        int nr = i+dr[k] ;
                        int nc = j+dc[k] ;

                        if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]>1){
                            if(set.add(grid[nr][nc])){
                                flipArea += map.get(grid[nr][nc]) ;
                            }

                        }
                    }
                    maxArea = Math.max(maxArea, flipArea ) ;

                }
            }
        }

        return maxArea;

    }

    public static int connectIslands(int [][]grid , int inIslands  , int row , int col ){
        Queue<Pair> queue = new LinkedList<>() ;
        int area = 1 ;
        queue.add(new Pair(row , col)) ;
        grid[row][col] = inIslands ;

        int []dr = {-1 , 1 , 0 ,0} ;
        int []dc = {0,0,-1,1} ;

        while(!queue.isEmpty()){
            Pair p = queue.poll() ;
            for(int k = 0 ; k<4 ;k++){
                int nr = dr[k]+p.row ;
                int nc = dc[k]+p.col ;

                if(nr>=0 &&  nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                    queue.add(new Pair(nr , nc )) ;
                    grid[nr][nc] = inIslands ;
                    area++;

                }

            }
        }

        return area ;


    }

    public static void main (String []args){
        int [][]grid = {{1,0} , {0,1}} ;
        System.out.println(largestIsland(grid));
    }


}
