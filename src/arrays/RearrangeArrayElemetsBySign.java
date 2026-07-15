package arrays;

import java.util.Arrays;

public class RearrangeArrayElemetsBySign {

    public static void main(String args[]){

        int arr[] = {3,1,-2,-5,2,-4} ;

        int output[] = new int[arr.length] ;

        int posIndex = 0 ;
        int negative = 1 ;

        for(int i = 0  ; i<arr.length  ; i++){
            if(arr[i]<0){
                output[negative] = arr[i] ;
                negative+=2 ;


            }
            else{
                output[posIndex] = arr[i] ;

                        posIndex +=2 ;


            }
        }

        System.out.println(Arrays.toString(output)) ;

    }
}
