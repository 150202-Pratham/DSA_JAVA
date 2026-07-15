package stacks.NGSE;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class StockSpan {

    public static class Pair{
        int first ;
        int second ;

        public Pair(int start , int second){
            this.first = start;
            this.second = second;

        }

    }
    public static ArrayList<Integer> Combinatorics(int []arr){

        Stack<Pair> st = new Stack<>() ;
        ArrayList<Integer> list = new ArrayList<>() ;

        for(int i = 0 ; i<arr.length ; i++){

            while(!st.isEmpty() && arr[i]>=st.peek().first){

                    st.pop() ;

            }
            if(st.isEmpty()){
                list.add(-1) ;
            }

            else {
                list.add(st.peek().second) ;

            }

            st.push(new Pair(arr[i] , i)) ;
        }


//        Now we will subtract the Index of  NGL from the list to make it the original answer

        for(int i = 0 ; i<list.size() ; i++){

             list.set(i , i-list.get(i)) ;


        }

        return list ;


    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;

        int []arr = new int[n] ;

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt() ;

        }

        System.out.println(Combinatorics(arr));





    }
}
