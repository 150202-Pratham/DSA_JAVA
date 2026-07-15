package AdvancedRecursion.Subsequences;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int []arr , List<Integer> list , int ind){

        if(ind==arr.length){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(list));

//            Question is Why we are Returning a new ArrayList and we need
            return result ;
        }
        list.add(arr[ind]) ;
        List<List<Integer>> left = subsets(arr , list , ind+1) ;

        list.removeLast() ;

        List<List<Integer>> right = subsets(arr , list , ind+1) ;

        left.addAll(right) ;

        return left ;



    }
    public static void main(String[] args) {

        int []arr = {1,2,3} ;
        List<List<Integer>> output = subsets(arr, new ArrayList<>(), 0) ;

        System.out.println(output) ;

    }
}
