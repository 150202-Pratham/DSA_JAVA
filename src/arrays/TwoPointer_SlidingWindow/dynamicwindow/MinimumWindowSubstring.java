package arrays.TwoPointer_SlidingWindow.dynamicwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static int miniWindowSubstr(String s, String  k) {

        Map<Character , Integer> mapStore = new HashMap<>() ;

        for(char elem : k.toCharArray()){
            mapStore.put(elem , mapStore.getOrDefault(elem , 0)+1) ;
        }
        int i = 0 , j = 0 ;
        int count = mapStore.size() ;

        while(j<s.length()){
            if(mapStore.containsKey(s.charAt(j))){
                mapStore.put(s.charAt(j) , mapStore.get(s.charAt(j))-1) ;
            }


        }

        return 0 ;

    }
    public static void main(String[] args) {
        String s1 = "ADOBECODEBANC" ;
        String s2 = "ABC" ;

        System.out.println(miniWindowSubstr(s1, s2));


    }

}
