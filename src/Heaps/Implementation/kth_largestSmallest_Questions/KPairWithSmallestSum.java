package Heaps.Implementation.kth_largestSmallest_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KPairWithSmallestSum {
    public static class Pair implements Comparable<Pair>{
        int value1 ;
        int value2 ;

        public Pair(int value1 , int value2){
            this.value1 = value1;
            this.value2 = value2 ;

        }

        public int compareTo(Pair p){
            return Integer.compare((this.value1+this.value2) , (p.value1+p.value2)) ;

        }
    }

    public List<List<Integer>> kthSmallest(int []nums1 , int []nums2 , int k){
        PriorityQueue<Pair> pq = new PriorityQueue<>() ;
        List<List<Integer>> result = new ArrayList<>() ;

        for(int i = 0 ; i<nums1.length ; i++){
            for(int j = 0 ; j<nums2.length ; j++){
                pq.offer(new Pair(nums1[i],nums2[j])) ;
            }
        }

        while(k>0){
            Pair p = pq.poll() ;
            List<Integer> list = new ArrayList<>() ;
            list.add(p.value1) ;
            list.add(p.value2) ;
            k-- ;
            result.add(list) ;
        }

        return result ;
    }

    public static void main(String[] args) {
        KPairWithSmallestSum kps = new KPairWithSmallestSum() ;
        int []nums1 = {1,1,2} ;
        int []nums2 = {1,2,3} ;
        int k = 2 ;
        System.out.println(kps.kthSmallest(nums1 , nums2 , k));
    }

}
