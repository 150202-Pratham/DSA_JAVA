package arrays.TwoPointer_SlidingWindow.constantWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum {
    public static int [] slidingMaximumWindow(int []arr , int k){

        List<Integer> list = new ArrayList<>() ;

        int l = 0 , r = k-1 ;
        int max = 0 ;

        while(r<=arr.length-1){

            for(int i = l ; i<=r  ; i++){
                max = Math.max(arr[i] , max) ;
            }

            list.add(max) ;
            l++ ;
            r++ ;


        }

        int []brr = new int[list.size()] ;

        for(int i = 0 ; i<list.size() ; i++){

            brr[i] = list.get(i) ;

        }

        return brr ;


    }
    public static void main(String[] args) {

        int []arr = {1} ;
        int k = 1;

        System.out.println(Arrays.toString(slidingMaximumWindow(arr,k)) );


    }
}
