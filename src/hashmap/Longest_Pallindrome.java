package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Longest_Pallindrome {

    public static int longest_Pallindrome(String a){

        char [] arr = a.toCharArray() ;

        Map<Character , Integer> mymap  = new HashMap<>() ;

        for(Character i : arr){
            mymap.put(i ,mymap.getOrDefault(i , 0)+1) ;

        }

        int count = 0 ;
        boolean isodd = false ;

        for(Map.Entry<Character,Integer> map : mymap.entrySet()){

            if(map.getValue()%2==0){
                count+=map.getValue() ;

            }

            else{
                isodd = true ;

            }


        }

        if(isodd){
            return count+1 ;


        }

        return count ;


    }
    public static void main(String [] args) {

        String a = "a" ;

        System.out.println(longest_Pallindrome(a));
    }
}

