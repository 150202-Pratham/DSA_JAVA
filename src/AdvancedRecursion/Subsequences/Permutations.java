package AdvancedRecursion.Subsequences;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<String> permutations(String combination , String str){
        List<String> result = new ArrayList<>() ;
//        if(str.isEmpty()){
//            result.add(combination) ;
//            System.out.println( combination);
//            return result ;
//
//        }
//
//        for(int i = 0 ; i<str.length() ; i++){
//            String temp = str.substring(0,i)+str.substring(i+1);
//
//            result.addAll(permutations(combination+str.charAt(i),temp));
//        }
//
//        return result ;


        if(str.isEmpty()){
            result.add(combination) ;
            System.out.println(result);
            return result ;
        }

        char x = str.charAt(0) ;
        for(int i = 0 ; i<combination.length()+1 ; i++){
            String first = combination.substring(0, i) ;
            String last = combination.substring(i, combination.length()) ;

            result.addAll(permutations(first+x+last , str.substring(1))) ;

        }

        return result ;
    }
    public static void main(String[] args) {
        String str = "ABC" ;
        System.out.println( permutations( "" , str));
    }
}
