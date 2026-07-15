package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Find_Difference {
    public static char find_difference(String a , String b){

        char []arr = a.toCharArray() ;
        char [] brr = b.toCharArray() ;
        char result = 0;
        System.out.println(result) ;

        Map<Character , Integer> mymap = new HashMap<>() ;

        for(char i : arr){
            mymap.put(i , mymap.getOrDefault(i , 0)+1) ;

        }

        for (int i = 0 ; i<brr.length ; i ++){

            if(!mymap.containsKey(brr[i]) || mymap.get(brr[i])==0){
                result +=  brr[i] ;

            }
        }

        return result ;

    }
    public static void main(String []args){
        String a = new String("") ;
        String b = new String("y") ;

       System.out.println( find_difference(a , b ))  ;


    }
}
