package AdvancedRecursion.Subsequences.PractiseSET1;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static List<String> printSubsequences(String unprocessed , String processed){
        if(processed.isEmpty()){
            List<String> output = new ArrayList<>() ;
            output.add(unprocessed) ;
            return output ;
        }



        char ch = processed.charAt(0) ;

       List<String> leftStr =  printSubsequences(unprocessed+ch, processed.substring(1)) ;
        List<String> rightStr = printSubsequences(unprocessed, processed.substring(1)) ;

        leftStr.addAll(rightStr) ;

        return leftStr ;

    }
    public static void main(String[] args) {
        String str = "abc" ;
        System.out.println(printSubsequences( "" , str )) ;


    }
}
