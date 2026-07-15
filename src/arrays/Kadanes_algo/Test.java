package arrays.Kadanes_algo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static int kConcatenationMaxSum(int[] arr, int k) {

        List<Integer> list = new ArrayList<>() ;

        for(int i = 0 ; i<k ; i++){
            for( int j = 0  ; j<arr.length ; j++){

                list.add(arr[j]) ;


            }
        }
        int sum = 0 ;
        int max_sum = 0 ;

        for(int i = 0 ; i<list.size() ; i++){

            sum += list.get(i) ;

            max_sum = Math.max(sum, max_sum) ;

            if(sum<0){
                sum = 0;

            }

        }


        return max_sum;

    }
    public static void main(String[] args) {

        int []arr = {-1,-2} ;
        int k = 7 ;

        System.out.println(kConcatenationMaxSum(arr,  k));
    }
}
