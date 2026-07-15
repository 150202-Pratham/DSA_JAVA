package stacks.NGSE;

import java.util.Stack;

public class Problem132 {
    public static boolean solve(int []arr){
        Stack<Integer> st =  new Stack<>() ;
        int third = Integer.MIN_VALUE ;

        for(int i = arr.length-1  ; i>=0 ; i--){
//           1 << 2 ( third element ;
            if(arr[i]<third) return true ;

//            this condition is basically to find or change the value of the third element

            while(!st.isEmpty() && arr[i]>st.peek()){
                third = st.pop() ;

            }

            st.push(arr[i]) ;

        }

        return false ;

    }
    public static void main(String[] args) {
        int []arr = {6,12,3,4,6,11,20} ;
        System.out.println(solve(arr)) ;

    }
}
