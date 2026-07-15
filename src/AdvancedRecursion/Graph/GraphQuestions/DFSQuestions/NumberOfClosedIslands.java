package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions;

public class NumberOfClosedIslands {
    public static boolean dfs(int i , int j , int [][]grid , boolean [][]isVisited){

        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return false ;
        }
        if (grid[i][j] == 1 || isVisited[i][j]) {
            return true;
        }
        isVisited[i][j] = true;

        int []dr = {-1 ,1 , 0 , 0} ;
        int []dc = {0, 0, -1 , 1} ;

        boolean isClosed = true ;

        for(int k = 0 ; k<4 ; k++){
            int nr = i+dr[k] ;
            int nc = j+dc[k] ;

            isClosed = isClosed && dfs(nr, nc , grid , isVisited) ;

        }
        return isClosed ;

    }
    public static  int closedIsland(int[][] grid) {
        boolean [][]isVisited = new boolean [grid.length][grid[0].length] ;
        int count = 0 ;

        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[i].length ; j++){
                if(grid[i][j]==0 && !isVisited[i][j]){
                    if(dfs(i , j , grid , isVisited))   count++ ;;

                }

            }
        }

        return count ;

    }

    public static void main(String []args){
        int [][] grid = {{0,0,1,0,0} , {0,1,0,1,0} , {0,1,1,1,0}} ;

        System.out.println(closedIsland(grid));
    }

}
