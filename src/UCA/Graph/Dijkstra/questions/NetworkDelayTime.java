package UCA.Graph.Dijkstra.questions;

import java.util.*;

public class NetworkDelayTime {
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


            for(int i = 0 ; i<=n ; i++){
                adjList.add(new ArrayList<>()) ;
            }


        }
        public void addEdge(int u , int v , int w){
            adjList.get(u).add(new Pair(v,w)) ;

        }

        public int[] algo(int source){
            int []distance =  new int[n+1];
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

    public static int networkDelayTime(int[][] times, int n, int k) {
        Graph gp = new Graph(n) ;

        for(int []edge : times){
            gp.addEdge(edge[0], edge[1] , edge[2]) ;
        }

        int []result = gp.algo(k) ;

        int answer = 0  ;

        for(int i = 1 ; i<=n ; i++){

            if(result[i]==Integer.MAX_VALUE){
                return -1 ;
            }
            answer = Math.max(answer, result[i]) ;

        }

        return answer ;


    }

    public static void main(String[] args) {
        int n = 4 ;
        int k = 2 ;

        int [][]times = {
                {2,1,1},
                {2,3,1},
                {2,4,1}
        };

        System.out.println(networkDelayTime(times , n , k)) ;


    }
}
