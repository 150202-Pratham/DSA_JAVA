package recursion;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        int []arr = {10,20,30,40,50,60,70} ;

//        Scanner scanner = new Scanner(System.in) ;

        int elem  =20 ;
        int start = 0 ;
        int end = arr.length -1  ;

        System.out.print(checkBinary( arr , elem , start , end));
    }

    public static int  checkBinary(int []arr , int elem , int start , int end){
        int mid = start + (end-start)/2 ;

        if(start>end){
            return -1;

        }

        if(elem<arr[mid]){

           return   checkBinary(arr , elem , start , mid-1) ;

        }

        if(elem>arr[mid]){
           return   checkBinary(arr , elem ,  mid+1 , end ) ;
        }

        return mid ;


    }

}
