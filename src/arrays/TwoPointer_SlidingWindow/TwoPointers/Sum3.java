package arrays.TwoPointer_SlidingWindow.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {

//    Here we will only Return Indices no elements
   public static List<List<Integer>> possible3Sum(int []arr){

       int [][]brr = new int[arr.length][2] ;

       for(int i = 0 ; i<arr.length ; i++){

           brr[i][0] = arr[i] ;
           brr[i][1] = i ;
       }

       Arrays.sort(brr , (a,b)-> Integer.compare(a[0] , b[0])) ;

       List<List<Integer>> output = new ArrayList<>() ;

       for(int i = 0 ; i<arr.length -2 ; i++){

           if(i>0 && brr[i][0]==brr[i-1][0]) continue ;

           int left = i+1 ;
           int right = arr.length-1 ;

           while(left < right){

               int sum = brr[i][0] + brr[left][0] + brr[right][0] ;

               if(sum == 0 ){
                   output.add(Arrays.asList(brr[i][1] , brr[left][1] , brr[right][1])) ;
                   left++ ;
                   right -- ;

                   while(left < right && brr[left][0] == brr[left-1][0]) left ++ ;
                   while(left < right && brr[right][0] == brr[right+1][0]) right -- ;

               }

               else if(sum < 0 ){
                   left++ ;

               }

               else{

                   right -- ;

               }

           }
       }

        return output ;


   }
    public static void main(String[] args) {
        int []arr = {-1,0,1,2,-1,-4} ;

        System.out.println(possible3Sum(arr)) ;

    }
}
