package arrays.TwoPointer_SlidingWindow;

import java.util.HashMap;

public class TotalNumber_SubArrays {
    public static int Number_Subarrays(int []arr , int k){
         int sum  = 0  , count = 0 ;

//        We cannot solve this Question since we have One error in this
//        that this it is Impossible to solve this using the Sliding windows

//        we will try to Use HashMaps

        HashMap<Integer , Integer> mymap = new HashMap<>() ;

        mymap.put(0 ,1) ;
//        We are adding this in the ase when we need the sum gets equal to  the K or
//        if the Sum Gets Equal to the size of the arr ;


        for(int num : arr){
            sum+= num ;

            if(mymap.containsKey(sum-k)){

                count+= mymap.get(sum-k) ;


            }

            mymap.put(sum, mymap.getOrDefault(sum , 0)+1) ;

        }

        return count ;

    }
    public static void main(String [] args) {

        int []arr = {1,1,1} ;
        int k = 2 ;

        System.out.println(Number_Subarrays(arr , k)) ;




    }
}
