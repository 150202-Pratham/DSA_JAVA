package UCA.Graph.Dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class NegativeImplementation {
    public static class Pair{
        int nodeValue;
        int weight ;

        public Pair(int nodeValue, int weight){
            this.nodeValue = nodeValue;
            this.weight = weight ;
        }
    }

    public static class State implements Comparable<State>{
        int node;
        int nodeDistance;

        public State(int nodeValue , int nodeDistance){
            this.node = nodeValue ;
            this.nodeDistance = nodeDistance;
        }

        @Override
        public int compareTo(State s){
            return this.nodeDistance - s.nodeDistance;

        }
    }
    public static class Graph{
        int n ;
        List<List<Pair>> adjList ;

        public Graph(int n){
            this.n = n ;
            adjList = new ArrayList<>() ;

            for(int i = 0 ; i<n ; i++){
                adjList.add(new ArrayList<>()) ;
            }

        }
        public void addEdge ( int u , int v ,int weight) {

            adjList. get(u) . add(new Pair(v , weight)) ;

        }

        public void algo(int source){
            int []distance = new int [n] ;

            for( int i = 0 ; i<n ; i++ ){

                distance[i] = Integer.MAX_VALUE ;

            }
            PriorityQueue<State> pq = new PriorityQueue<>() ;

            distance[source] = 0 ;
            pq.offer(new State(source , 0)) ;

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

            for(int elem : distance){
                System.out.print(elem+" ");

            }
            System.out.println();


        }

    }
    public static void main(String []args){

        Graph g = new Graph(3) ;

        g.addEdge(0 , 1, 5);
        g.addEdge(0 , 2 , 100) ;
        g.addEdge(2 , 1 , -150) ;

        g.algo(0) ;



    }
}
