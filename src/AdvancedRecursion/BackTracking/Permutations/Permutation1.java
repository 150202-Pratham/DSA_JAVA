package AdvancedRecursion.BackTracking.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutation1 {
    public static List<List<Integer>> findPermutations(int []arr , List<Integer> ds , boolean []freq){
        if(ds.size()==arr.length){

            List<List<Integer>> output = new ArrayList<>() ;
            output.add(new ArrayList<>(ds)) ;

            return output ;
        }
        List<List<Integer>> outcome = new ArrayList<>() ;

        for(int i = 0 ; i<arr.length ; i++){
            if(!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                outcome.addAll(findPermutations(arr, ds, freq));
                ds.removeLast();
                freq[i] = false;

            }
        }

        return  outcome ;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3} ;

        System.out.println(findPermutations(arr, new ArrayList<>() , new boolean[arr.length])) ;


    }
}
