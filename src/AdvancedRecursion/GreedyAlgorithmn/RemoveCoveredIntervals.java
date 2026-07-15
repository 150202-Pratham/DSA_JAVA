package AdvancedRecursion.GreedyAlgorithmn;


import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredIntervals {
    public static int removeOrdered(int[][]intervals){

//        Firstly We will Sort the array

        Arrays.sort(intervals , new Comparator<int[]>(){
            public  int compare(int []o1 , int []o2){
                if(o1[0]==o2[0]) return o2[1] - o1[1] ;
                return o1[0] - o2[0] ;
            }
        });

//        Now what next Step is after sorting we want need to Count

        int count = 0 ;
        int maxEnd = 0 ;
        for(int []obj : intervals){
            if(obj[1]>maxEnd){
                count++ ;
                maxEnd = obj[1] ;
            }

        }
        return count;

    }
    public static void main(String[] args) {
        int [][]intervals = {{1,4} , {3,6} , {2,8}} ;

//        See Now , I Need to call the Function to Sort the Array in the Comparator i want

        System.out.println(removeOrdered(intervals));



    }

}
