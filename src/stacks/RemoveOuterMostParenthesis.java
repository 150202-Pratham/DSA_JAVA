package stacks;

import java.util.Stack;

public class RemoveOuterMostParenthesis {

    public static void main(String[]args){
        String myStr = "(()())(())" ;
        Stack<Character> myStack = new Stack<>() ;

        StringBuilder str = new StringBuilder() ;

        for(char ch : myStr.toCharArray() ){

            if(ch=='('){

                if(!myStack.isEmpty()){
                    str.append(ch);

                }
                myStack.push(ch) ;
            }
            else{
                myStack.pop() ;
                if(!myStack.isEmpty()){
                    str.append(ch) ;

                }

            }


        }


        System.out.println(str.toString()) ;



    }
}
