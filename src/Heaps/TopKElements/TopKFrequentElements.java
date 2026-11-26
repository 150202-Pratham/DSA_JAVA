package Heaps.TopKElements;

import java.util.*;

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


    public static int[] topKFrequentElements(int []nums , int k){

        HashMap<Integer, Integer> map = new HashMap<>() ;

        for(int num : nums){

            map.put(num , map.getOrDefault(num , 0)+1) ;

        }

        List<Integer> list = new ArrayList<>(map.keySet()) ;

        list.sort((a,b)->map.get(b) -map.get(a)) ;

        int []result = new int[k] ;

        for(int i = 0 ; i<k ; i++){
            result[i] = list.get(i) ;

        }
        return result ;
    }

    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3} ;
        int k = 2;
        TopKFrequentElements tpk = new TopKFrequentElements() ;

        int []result = tpk.topKFrequent(nums, k);
        int []output = tpk.topKFrequentElements(nums, k);
        for(int elem : output){
            System.out.print(elem + " ");

        }
    }

}
