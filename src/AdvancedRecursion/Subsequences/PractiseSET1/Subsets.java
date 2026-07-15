package AdvancedRecursion.Subsequences.PractiseSET1;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> printSubsets(int []nums , List<Integer> outcome , int index){

        if(index==nums.length){
            List<List<Integer>> output = new ArrayList<>() ;
            output.add(new ArrayList<>(outcome));
//             here we are doing new ArrayList<>(outcome) as the List has tendency of Passing value by reference
//            so here we are storing the deep Copy of the same here

            return output ;

        }
        List<List<Integer>> result  = new ArrayList<>() ;
        outcome.add(nums[index]) ;
        result.addAll(printSubsets(nums , outcome , index+1)) ;
        outcome.removeLast() ;
        result.addAll(printSubsets(nums , outcome , index+1 )) ;
        return result  ;


    }
    public static void main(String[] args) {
        int []nums = {1,2,3} ;
        System.out.println(printSubsets(nums ,new ArrayList<>() , 0 ));
    }
}
