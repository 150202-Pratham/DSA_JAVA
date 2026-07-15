package AdvancedRecursion.BackTracking.Permutations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
    static Map<Character, String> map = new HashMap<>() ;

    public static List<String> combination(int ind , StringBuilder str , String digits){

        if(ind == digits.length()){
            List<String> result = new ArrayList<>();
            result.add(str.toString()) ;

            return result ;

        }
        List<String> output = new ArrayList<>() ;
        String choice = map.get(digits.charAt(ind)) ;

        for(char ch : choice.toCharArray()){

            str.append(ch);
            output.addAll(combination(ind+1 , str , digits)) ;
            str.deleteCharAt(str.length()-1) ;
        }

        return output ;

    }
    public static void main(String[] args) {
        String digits = "23" ;
        map.put('2', "abc");
        map.put('3' , "def");
        map.put('4' , "ghi") ;
        map.put('5',"jkl") ;
        map.put('6', "mno");
        map.put('7', "pqrs") ;
        map.put('8', "tuv");
        map.put('9', "wxyz");

        System.out.println(combination(0,  new StringBuilder() , digits)) ;
    }
}
