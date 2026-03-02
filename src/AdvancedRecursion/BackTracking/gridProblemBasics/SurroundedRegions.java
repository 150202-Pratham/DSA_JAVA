package AdvancedRecursion.BackTracking;

public class SurroundedRegions {

    public static void ConvertToX(char [][] grid , int row , int col){

        if(grid[row][col] != 'O'){
            return;
        }

        grid[row][col] = '#';   // mark SAFE

        if(row < grid.length-1){
            ConvertToX(grid , row+1 , col);
        }
        if(row > 0){
            ConvertToX(grid , row-1 , col);
        }
        if(col < grid[0].length-1){
            ConvertToX(grid , row , col+1);
        }
        if(col > 0){
            ConvertToX(grid , row , col-1);
        }
    }

    public static void main(String[] args) {

        char [][]arr = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };

        // TOP & BOTTOM row
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] == 'O') {
                ConvertToX(arr, 0, j);
            }
            if (arr[arr.length - 1][j] == 'O') {
                ConvertToX(arr, arr.length - 1, j);
            }
        }

        // LEFT & RIGHT column
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 'O') {
                ConvertToX(arr, i, 0);
            }
            if (arr[i][arr[0].length - 1] == 'O') {
                ConvertToX(arr, i, arr[0].length - 1);
            }
        }

        // FINAL CONVERSION
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){

                if(arr[i][j] == 'O'){
                    arr[i][j] = 'X';   // surrounded
                }
                else if(arr[i][j] == '#'){
                    arr[i][j] = 'O';   // restore safe
                }
            }
        }

        // PRINT
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
