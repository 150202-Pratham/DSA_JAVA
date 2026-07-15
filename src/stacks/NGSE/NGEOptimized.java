package stacks.NGSE;

import java.util.Arrays;
import java.util.Stack;

public class NGEOptimized {

    public static void main (String []args){

        int [] arr = {4,1,2,5,3,1,2,5,3,1,2,4,6} ;

        Stack<Integer>mystack = new Stack<>() ;
        int []nge  = new int[arr.length] ;


        for(int i = arr.length-1 ; i>=0 ; i--){

            while(!mystack.isEmpty() && arr[i]>=mystack.peek()){
                mystack.pop() ;

            }

            if(mystack.isEmpty()){
                nge[i] = -1 ;
            }
            else{
                nge[i] = mystack.peek() ;


            }

            mystack.push(arr[i]);
        }


        System.out.println(Arrays.toString(nge));
    }
}
