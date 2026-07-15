package UCA.Graph.Dijkstra;

import java.util.*;

public class Implementation {
    public static  class Pair{
        int nodeValue ;
        int weight;

        public Pair(int nodeValue , int weight){
            this.nodeValue = nodeValue ;
            this.weight = weight;
        }
    }

    public static class State{
        private int node;
        private  int nodeDistance ;


        public State(int node , int distance){
            this.node = node ;
            this.nodeDistance = distance ;

        }

    }

    public static class Graph{
        private final int n;
        private final  List<List<Pair>> adjList ;
        public int[]distance ;

        public Graph(int n){
            this.n = n ;
            adjList = new ArrayList<>() ;
            distance = new int[n] ;

            for(int i = 0 ; i<n ; i++){
                adjList.add(new ArrayList<>());
            }

            Arrays.fill(distance , Integer.MAX_VALUE);
        }

        public void addEdge(int u ,int v , int nodeDistance){
            adjList.get(u).add(new Pair(v,nodeDistance)) ;
            adjList.get(v).add(new Pair(u,nodeDistance)) ;
        }

        public void dJK(int source){
           distance[source]=0;
            PriorityQueue<State> pq = new PriorityQueue<>(new Comparator<State>(){
                @Override
                public int compare(State o1, State o2) {
                    return Integer.compare(o1.nodeDistance,o2.nodeDistance);

                }
            }) ;

            pq.offer(new State(source, 0)) ;

            while(!pq.isEmpty()){

                State s = pq.poll() ;

                if(s.nodeDistance > distance[s.node]){
                    continue ;
                }

                for( Pair neighbour  : adjList.get(s.node)){
                    int newWeight = s.nodeDistance + neighbour.weight ;

                    if(newWeight < distance[neighbour.nodeValue]){
                        distance[neighbour.nodeValue] = newWeight ;
                        pq.offer(new State(neighbour.nodeValue, newWeight)) ;

                    }
                }

            }

        }

        public  void display(){
            for(int elem : distance){
                System.out.print(elem+" ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Graph gp = new Graph(4);
        gp.addEdge(0,1,4);
        gp.addEdge(0,2,1);
        gp.addEdge(2,3,2);
        gp.addEdge(1,3,5);

        gp.dJK(0);
        gp.display() ;

    }
}
