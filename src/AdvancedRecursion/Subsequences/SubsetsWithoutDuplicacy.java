package AdvancedRecursion.Subsequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithoutDuplicacy {
    public static List<List<Integer>> subsetDuplicacy(int[]arr , List<Integer> current , int index){


            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(current)) ;





        for(int i = index ; i<arr.length ; i++){

            if(i>index && arr[i]==arr[i-1]){
                continue ;
            }
            current.add(arr[i]) ;
            result.addAll( subsetDuplicacy(arr , current , i+1 ) );
            current.removeLast() ;


        }

        return result;



    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        Arrays.sort(arr); // Important: sort first

        List<List<Integer>> ans = subsetDuplicacy(arr, new ArrayList<>(), 0);

        System.out.println(ans);
    }
}
