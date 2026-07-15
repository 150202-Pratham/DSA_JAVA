package AdvancedRecursion.Graph.GraphQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
    public static class Pair{
        int row;
        int col ;
        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void convertToX(char [][]grid , int row , int col , Queue<Pair> queue){
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        queue.add(new Pair(row, col));
        grid[row][col] = 'T'; // MARK SAFE

        while (!queue.isEmpty()) {
            Pair p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nr = p.row + dr[i];
                int nc = p.col + dc[i];

                if (nr >= 0 && nr < grid.length &&
                        nc >= 0 && nc < grid[0].length &&
                        grid[nr][nc] == 'O') {

                    grid[nr][nc] = 'T';
                    queue.add(new Pair(nr, nc));
                }
            }
        }
    }



    public static void main(String[] args) {
        char [][]arr = {{'x' , 'x' , 'x' , 'x'}, {'x', '0' , '0' , 'x'},{'x','x','0','x'},{'x','0','x','x'}} ;
        Queue<Pair> queue = new LinkedList<>() ;

        for(int i = 0 ; i<arr.length; i++ ){
            if(arr[i][0]=='0'){
                convertToX(arr, i , 0 , queue);
            }
            if(arr[i][arr[0].length-1]=='0'){
                convertToX(arr, i , arr[0].length-1 , queue);
            }
        }

        for(int j =0 ; j<arr[0].length ; j++){
            if(arr[0][j] == '0'){
                convertToX(arr, 0 , j , queue);
            }
            if(arr[arr.length-1][j] == '0'){
                convertToX(arr, arr.length-1 , j , queue);
            }
        }

        for(int i = 0; i<arr.length ;i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                if(arr[i][j] == '0'){
                    arr[i][j] = 'x' ;

                }
                if(arr[i][j] == 'T'){
                    arr[i][j] = '0' ;
                }
            }
        }


//        for(int i = 0 ;i<arr.length ; i++){
//            for(int j = 0 ; j<arr[0].length ; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}
