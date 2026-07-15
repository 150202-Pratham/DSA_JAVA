package recursion;

import java.util.Scanner;

public class CountZeroes {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0 ;

        System.out.print(countZero(n , count ));

    }
    public static int countZero(int n , int count){
        if(n==0){
            return count;

        }


        if(n%10==0){
            count+=1 ;
            return countZero(n/10 , count)  ;

        }

        return countZero(n/10 , count) ;

    }
}
