package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_N_Place {
    public static void rotate_array(int []arr , int target){

        for(int i = 0 ; i<target ; i++){

            int temp = arr[arr.length-1];

            for(int j = arr.length-1 ; j>0 ; j--){
                arr[j] = arr[j-1] ;
            }

            arr[0] = temp ;
        }





    }
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in) ;

        int a = sc.nextInt() ;

        int [] arr = new int[a] ;

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt() ;

        }
        int target = sc.nextInt() ;

        rotate_array(arr , target) ;
        System.out.println(Arrays.toString(arr)) ;




    }
}
