package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Count_numberofPairswithabsoluteDifferenceK {

    static int Count_numberof_absolutePairs(int []arr , int k){
        int count = 0 ;

        Map<Integer , Integer> map = new HashMap<>();


//        for(int i : arr){
//            if(map.containsKey(i+k)){
//                count+=1 ;
//
//            }
//            if(map.containsKey(i-k)){
//                count+=1 ;
//            }
//
//            map.put(i , map.getOrDefault(i , 0)+1) ;
//
//        }

//        the above code will not run almost all test case it will live you with the testcases that
//        contain the duplicate elements  in the array hence for this we have the bottom solution

        for(int n:arr){
            if(map.containsKey(n+k)){
                count+= map.get(n+k) ;
            }

            if(map.containsKey(n-k)){
                count+= map.get(n-k) ;

            }

            map.put(n ,map.getOrDefault(n , 0)+1) ;

        }



        return count ;


    }
    public static void main(String args[]){
        int [] arr = {1,2,2,1} ;
        int k = 1 ;

        int output = Count_numberof_absolutePairs(arr , k) ;

        System.out.println(output) ;

    }
}
