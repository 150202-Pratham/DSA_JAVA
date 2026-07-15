package hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean checkDuplicates(int []arr){
        Map<Integer, Integer> mymap = new HashMap<>() ;

        for(int i : arr){
            mymap.put(i , mymap.getOrDefault(i , 0)+1);
        }

        for(Map.Entry<Integer , Integer> mapup : mymap.entrySet()){

            if(mapup.getValue()>=2){
                return true ;
            }
        }

        return false ;
    }
    public static void main(String args[]){
        int [] nums = {1,2,3,1} ;

        System.out.println(checkDuplicates(nums)) ;

    }
}
