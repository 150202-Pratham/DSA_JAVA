package arrays.TwoPointer_SlidingWindow.constantWindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {

        Map<Character,Integer> s1map = new HashMap<>();
        Map<Character,Integer> s2map = new HashMap<>() ;

        for(char a: s1.toCharArray()){
            s1map.put(a,s1map.getOrDefault(a ,0)+1) ;

        }

        int l = 0 , r = s1.length()-1 ;

        for(int i = l ; i<=r ; i++){

            s2map.put(s2.charAt(i) , s2map.getOrDefault(s2.charAt(i),0)+1) ;

        }

        if(s1map.equals(s2map)){
            return true ;

        }

        while(r<s2.length()-1){

            s2map.remove(s2.charAt(l));
            l++ ;
            r++ ;
            s2map.put(s2.charAt(r), s2map.getOrDefault(s2.charAt(r),0)+1) ;

            if(s1map.equals(s2map)){
                return true ;

            }
        }

        return false ;





    }
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo" ;

        System.out.println(checkInclusion(s1,s2));

    }
}
