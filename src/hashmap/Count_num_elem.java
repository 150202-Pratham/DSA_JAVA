package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Count_num_elem {

    public static void main(String []args){

        int[] arr = {10,10,20,46,35} ;

        Map<Integer , Integer> map = new HashMap<>() ;


        for(int i : arr){
          int count = 0   ;

          for(int j = 0 ; j<arr.length ; j++){

              if(i==arr[j]){
                  count++ ;

              }
          }
          map.put(i , count) ;

        }


        System.out.println(map);


    }
}
