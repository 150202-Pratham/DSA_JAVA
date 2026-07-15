package stacks;

import java.util.Stack;

public class BaseBallGame {

    public static void main(String []args){

        String []operations = {"5","-2","4","C","D","9","+","+"} ;

        Stack<Integer> result = new Stack<>() ;

        int size = 0 , sum  = 0 ;

        for(int i = 0 ; i < operations.length ; i++){

            if(!result.isEmpty() && operations[i].equals("C")){
                sum-=result.peek() ;
                result.pop() ;
                size-- ;


            }
            else if(!result.isEmpty() && operations[i].equals("D")){

                result.push(result.peek()*2) ;
                sum+=result.peek() ;
                size++ ;

            }
            else if(!result.isEmpty() && operations[i].equals("+")){

                result.push(result.peek()+result.get(size-2)) ;
                size++ ;
                sum+=result.peek() ;


            }

            else{

                result.push(Integer.parseInt(operations[i]));
                sum+=result.peek() ;
                size++ ;


            }
        }


        System.out.println(sum) ;




    }
}
