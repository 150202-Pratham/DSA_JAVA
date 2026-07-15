package hashmap;

import java.util.*;

public class Intersection_Arrays {
    public static int[]  intersect_Arrays(int []arr ,int []brr){

        Set<Integer> set1 = new HashSet<>() ;

        ArrayList<Integer> mylist = new ArrayList<>() ;


        for(int i : arr){
            set1.add(i);
        }

        for(int i : brr){
            if(set1.contains(i)){
                mylist.add(i) ;
            }
        }

       int krr [] = new int [mylist.size()] ;

        for(int i = 0 ; i<mylist.size() ; i++){
            krr[i] = mylist.get(i) ;

        }


        return krr ;





    }

    public static void main (String args[]){

        int [] nums1 = {1,2,2,1} ;
        int [] nums2 = {2,2} ;

         int [] krr = intersect_Arrays(nums1 , nums2);

         System.out.println(Arrays.toString(krr)) ;








    }
}

