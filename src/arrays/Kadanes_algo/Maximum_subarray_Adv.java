package arrays.Kadanes_algo;

import java.util.ArrayList;
import java.util.List;

public class Maximum_subarray_Adv {
    public static List<Integer> Maximum_Subarr(int arr[]){

        List<Integer> myList = new ArrayList<>() ;
        int sum = 0 , max_Sum  = Integer.MIN_VALUE ;
        int start = 0 ;
        int aboutStart = -1 ;
        int aboutEnd = -1 ;



        for(int i = 0 ; i<arr.length ; i++){

            if(sum==0){
                start =  i ;
            }

            sum+=arr[i] ;

            if(sum>max_Sum){

                max_Sum = sum ;

                aboutStart = start ;

                aboutEnd = i ;
            }

            if(sum<0){
                sum = 0 ;


            }



        }


       myList.add(aboutStart);
       myList.add(aboutEnd) ;
        System.out.println(aboutStart) ;
       System.out.println(aboutEnd) ;

        return myList ;


    }

    public static void main(String []args){

        int arr[] = {-2,-3,4,-1,-2,1,5,-3} ;

        List<Integer> output = new ArrayList<>() ;

        output =  Maximum_Subarr(arr);

        System.out.println(output) ;


    }


}
