package AdvancedRecursion.GreedyAlgorithmn;

import java.sql.SQLOutput;
import java.util.*;

public class ActivitySelectionProblem {
    public static class Activity{
        int start;
        int end ;

        public Activity(int start , int end){
            this.start = start ;
            this.end = end ;

        }
    }

    public static  int maxActivities(int []start , int []end){

        List<Activity> list = new ArrayList<>() ;

//        make the list populated for start and end
        for(int i = 0 ; i<start.length ; i++){
            list.add(new Activity(start[i] , end[i])) ;
        }

//        Now you have successfully sorted  the list through end time ;

        list.sort(new Comparator<Activity>(){

            @Override
            public int compare(Activity o1, Activity o2) {
                return Integer.compare(o1.end , o2.end) ;
            }
        });
//      Now Find the Maximum Field Value
        int minLast = list.get(0).end ;
        int count = 1 ;

        for(int i = 1 ; i<list.size() ; i++){

            if(list.get(i).start>minLast){
                count++ ;
                minLast = list.get(i).end ;
            }
        }



        return count ;


    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals , new Comparator<int[]>(){
            public int compare( int[] o1 , int[] o2){
                return  Integer.compare(o1[1] , o2[1]) ;

            };

        });

        int minLast = intervals[0][1] ;
        int count = 1 ;

        for(int i = 1 ; i<intervals.length ; i++){

            if(intervals[i][0]>=minLast){
                count++ ;
                minLast = intervals[i][1] ;

            }
        }

        return  intervals.length - count ;

    }

//    We need to make a List and items to it

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};

//        System.out.println(maxActivities(start , end));

        int [][]intervals = {{1,2} , {2,3} , {3,4} , {1,3}} ;

        System.out.println(eraseOverlapIntervals(intervals));
    }



}
