package arrays.TwoPointer_SlidingWindow;

import java.util.Scanner;

public class Pallete_2 {
    public static int longestSub_string_withSum_k(int [] arr , int k){

        int l = 0 , r=0 , sum = 0 , max_len  = 0 ;

        while(r < arr.length){

            sum = sum+arr[r] ;

            while(sum > k){

                sum = sum-arr[l] ;

                l+=1 ;




            }

            if(sum <= k){
                max_len = Math.max(max_len , Math.abs(r-l)+1) ;
            }

            r+=1 ;


        }

        return max_len ;
    }
    public static void main(String args[]){


        Scanner myscanner = new Scanner(System.in) ;
        int n = myscanner.nextInt() ;
        int [] arr  = new int [n] ;

        for(int i = 0  ; i<arr.length ; i++){
            arr[i] = myscanner.nextInt() ;
        }

//        Here we have this Pallete of Question that is useful for finding out the Longet
//        Longest Comon Subsequence that adds upto the given Sum and many more
//        Question sRelated to Sliding Windows Can Be Solved up by that
        int  k   = myscanner.nextInt() ;

        System.out.println( longestSub_string_withSum_k(arr , k )) ;






    }
}
