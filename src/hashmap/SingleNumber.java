package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int [] arr){
        Map<Integer , Integer> mymap = new HashMap<>() ;

        for(int  i: arr){
            mymap.put(i,mymap.getOrDefault(i,0)+1);
        }


        for(Map.Entry<Integer , Integer> mapup : mymap.entrySet()){

           if(mapup.getValue()==1){
               return mapup.getKey();
           }
        }
        return  0 ;
    }
    public static void main(String [] args){
        int []my_arr = {4,1,2,1,2};

        System.out.println(singleNumber(my_arr)) ;

    }
}
