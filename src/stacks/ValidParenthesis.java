package stacks;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean checkParenthesis(String str){
        Stack<Character> myStack = new Stack<>();

        for(char ch : str.toCharArray()){

            if(ch=='(' || ch=='{' || ch=='['){

                myStack.push(ch) ;


            }

            else{
                if(myStack.isEmpty()){

                    return false ;

                }
                char value = myStack.pop() ;

                if((value=='('&& ch==')')||(value=='{'&& ch=='}')||(value=='['&& ch==']') ){
                    continue ;


                }
                else{
                    return false ;

                }
            }


        }

        return myStack.isEmpty() ;

    }
    public static void main(String []args){

        String str = "(()())";

        System.out.println(checkParenthesis(str));



    }
}
