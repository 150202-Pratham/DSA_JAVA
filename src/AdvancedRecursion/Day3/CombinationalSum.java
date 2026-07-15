package AdvancedRecursion.Day3;


import java.util.ArrayList;
import java.util.List;

public class CombinationalSum {
    public static List<List<Integer>> combination(int []arr , int target , int index , List<Integer> current){
        if(target==0){
            List<List<Integer>> output = new ArrayList<>() ;
            output.add(new ArrayList<>(current)) ;

            return output ;


        }

        if(target<0 || index==arr.length){
            return new ArrayList<>() ;

        }



        current.add(arr[index]) ;
        List<List<Integer>> left = combination(arr, target-arr[index] , index , current) ;
        current.removeLast() ;
        List<List<Integer>> right = combination(arr , target , index+1 , current) ;

        left.addAll(right) ;

        return left ;



    }

    public static void main(String []args){

        int []arr = {2,3,6,7};
        int target = 7 ;

        System.out.println(combination(arr, target , 0 , new ArrayList<>()));




    }
}
