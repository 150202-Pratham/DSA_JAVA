package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions;

public class NumberOfEnclaves {
    public static void dfs(int row , int col , int[][]arr){
        if(row<0 || col<0 || row>=arr.length || col>=arr[0].length ){
            return ;
        }
        if(arr[row][col]==0) return ;
        arr[row][col] = 0 ;
        int []dr = {-1 ,1 ,0,0} ;
        int []dc = {0,0,-1,1} ;

        for(int i = 0 ; i<4 ; i++){
            dfs(row+dr[i] , col+dc[i] , arr);

        }


    }
    public static int numEnclaves(int [][]arr){
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i][0]==1) dfs(i,0,arr) ;

            if(arr[i][arr[0].length-1]==1) dfs(i, arr[0].length-1,arr) ;
        }

        for(int j = 0 ; j<arr[0].length ; j++){
            if(arr[0][j]==1) dfs(0,j,arr) ;
            if(arr[arr.length-1][j]==1) dfs(arr.length-1,j,arr);

        }
        int count = 0 ;

        for(int  i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                if(arr[i][j]==1){
                    count++;

                }
            }
        }

        return count ;
    }
    public static void main(String[] args) {
        int [][]arr = {{0,0,0,0} , {1,0,1,0} , {0,1,1,0} , {0,0,0,0}} ;
        System.out.println(numEnclaves(arr)) ;
    }
}
