package arrays.TwoPointer_SlidingWindow.TwoPointers;

import java.util.Arrays;

public class NumberOfBoats {
    public static int numRescueBoats(int[] people, int limit) {
        int count = 0 ;
        Arrays.sort(people) ;


        int i = 0 , j = people.length-1 ;

        while(i<=j){

            int sum = people[i]+people[j] ;

            if(sum <= limit){

                i++;
                j--;

            }
            else{
               j-- ;

            }

            count++ ;
            
        }
        return count ;

    }
    public static void main(String[] args) {


        int arr[] = {3,2,2,1} ;

        System.out.println(NumberOfBoats.numRescueBoats(arr , 3));


    }
}
