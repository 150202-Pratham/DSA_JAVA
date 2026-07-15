package hashmap;

import java.util.HashMap;
import java.util.Map;


// Important for Revision Purpose

public class Contains_DuplicateII {
    public static boolean check_DuplicateII(int []arr , int k){
        Map<Integer, Integer> mymap  = new HashMap<>() ;


        for(int i = 0 ;i<arr.length; i++){

            if(mymap.containsKey(arr[i])){
                int prev_Index = mymap.get(arr[i]) ;

                if((i-prev_Index) <= k){
                    return true ;

                }
            }


            mymap.put(arr[i] , i ) ;



        }


        return false ;


    }
    public static void main(String []args){
        int [] arr  = {1,2,3,1} ;
        int k = 3  ;

        System.out.println(check_DuplicateII(arr , k )) ;

    }
}
