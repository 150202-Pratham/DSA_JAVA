package AdvancedRecursion.GreedyAlgorithmn.GreedyQuestions;

import java.util.Arrays;

public class AssignCookies {
    public static int assignCookies(int []s , int []k){
        int i = 0 ;
        int j = 0 ;
        boolean status = true ;

        Arrays.sort(s) ;
        Arrays.sort(k) ;
        int count = 0 ;

        while(i<s.length && j<k.length ){

            status = false ;

            if(k[j]>=s[i]){
                status = true ;
                i++ ;

            }
            if(status) count ++ ;
            j++;

        }

        return count ;


    }
    public static void main(String[] args) {
        int []students = {1 ,2,3} ;
        int []cookies = {1,1} ;

        System.out.println(assignCookies(students , cookies)) ;

    }
}
