package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoodString_BadString {
    public static Boolean isGoodString(String string_out){

        char [] arr = string_out.toCharArray() ;

        Map<Character , Integer> mymap = new HashMap<>() ;

        for(char i : arr){
            mymap.put(i , mymap.getOrDefault(i , 0)+1) ;

        }

        int compare = mymap.get(arr[0])  ;




        for(Map.Entry<Character , Integer> element : mymap.entrySet()){

            if(element.getValue()!=compare){
                return false ;


            }
        }

        return true ;


    }
    public static void main(String [] args){


        Scanner sc = new Scanner(System.in) ;

        String new_in = sc.nextLine() ;

        System.out.println(isGoodString(new_in)) ;







    }
}
