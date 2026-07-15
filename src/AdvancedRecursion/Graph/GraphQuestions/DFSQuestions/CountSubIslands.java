package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions;

public class CountSubIslands {
    public static boolean dfs(int [][]grid1 , int [][]grid2 , int row, int col){
        if(row<0 || col<0 || row>=grid2.length || col >=grid2[0].length){
            return true ;

        }

        if(grid2[row][col]==0) return true ;
        boolean isSubIsland = true ;
        if(grid1[row][col]==0) isSubIsland = false ;
        else isSubIsland = true ;

        grid2[row][col] = 0 ;

        int []dr = {-1 , 1, 0 , 0} ;
        int []dc = {0,0,-1,1} ;

        for(int i = 0 ; i<4 ; i++){
            isSubIsland = dfs(grid1 , grid2 , row+dr[i] , col+dc[i]) && isSubIsland ;

        }
        return isSubIsland ;
    }
    public static int countSubIslands(int[][] grid1, int[][] grid2) {
        int count = 0 ;
        for(int i = 0 ; i<grid2.length ; i++){
            for(int j = 0 ; j<grid2[i].length ; j++){
                if(grid2[i][j]==1){
                    if(dfs(grid1 , grid2 , i , j))count++ ;

                }
            }
        }

        return count ;

    }
    public static void main(String[] args) {
        int [][]grid1 = {{1,1,1,0,0} , {0,1,1,1,1} , {0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}} ;
        int [][]grid2 = {{1,1,0,0,0} , {0,0,1,1,1} , {0,1,0,0,0} , {1,0,1,1,0},{0,1,0,1,0}} ;

        System.out.println(countSubIslands(grid1 , grid2));





    }
}
