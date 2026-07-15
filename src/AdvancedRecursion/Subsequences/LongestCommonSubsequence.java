package AdvancedRecursion.Subsequences;

public class LongestCommonSubsequence {
   public static int longestSequence(String text1 , int i , String text2 , int j , int[][]dp){

       if(i==0 || j==0) return 0 ;

       if(dp[i][j]!=-1) return dp[i][j] ;


       if(text1.charAt(i-1)==text2.charAt(j-1)){
           dp[i][j] = 1+ longestSequence(text1 , i-1, text2 , j-1 , dp ) ;

       }
       else{
           dp[i][j] = Math.max(longestSequence(text1 , i -1 , text2 , j , dp) , longestSequence(text1 , i , text2, j-1 , dp)) ;

       }

        return dp[i][j] ;


   }
    public static void main(String[] args) {
        String text1 = "abcde" ;
        String text2 = "abc" ;
        int  i = text1.length() ;
        int j = text2.length() ;
        int [][]dp = new int[i+1][j+1] ;

        for(int l = 0 ; l<i+1 ; l++){
            for(int m = 0 ; m<j+1 ; m++){
                dp[l][m] = -1 ;

            }
        }

        System.out.println(longestSequence(text1 , i , text2 , j , dp));


    }
}
