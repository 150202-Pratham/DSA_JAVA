package hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {

    public static int majorityElement(int arr[]){

        Map<Integer,Integer> mymap = new HashMap<>() ;

        for(int i : arr){

            mymap.put(i, mymap.getOrDefault(i, 0) + 1);
        }

//        now you just need to iterate and Check and Check which Element has more value

//  best thing is that we are using the New Map.Entry set to  check for the Null Condition and
//  and then  compare it accordingly ;


        Map.Entry<Integer , Integer> max_Entry = null;

        for(Map.Entry<Integer,Integer>mapup : mymap.entrySet()){

            if(max_Entry==null || mapup.getValue()>max_Entry.getValue()){

                max_Entry = mapup ;

            }
        }

        return max_Entry.getKey() ;


    }
    public static void main(String []args){

        int arr[] = {3,2,3} ;

        System.out.println(majorityElement(arr))  ;




    }
}
