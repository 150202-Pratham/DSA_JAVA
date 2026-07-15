package recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int number = scanner.nextInt() ;

       System.out.print( myfact(number));





    }


    public static int myfact(int n) {
        if(n==0 || n==1){
            return 1 ;

        }

        return n*myfact(n-1);

    }
}
