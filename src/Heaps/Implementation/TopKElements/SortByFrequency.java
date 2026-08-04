package Heaps.Implementation.TopKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortByFrequency {
    public class Pair implements Comparable<Pair>{
        char st ;
        int freq ;

        public Pair(char st , int freq){
            this.st = st ;
            this.freq =  freq ;
        }

        public int compareTo(Pair p){
            return Integer.compare(p.freq , this.freq) ;
        }
    }
    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>() ;

        for(char st : s.toCharArray()){

            map.put(st, map.getOrDefault(st,0)+1) ;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>() ;

        for(Map.Entry<Character,Integer> elem : map.entrySet()){

            pq.offer(new Pair(elem.getKey() , elem.getValue())) ;

        }
        StringBuilder str = new StringBuilder() ;

        while(!pq.isEmpty()){
            Pair curr = pq.poll() ;

            for(int i = 0 ; i<curr.freq ; i++){
                str.append(curr.st) ;
            }
        }

        return str.toString() ;


    }

    public static void main(String[] args) {
        SortByFrequency sort = new SortByFrequency() ;
        System.out.println(sort.frequencySort("tree") );

    }
}
