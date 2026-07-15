package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Prop_1_hashmap {

    public static void main(String args[]){

        int [] arr = {1 ,2,3,4,5,5} ;

        for(int i:arr){
            System.out.println(i);

        }

        Map<Integer , Integer> map = new HashMap<>();

        map.put(100 , 0);
        map.put(200 , 1) ;
        map.put(300 , 4) ;
        map.put(250 , 20) ;

        System.out.println(map) ;
//        Delete the mapping

        map.remove(100 , 0) ;

        System.out.println(map.entrySet());

//     this is the iteration part

        for(Map.Entry<Integer , Integer> i :map.entrySet() ){
            System.out.println(i.getKey() + " " + i.getValue()) ;

        }
//   Now for the updating the list we will use the Put tmethod

        map.put(56 , 300) ;



    }

}
