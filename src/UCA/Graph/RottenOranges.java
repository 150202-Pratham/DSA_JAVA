package UCA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static class Pair{
        int row ;
        int col ;

        public Pair(int row , int col){
            this.row = row  ;
            this.col = col ;
        }
    }
    public static int rottenOranges(int [][]grid){
        boolean [][]visited = new boolean[grid.length][grid[0].length];
        int fresh = 0 ;
        Queue<Pair> q = new LinkedList<>() ;

        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[i].length ; j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                if(grid[i][j]==2){
                    q.add(new Pair(i,j)) ;
                }
            }
        }

        int time = 0 ;
        while(!q.isEmpty()){
            time++ ;
            int size = q.size();
            for(int i = 0 ;i<size ; i++){
                Pair p = q.poll() ;

            }
        }

        return 0 ;
    }
    public static void main(String[] args) {

        int [][]grid ={{2,1,1},{1,1,0},{0,1,1}} ;
        System.out.println(rottenOranges(grid));



    }
}
