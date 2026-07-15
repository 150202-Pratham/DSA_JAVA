package AdvancedRecursion.Graph.GraphQuestions;

import java.util.*;

public class OpenTheLock {
    public static class Pair{
        String node ;
        int dis ;

        public Pair(String node, int dis){
            this.node = node ;
            this.dis = dis ;

        }

    }
     public static int openLock(String[] deadEnds, String target) {
         Set<String> dead = new HashSet<>(Arrays.asList(deadEnds));

         if(dead.contains("0000")) return -1 ;

         Queue<Pair> queue = new LinkedList<>() ;
         Set<String> visited = new HashSet<>() ;

         queue.add(new Pair("0000" , 0)) ;
         visited.add("0000") ;

         while(!queue.isEmpty()){
             Pair pair = queue.poll() ;
             String node = pair.node ;
            if(node.equals(target)){
                return pair.dis ;
            }
             for(String next: generateNeighbours(node)){
                 if(!dead.contains(next) &&  !visited.contains(next)){
                     visited.add(next) ;
                     queue.offer(new Pair(next, pair.dis + 1) ) ;
                 }
             }
         }
         return -1 ;

    }

    public static List<String> generateNeighbours(String node){
        List<String> result = new ArrayList<>() ;

       for(int i = 0 ; i<4 ; i++){
           char []arr = node.toCharArray() ;
           char ch = arr[i] ;


           arr[i] = (ch== '9')? '0' : (char)(ch+1) ;
           result.add(new String(arr)) ;


           arr[i] = (ch=='0')? '9' : (char)(ch+1);
           result.add(new String(arr)) ;

       }

       return result ;

    }
    public static void main (String[]args){
        String []deadEnds = {"0201","0101","0102","1212","2002"} ;
        String target = "0202" ;

        System.out.println(openLock(deadEnds, target));

    }
}
