package recursion;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int element = scanner.nextInt() ;

        int arr[] = {64,25,11,22,12} ;
        int i = 0 ;

        System.out.print(linearSer(arr , element ,  i)) ;



    }


    public static int linearSer(int []arr , int elem , int i){
        if(i==arr.length){
            return -1 ;

        }
        if(elem ==arr[i]){
            return i ;

        }

        return linearSer(arr , elem , i+=1) ;

    }
}
