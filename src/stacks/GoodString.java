package stacks;

import java.util.Stack;

public class GoodString {

    public static void main(String []args){

        String str = "leEeetcode" ;

        Stack<Character> result = new Stack<>() ;

        for(char ch : str.toCharArray()){

            if(!result.isEmpty()){

                if((ch>='A' && ch<='Z') && (result.peek()>='a' && result.peek()<='z') && (ch+32 == result.peek())){

                    result.pop() ;
                    continue ;


                }
            }

            result.push(ch) ;


        }

        StringBuilder output = new StringBuilder() ;


        for(int i = 0 ; i<result.size() ; i++){
            output.append(result.get(i)) ;


        }

        System.out.print(output.toString());
    }
}
