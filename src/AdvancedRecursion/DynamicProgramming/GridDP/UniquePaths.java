package AdvancedRecursion.DynamicProgramming.GridDP;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePaths {
    public static int solveGridPath(int m , int n , int i , int j){
//       Recursive Approach ;

        if( i<0 || i>=m || j<0 || j>=n ) return 0 ;


        if(i==m-1 && j==n-1) return 1 ;

        int pathDown = solveGridPath(m,n, i+1 , j) ;
        int pathRight = solveGridPath(m,n , i , j+1) ;

        return pathDown + pathRight ;


    }

    public static int solveGridPath(int m , int n , int i , int j  , int [][]dp ){
        if(i<0 || i>=m || j<0 ||j>=n){
            return 0 ;
        }

        if(i==m-1 && j==n-1) return 1 ;

        if(dp[i][j]!=-1){
            return dp[i][j] ;

        }
        int down = solveGridPath(m, n, i+1 , j, dp) ;
        int right = solveGridPath(m , n, i, j+1 , dp ) ;

        return dp[i][j] = down + right ;

    }

    public static int solveGridPath(int m ,int n){

        int [][]dp = new int [m][n] ;

        for(int i = m-1 ; i>=0 ; i--){

            for(int j = n-1 ; j>=0 ; j--){

                if(i==m-1 && j==n-1){
                    dp[i][j] = 1 ;
                }
                else{
                    int down = 0 ;
                    int right = 0 ;

                    if(i+1 < m){
                        down = dp[i+1][j];

                    }
                    if(j+1<n){
                        right = dp[i][j+1] ;

                    }

                    dp[i][j] = down+right ;
                }
            }
        }

        return dp[0][0] ;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt() ;

        long startRecur = System.nanoTime() ;
        System.out.print("Recursive Approach to Solve the Problem ");
        int output = solveGridPath(m , n , 0 , 0);
        long endRecur = System.nanoTime();
        System.out.println(output + (endRecur - startRecur)/ 1_000_000.0+ " ms");

        int [][]dp = new int[m][n];
        for(int []arr : dp){
            Arrays.fill(arr,-1);
        }
        System.out.print("Memoization Approach to Solve the Problem ");
        long startMem = System.nanoTime() ;
        int outputMem = solveGridPath(m , n , 0 , 0 , dp);
        long endMem = System.nanoTime();
        System.out.println(outputMem + (endMem - startMem)/ 1_000_000.0 + " ms");


        System.out.print("Tabulated Code for Cutting the Extra Stack Space utilized ");
        long startTabulated =  System.nanoTime() ;
        int outputTabulated = solveGridPath(m , n );
        long endTabulated = System.nanoTime();
        System.out.println(outputTabulated + (endTabulated-startTabulated)/ 1_000_000.0 + " ms");




    }
}
