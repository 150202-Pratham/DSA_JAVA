package AdvancedRecursion.Subsequences;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum {
    public static List<List<Integer>> combinationalSum(List<Integer> current , int []arr , int target , int ind){
        if(target==0){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(current));
            return result ;


        }
        if(target<0 || ind==arr.length){
            return new ArrayList<>();

        }

        current.add(arr[ind]) ;
        List<List<Integer>> left = combinationalSum(current , arr  , target-arr[ind] , ind) ;

        current.removeLast() ;
        List<List<Integer>> right  = combinationalSum(current , arr , target, ind+=1 );


         left.addAll(right) ;

         return left  ;


    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,7} ;

        List<List<Integer> > output = combinationalSum(new ArrayList<>() , arr , 7 , 0) ;
        System.out.println(output) ;

    }


}
