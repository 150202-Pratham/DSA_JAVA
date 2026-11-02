package AdvancedRecursion.DynamicProgramming.TakeSkipDp;

import java.util.Arrays;

public class SolveByBrainPower {

    public static long findPoints(int i , int[][]questions , long[]dp){

        if(i>=questions.length) return 0;

        if(dp[i]!=-1)return dp[i] ;

        long take =  questions[i][0] + findPoints(i+questions[i][1]+1 , questions , dp) ;
        long skip = findPoints(i+1 , questions , dp) ;

        dp[i] = Math.max(take , skip) ;

        return dp[i] ;

    }
    public static long mostPoints(int[][] questions) {

        long dp[] = new long[questions.length+1] ;
        Arrays.fill(dp , -1) ;

        return findPoints(0,questions,dp);

    }

   public static long findPoints(int[][]questions){
       long []dp = new long[questions.length+1] ;


       for(int i = questions.length-1 ; i>=0 ; i-- ){

           int next = i+questions[i][1]+1 ;

           long take = questions[i][0] ;

           if(next < questions.length ){
               take += dp[next] ;
           }

           long skip = dp[i+1] ;

           dp[i] = Math.max(take , skip ) ;

       }

       return dp[0] ;


   }
    public static void main(String[] args) {
        int [][]questions = {{3,2},{4,3},{4,4},{2,5}} ;

        long startTime =  System.nanoTime();
        System.out.println(mostPoints(questions) );
        long endTime = System.nanoTime();
        System.out.println("Time Complexity of this Memoized Code: " + (endTime-startTime)/1_00_000.0 +"ms");


        long startTimeTabulation = System.nanoTime();
        System.out.println(findPoints(questions) );
        long endTimeTabulation = System.nanoTime();
        System.out.println("Time Complexity of Tabulated Code: " + (endTimeTabulation-startTimeTabulation)/1_00_000.0 +"ms");

    }
}
