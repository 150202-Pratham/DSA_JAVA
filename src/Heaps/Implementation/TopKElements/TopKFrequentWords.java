package Heaps.Implementation.TopKElements;

import java.util.*;

public class TopKFrequentWords {
   public static class Pair implements Comparable<Pair>{
       String str ;
       int freq ;

       public Pair(String str , int freq){
           this.str = str ;
           this.freq = freq ;
       }

       @Override
       public int compareTo(Pair p){
           if(this.freq != p.freq){
               return p.freq-this.freq ;
           }
           return this.str.compareTo(p.str);

       }
   }

   public static List<String> topKFrequentWords(String[] words, int k) {
       Map<String,Integer> map = new HashMap<>() ;

       for(String st : words){
           map.put(st, map.getOrDefault(st,0)+1) ;
       }

       PriorityQueue<Pair> pq = new PriorityQueue<>() ;

       for(Map.Entry<String,Integer> entry : map.entrySet()){
           pq.offer(new Pair(entry.getKey() , entry.getValue()));
       }

       List<String> list = new ArrayList<>() ;
       while(k-- > 0){
           list.add(pq.poll().str) ;

       }

       return list ;

   }
    public static void main(String[] args) {
        TopKFrequentWords top = new TopKFrequentWords();
        String []words = {"i","love","leetcode","i","love","coding"} ;
        int k = 2  ;
        System.out.println(top.topKFrequentWords(words, k));
    }
}
