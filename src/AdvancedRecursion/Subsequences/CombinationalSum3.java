package AdvancedRecursion.Subsequences;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum3 {
    public static List<List<Integer>> combinationSum3(int k, int target, int index , List<Integer> current) {
        List<List<Integer>> output = new ArrayList<>() ;
        if(k==0 &&  target==0 ){
            output.add(new ArrayList<>(current)) ;
            return output ;
        }

        if(target<0 || k<0){
            return output ;
        }
        for(int i = index ; i<=9 ; i++){
            current.add(i) ;
            output.addAll(combinationSum3(k-1, target - i , i+1 , current)) ;
            current.removeLast() ;
        }
         return output ;


    }
    public static void main(String[]args){
          var k = 3 ;
          var n = 7 ;

          List<List<Integer>> output = new ArrayList<>() ;

        System.out.println( combinationSum3(k , n , 1 , new ArrayList<>())) ;



    }
}
