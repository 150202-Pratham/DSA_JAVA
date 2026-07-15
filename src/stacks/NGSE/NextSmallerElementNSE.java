package stacks.NGSE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack ;

public class NextSmallerElementNSE {

    public static void main(String []args) throws Exception{

//        Dynamic Code

        int N ;

        InputStreamReader isr = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(isr) ;

        String outcome   = br.readLine() ;

        N = Integer.parseInt(outcome) ;

        int []arr  = new int[N] ;

        for(int i = 0 ; i<arr.length ; i++){

            arr[i] = Integer.parseInt(br.readLine()) ;

        }

        int []nse = new int[N] ;

        Stack<Integer>customStack = new Stack<>();

        for(int i= arr.length-1 ; i>=0 ; i--){

            while(!customStack.isEmpty() && customStack.peek()>=arr[i]){
                customStack.pop() ;

            }

            if(customStack.isEmpty()){
                nse[i] = -1;

            }
            else{
                nse[i] = customStack.peek() ;

            }

            customStack.push(arr[i]) ;
        }

        for(int i = 0 ; i<nse.length ; i++){

            System.out.print(nse[i]+" ") ;

        }

    }
}
