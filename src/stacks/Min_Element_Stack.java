package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Min_Element_Stack {
    private Stack<Map<Integer,Integer>>myStack;


    public Min_Element_Stack(){

        myStack = new Stack<>() ;
    }

    public void push(int val) {

        int minElem = myStack.isEmpty()? val : Math.min(val , getMin());

        Map<Integer , Integer> mymap  = new HashMap<>() ;
        mymap.put(val , minElem) ;

        myStack.push(mymap) ;



    }

    public void pop() {

        if(!myStack.isEmpty()){
            myStack.pop() ;

        }
    }

    public int top() {

        if(!myStack.isEmpty()){
           Map<Integer, Integer> e = myStack.peek() ;


           return e.keySet().iterator().next();

        }
        return 0 ;


    }

    public int getMin() {

        if(!myStack.isEmpty()){
            Map<Integer, Integer> e = myStack.peek() ;


            return e.values().iterator().next();

        }
        return 0 ;

    }


    public static void main(String[] args) {

        Min_Element_Stack stack = new Min_Element_Stack() ;

        stack.push(5) ;
        stack.push(6) ;
        stack.push(7) ;
        stack.push(8) ;

        stack.pop() ;
        int value  = stack.getMin() ;
        System.out.println(value) ;

        int top_Value= stack.top() ;

        System.out.println(top_Value) ;

    }


}
