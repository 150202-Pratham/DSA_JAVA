package arrays.TwoPointer_SlidingWindow;

import java.util.Arrays;

public class ShiftZeroesToEnd {
    public static void shiftZeroes(int[] arr) {
        int j = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;

                j+=1 ;


            }
        }
    }
    public static void main(String args[]){

        int arr[] = {0,1,0,3,12} ;

        shiftZeroes(arr) ;
        System.out.println(Arrays.toString(arr)) ;



    }
}
