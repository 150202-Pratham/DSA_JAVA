package arrays.TwoPointer_SlidingWindow;

import java.util.Scanner;

public class Continuous_Subarray_Sum {

    private  static boolean Continuous_Sum(int []arr , int n){

        int l = 0 , r = 0 , sum = 0 , final_sum = 0 , max_len = 0 ;

        while(r< arr.length){

            sum+=arr[r] ;

            while(sum>n){
                sum-= arr[l] ;
                l-=1 ;

            }

            if(sum<=n){

                max_len = Math.max(sum , r-l+1) ;
                final_sum = sum ;
            }


        }

//        if(max_len>=2 && )

        return false ;

    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in) ;
        int []arr = {23,2,4,6,7} ;

        int n = sc.nextInt() ;

        System.out.println(Continuous_Sum(arr , n));


    }
}
