package AdvancedRecursion.DynamicProgramming.TakeSkipDp;

import java.sql.Time;
import java.util.Arrays;

public class HouseRobber {
    public static int robHouse(int []nums){


        if(nums.length==1) return nums[0] ;

        int[]dp = new int[nums.length];
        dp[0] = nums[0] ;
        dp[1] = Math.max(nums[0] ,nums[1]) ;

//        now it's Time for Building its Recurrence Relation

        for(int i = 2 ; i<nums.length ; i++){

            dp[i] = Math.max(dp[i-1] , nums[i]+dp[i-2]) ;

        }

        return dp[nums.length-1] ;


    }

    public static int robHouse(int i , int []nums , int []dp){
        if(i>=nums.length) return 0 ;

        if(dp[i]!=-1) return dp[i] ;

        int take = nums[i]+ robHouse(i+2 , nums , dp) ;
        int skip = robHouse(i+1 , nums , dp) ;

        dp[i] = Math.max(take , skip) ;
        return dp[i] ;

    }
    public static int robHouse(int index , int []nums){

        if(index>=nums.length){
            return 0 ;
        }

        int take = nums[index]+ robHouse(index+2 , nums) ;
        int skip = robHouse(index+1 , nums) ;

        return Math.max(take , skip) ;

    }
    public static void main(String[] args) {
        long startTime0 = System.nanoTime() ;
        int []nums = {1,2,3,1} ;
        System.out.println(robHouse(0 , nums)) ;
        long endTime0 = System.nanoTime();
        System.out.println("For Recursive Solution it is: "+(endTime0 -startTime0)/1_00_000.0+"ms") ;


        // Memoization Code For this:
        long startTime1 = System.nanoTime() ;
        int []dp = new int[nums.length+1] ;
        Arrays.fill(dp,-1) ;
        System.out.println(robHouse(0 , nums , dp));
        long endTime1 = System.nanoTime() ;
        System.out.println("For Memoization " + (endTime1-startTime1)/1_00_000.0 + "ms") ;

//      Tabulation Code for Dynamic Programming

        long startTime = System.nanoTime() ;
        System.out.println(robHouse(nums));
        long endTime = System.nanoTime() ;
        System.out.println("For Tabulation " + (endTime-startTime)/1_00_000.0 + "ms") ;


    }
}
