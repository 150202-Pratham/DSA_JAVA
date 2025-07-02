package arrays.TwoPointer_SlidingWindow.prefixSum;

import java.util.Arrays;

public class FindMiddleIndex {

    public static void middleIndex(int arr[]){

//        Finding the Prefix sum ;

        int []prefixarr = new int[arr.length] ;

        prefixarr[0] = arr[0];

        for(int i = 1 ; i<arr.length; i++){

            prefixarr[i] = prefixarr[i-1]+arr[i] ;


        }

        System.out.println(Arrays.toString(prefixarr));

    }
    public static void main(String[] args) {
        int arr[] = {2,3,-1,8,4} ;

        middleIndex(arr) ;


    }
}
