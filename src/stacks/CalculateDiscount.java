package stacks;

import java.util.Scanner;
import java.util.Stack;

public class CalculateDiscount {
    public static void  checkDiscount(int []arr){
        Stack<Integer> indexer  = new Stack<>() ;

        for(int i = 0 ; i<arr.length ; i++){

            while(!indexer.isEmpty() && arr[indexer.peek()]>=arr[i]){

               int ind =  indexer.pop() ;

               arr[ind] = arr[ind]-arr[i] ;



            }

            indexer.push(i) ;


        }


    }
    public static void main(String []args){

        Scanner scan = new Scanner(System.in) ;
        int output =  scan.nextInt() ;

        int []arr = new int[output] ;

        for(int  i = 0 ; i<arr.length ; i++){

            arr[i] = scan.nextInt() ;

        }
        checkDiscount(arr);

        for(int i = 0 ; i<arr.length ; i++){

            System.out.print(arr[i]+" ") ;
        }






    }
}
