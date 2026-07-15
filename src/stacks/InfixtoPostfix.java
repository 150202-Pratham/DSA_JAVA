package stacks;

import java.util.Stack;

public class InfixtoPostfix {

    public static int priority(char input){

        if(input=='^'){
            return 3 ;

        }
        else if(input=='*' || input=='/'){
            return 2 ;
        }
        else if(input == '+' || input=='-') return 1 ;

        else return -1 ;


    }
    public static void main(String []args){

        String str = "a+b*(c^d-e)" ;

        Stack<Character> myStack = new Stack<>() ;

        StringBuilder ans = new StringBuilder() ;

        for(char ch : str.toCharArray()){
//             Here I ahve added the operands to the ans StringBuffer ;

            if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')|| (ch>='0'&& ch<='9')){

                ans.append(ch) ;

            }
//  Here i handled if Starting Bracket Comes than at that time you need to add that up in the stack
            else if(ch=='('){
                myStack.push(ch) ;

            }

//  Now if you found the Closing Bracket starting poping the Elements until you found the last opening bracket that you added succesfully ;
            else if(ch==')'){

                while(!myStack.isEmpty() && myStack.peek()!='('){
                    ans.append(myStack.peek());
                    myStack.pop() ;
                }

                myStack.pop() ;



            }
// Now here i am adding the operators that were left for handling ;
            else{

//  Here also We have two woks to complete the First One is that if the
//  operator is already in the stack then check the priority of that with the priority of
//  the character that is coming

                while(!myStack.isEmpty() && priority(ch)<=priority(myStack.peek())){

                    ans.append(myStack.peek()) ;
                    myStack.pop() ;
                }

                myStack.push(ch) ;


            }
        }


//        now make your whole stack empty by adding the Left over operators to the StringBuilder

        while(!myStack.isEmpty()){

            ans.append(myStack.peek()) ;
            myStack.pop() ;


        }



        System.out.println(ans.toString()) ;




    }
}
