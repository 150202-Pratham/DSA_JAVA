package Heaps.Implementation.TopKElements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static class Pair implements Comparable<Pair>{
        int key ;
        int freqValue ;

        public Pair(int key , int value){
            this.key = key ;
            this.freqValue = value ;
        }
        @Override
        public int compareTo(Pair p){
            return this.key - p.key ;

        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>() ;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1) ;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>() ;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            pq.offer(new Pair(entry.getKey() , entry.getValue())) ;

        }

        int []result = new int[k] ;
        int it = 0 ;
        while( it < k ){
            Pair p = pq.poll() ;
            result[it] = p.key ;
            it++ ;

        }

        return result ;


    }

    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3} ;
        int k = 2;
        TopKFrequentElements tpk = new TopKFrequentElements() ;

        int []result = tpk.topKFrequent(nums, k);
        for(int elem : result){
            System.out.print(elem + " ");

        }
    }

}
