package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyNumber {

    public static int getSumofSquares(int n){

        int sum  = 0 ;

        while(n!=0){
            int rem = n%10 ;

            sum+= rem*rem ;
            n /=10 ;

        }

        return sum ;


    }
    public static boolean isHappy(int n) {

        Set<Integer> myset  = new HashSet<>() ;

        while(n!=1 && !myset.contains(n)){


            myset.add(n) ;

            n = getSumofSquares(n) ;


        }




       return n==1;

    }
    public static void main(String[] args) {
        int num = 20;

        System.out.println(isHappy(num));
    }
}
