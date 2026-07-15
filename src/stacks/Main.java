package stacks;

public class Main {

    public static void main(String args[]) throws Exception{

        CustomStack mystack = new CustomStack();

        mystack.push(10) ;
        mystack.push(20) ;

        System.out.println(mystack.peek()) ;
        System.out.println(mystack.pop()) ;




    }
}
