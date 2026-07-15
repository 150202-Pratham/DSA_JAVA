package UCA.Graph.Dijkstra;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class ShortestPath {

    public static class Pair{
        private final int node ;
        private final int weight ;

        public Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }

    }

    public static class State implements Comparable<State>{
        private final int node ;
        private final int nodeDistance ;

        public State(int node, int nodeDistance){
            this.node = node ;
            this.nodeDistance = nodeDistance ;

        }

        @Override
        public int compareTo(State s){
            return Integer.compare(this.nodeDistance , s.nodeDistance) ;

        }
    }

    public static class Graph{
        private final int n ;
        private final List<List<Pair>> adjList ;

        public Graph(int n){
            this.n = n ;
            adjList = new ArrayList<>() ;

            for(int i = 0 ; i<n ; i++){
                adjList.add(new ArrayList<>()) ;

            }
        }

        public void addEdge(int u ,int v , int w){
            adjList.get(u).add(new Pair(v,w));
            adjList.get(v).add(new Pair(u,w)) ;

        }

        public int[] dijkstra(int source){
            int []distance = new int[n] ;
            Arrays.fill(distance , Integer.MAX_VALUE) ;

            int []parent = new int[n] ;
            for(int i = 0 ; i<n ; i++){
                parent[i] = i ;
            }

            PriorityQueue<State> pq = new PriorityQueue<>() ;
            pq.offer(new State(source,0)) ;
            distance[source] = 0 ;

            while(!pq.isEmpty()){

                State p = pq.poll() ;

                if(p.nodeDistance > distance[p.node]){
                    continue ;
                }

                for(Pair neighbour : adjList.get(p.node)) {
                    int newDistance = p.nodeDistance + neighbour.weight;
                    if (newDistance < distance[neighbour.node]) {
                        distance[neighbour.node] = newDistance;
                        parent[neighbour.node] = p.node;
                        pq.offer(new State(neighbour.node, newDistance));

                    }

                }
            }

            return parent ;
        }

        public List<Integer> shortestPath(int []parent, int destination , int source){

            List<Integer> list = new ArrayList<>() ;
            int current = destination;
            while(current!=source){
                list.add(current) ;
                current = parent[current] ;

            }
            list.add(source) ;
            Collections.reverse(list) ;
            return list;
        }
    }


    public static void main(String[] args) {
        int n = 4 ;
        Graph gp = new Graph(4);
        gp.addEdge(0,1,4);
        gp.addEdge(0,2,1);
        gp.addEdge(2,3,2);
        gp.addEdge(1,3,5);

        int[]parent = gp.dijkstra(0);
        List<Integer> output = gp.shortestPath(parent , 3, 0) ;

        System.out.println(output);


    }
}
