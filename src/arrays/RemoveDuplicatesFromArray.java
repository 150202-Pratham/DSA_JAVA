package arrays;

import java.sql.SQLOutput;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {

    public static void duplicateBruteForce(int []arr){
        HashSet<Integer> myset  = new HashSet<>() ;


        for(int i : arr){
            myset.add(i) ;

        }

        for(int i : myset){

            System.out.println(i) ;

        }



    }

    public static int duplicateOptimized(int []arr){

        int i = 0 ;

        for(int j = 0 ; j<arr.length ; j++){

            if(arr[i]!=arr[j]){

                arr[i+1] = arr[j] ;

                i++ ;


            }
        }

        return  i+1 ;

    }
    public static void main(String [] args) {

        int []arr = {0,0,1,1,1,2,2,3,3,4} ;


       duplicateBruteForce(arr) ;
       
       System.out.println(duplicateOptimized(arr));

    }




}
