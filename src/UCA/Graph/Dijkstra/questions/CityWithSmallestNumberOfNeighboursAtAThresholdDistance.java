package UCA.Graph.Dijkstra.questions;

import java.util.*;

public class CityWithSmallestNumberOfNeighboursAtAThresholdDistance {
   public static class Pair{
       private final int node ;
       private final int weight ;

       public Pair(int node , int weight){
           this.node = node ;
           this.weight = weight ;

       }
   }

   public static class State{
       private final  int  node ;
       private final int nodeDistance ;

       public State(int node ,int nodeDistance) {
           this.node = node;
           this.nodeDistance = nodeDistance;
       }

   }

    public static class Graph{
        private final int n ;
        private final List<List<Pair>> adjList ;


        public Graph(int num){
            this.n = num;
            adjList = new ArrayList<>() ;


            for(int i = 0 ; i<n ; i++){
                adjList.add(new ArrayList<>()) ;
            }


        }
        public void addEdge(int u , int v , int w){
            adjList.get(u).add(new Pair(v,w)) ;
            adjList.get(v).add(new Pair(u,w)) ;
        }

        public int[] algo(int source){
            int []distance =  new int[n] ;
            Arrays.fill(distance , Integer.MAX_VALUE) ;
            distance[source]=0;

            PriorityQueue<State> pq = new PriorityQueue<>(
                    new Comparator<State>() {
                        @Override
                        public int compare(State o1, State o2) {
                            return Integer.compare(o1.nodeDistance , o2.nodeDistance) ;
                        }
                    }
            ) ;
            pq.offer(new State(source , 0)) ;

            while(!pq.isEmpty()){
                State s = pq.poll() ;
                if(s.nodeDistance > distance[s.node]){
                    continue ;

                }
                for(Pair neighbour : adjList.get(s.node)){
                    int newWeight = neighbour.weight + s.nodeDistance;

                    if(newWeight<distance[neighbour.node]){
                        distance[neighbour.node] = newWeight ;
                        pq.offer(new State(neighbour.node, newWeight)) ;

                    }
                }
            }

            return distance ;


        }

    }

    public static int findCity(int n , int[][]edges , int distanceThreshold){
       Graph gp = new Graph(n) ;

       for(int []edge : edges){
           gp.addEdge(edge[0], edge[1] , edge[2]) ;
       }

       int minimumReachableCities = Integer.MAX_VALUE ;
       int answer = -1 ;

       for(int i = 0 ; i<n ; i++){
           int []result = gp.algo(i);
           int reachableCities = 0 ;

           for(int d: result){
               if(d<=distanceThreshold){
                   reachableCities++ ;
               }
           }

           reachableCities -- ;

           if(reachableCities<=minimumReachableCities){
               minimumReachableCities = reachableCities ;
               answer = i ;
           }


       }

       return answer ;

    }

    public static void main(String []args){

       int n = 4 ;
       int [][]edges = {
               {0,1,3},
               {1,2,1},
               {1,3,4},
               {2,3,1}
       };
       int distanceThreshHold = 4 ;
       int answer = findCity(n, edges, distanceThreshHold) ;
       System.out.println(answer) ;


    }
}
