package AdvancedRecursion.BackTracking.gridProblemBasics;

import java.util.Scanner;

//public class PacManGame {
//    public static boolean movePac(String []grid , int i , int j){
//
//        int R = grid.length ;
//        int C = grid[0].length() ;
//
//        if(i>=R || j>=C || i<0 || j<0 || grid[i].charAt(j)=='R' ||
//                grid[i].charAt(j)=='B' || grid[i].charAt(j)=='G' || grid[i].charAt(j)=='Y' || grid[i].charAt(j)=='V')
//        {
//            return false ;
//
//        }
//        if(grid[i].charAt(j)=='E') return true ;
//
//        char []row = grid[i].toCharArray() ;
//        row[j] = 'V' ;
//        grid[i] = new String(row) ;
//
//        if(movePac(grid , i+1 , j) || movePac(grid , i-1 , j) || movePac(grid, i,j+1) || movePac(grid , i , j-1)){
//            return true ;
//        }
//
//        return false ;
//
//
//    }
//    public static boolean canPacmanEscape(int R, int C, String[] grid) {
//        for(int i = 0 ; i<R ; i++){
//            for(int j = 0 ; j<C ; j++ ){
//                if(grid[i].charAt(j)=='P'){
//                    return movePac(grid,i,j) ;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) {
//            int R = sc.nextInt();
//            int C = sc.nextInt();
//            String[] grid = new String[R];
//            for (int i = 0; i < R; i++) {
//                grid[i] = sc.next();
//            }
//            if (canPacmanEscape(R, C, grid)) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//        sc.close();
//    }
//}


public class PacManGame {

    public static boolean movePac(String[] grid, int i, int j) {

        int R = grid.length;
        int C = grid[0].length();

        // Out of bounds
        if (i < 0 || j < 0 || i >= R || j >= C) {
            return false;
        }

        char ch = grid[i].charAt(j);


        if (ch == '#' || ch == 'R' || ch == 'B' ||
                ch == 'G' || ch == 'Y' || ch == 'V') {
            return false;
        }

        // Check whether the current cell is adjacent to a ghost
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int ni = i + dx[d];
            int nj = j + dy[d];

            if (ni >= 0 && ni < R && nj >= 0 && nj < C) {
                char neighbor = grid[ni].charAt(nj);

                if (neighbor == 'R' || neighbor == 'B' ||
                        neighbor == 'G' || neighbor == 'Y') {
                    return false;
                }
            }
        }


        if (ch == 'E') {
            return true;
        }


        char[] row = grid[i].toCharArray();
        row[j] = 'V';
        grid[i] = new String(row);


        return movePac(grid, i + 1, j) ||
                movePac(grid, i - 1, j) ||
                movePac(grid, i, j + 1) ||
                movePac(grid, i, j - 1);
    }

    public static boolean canPacmanEscape(int R, int C, String[] grid) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i].charAt(j) == 'P') {
                    return movePac(grid, i, j);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        String[] grid = new String[R];

        for (int i = 0; i < R; i++) {
            grid[i] = sc.next();
        }

        System.out.println(canPacmanEscape(R, C, grid) ? "YES" : "NO");

        sc.close();
    }
}

