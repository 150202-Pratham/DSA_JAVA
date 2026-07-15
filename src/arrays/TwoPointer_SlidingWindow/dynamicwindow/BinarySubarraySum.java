package arrays.TwoPointer_SlidingWindow.dynamicwindow;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraySum {
    public static int numSubarraysWithSum(int[] nums, int goal) {

       int count = 0 ;
       int sum = 0 ;

       Map<Integer,Integer> mapit = new HashMap<>() ;

       mapit.put(0,1) ;

       for(int num :nums){

           sum+=num ;

           if(mapit.containsKey(sum-goal)){
               count+= mapit.get(sum-goal) ;

           }

           mapit.put(sum,mapit.getOrDefault(sum , 0)+1) ;

       }
       return count ;


    }

    public static void main(String[] args) {

        int []binarr = {1,0,1,0,1} ;
        int goal = 0 ;
        System.out.println(numSubarraysWithSum(binarr , goal));

    }
}
