package recursion;

import org.w3c.dom.ls.LSOutput;

public class Recursion_5432112345 {

    public static void main(String[] args) {

        printNos(5) ;

    }
    static void printNos(int n) {

        if(n==0){

            return ;

        }
        System.out.print(n+ " ") ;

        printNos(n-1) ;

        System.out.print(n + " ");

    }




}
