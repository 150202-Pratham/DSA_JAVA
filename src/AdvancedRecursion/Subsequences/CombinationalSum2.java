package AdvancedRecursion.Subsequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationalSum2 {
   public static List<List<Integer>> printCombinations(int []arr , int target , int index , List<Integer> current){

       List<List<Integer>> result = new ArrayList<>() ;

       if(target==0){
           result.add(new ArrayList<>(current)) ;
           return result ;

       }


       for(int i  =  index ; i<arr.length ; i++){

           if(i>index && arr[i]==arr[i-1]) continue ;

           if(arr[i]>target) break ;

           current.add(arr[i]) ;
           result.addAll(printCombinations(arr  , target-arr[i] , i+1 ,  current)) ;
           current.removeLast() ;

       }
       return result ;


   }
    public static void main(String[] args) {
        var arr= new int[]{10,1,2,7,6,1,5} ;
        var target = 8 ;
        Arrays.sort(arr) ;

        System.out.println(printCombinations(arr , target , 0 , new ArrayList<>() ));



    }

}
