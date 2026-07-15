package AdvancedRecursion.Subsequences;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesPrint {


    public static void subsequences(List<Character> list , String str){
        if(str.isEmpty()){

             return ;



        }
        list.add(str.charAt(0));
        subsequences( list , str.substring(1)) ;
        subsequences(list ,  str.substring(1)) ;

    }
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>() ;

        String str = "abcdef" ;

         subsequences(list , str) ;

        System.out.println(list) ;





    }
}
