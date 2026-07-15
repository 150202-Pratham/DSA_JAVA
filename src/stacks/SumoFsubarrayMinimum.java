package stacks;

import java.util.Arrays;

public class SumoFsubarrayMinimum {
    public static int findMin(int []arr){
        int min = arr[0] ;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min ;

    }
    public static void main(String []args){

        int []arr = {11,81,94,43,3} ;
        int total = 0 ;

        for(int i = 0 ; i<arr.length ; i++){

            for(int j = i ; j<arr.length ; j++){
                int []subarray = Arrays.copyOfRange(arr, i , j+1) ;
//                System.out.println(Arrays.toString(subarray));

                if(subarray.length==1){
                    total+= subarray[0] ;

                }
                else{
                    total+= findMin(subarray) ;

                }


            }
        }


        System.out.println(total) ;


    }

}
