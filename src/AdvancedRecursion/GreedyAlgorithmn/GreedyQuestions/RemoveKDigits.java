package AdvancedRecursion.GreedyAlgorithmn.GreedyQuestions;

import java.util.Stack;

public class RemoveKDigits {
    public static String removeDigits(String num , int k){
        Stack<Character> st  = new Stack<>() ;
         for(int i = 0 ; i<num.length() ; i++){
             while(!st.isEmpty()&& k>0 && st.peek()>num.charAt(i)){
                 st.pop() ;
                 k-- ;


             }
             st.push(num.charAt(i)) ;
         }
//        What if all the Digits of the Strings Keep on Increasing and
//        like 12345 and k = 2  ; we need to remove from last

        while(k>0 && !st.isEmpty()){
            st.pop() ;
            k-- ;
        }


         StringBuilder str = new StringBuilder() ;
         while(!st.isEmpty()){
              str.append(st.pop()) ;
         }


          str.reverse();

//         we have made this in order to remove the extra elements that can come after making the required outCome

         while(str.length()>1 && str.charAt(0)=='0'){
             str.deleteCharAt(0) ;

         }
        return str.length() == 0 ? "0" : str.toString();
    }
    public static void main(String[] args) {
        String num = "10200" ;
        int k = 1;
        System.out.println(removeDigits(num, k));


    }
}
