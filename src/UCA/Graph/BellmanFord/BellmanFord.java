package UCA.Graph.BellmanFord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellmanFord {
    public static class Edge{
        int source ;
        int destination ;
        int weight ;

        public Edge(int source , int destination , int weight){
            this.source = source ;
            this.destination = destination ;
            this.weight = weight ;

        }
    }

    public static class Graph{
        int n ;
        List<Edge> edges ;

        public Graph(int n){
            this.n = n ;
            edges =  new ArrayList<>() ;

        }

        public void addEdge(int source , int destination , int weight){
            edges.add(new Edge(source,destination , weight)) ;
        }

        public void bellmanFord(int source){
            int []distance = new int[n] ;
            Arrays.fill(distance , Integer.MAX_VALUE) ;
            distance[source] = 0 ;

//            We know that the Maximum shortest path contians v-1 edges

            for(int i =1 ; i<=n-1 ; i++){

                for(Edge e : edges){
                   if(distance[e.source]!=Integer.MAX_VALUE && distance[e.source]+e.weight < distance[e.destination]){
                       distance[e.destination] = distance[e.source]+e.weight ;
                   }
                }
            }

//                  Negative Cycle Detection
            for(Edge e : edges){
                if(distance[e.source]!=Integer.MAX_VALUE && distance[e.source]+e.weight< distance[e.destination]){
                    System.out.println("Negative Weight Cycle Detected") ;
                    return ;

                }
            }

//            shortest distance
            for(int i = 0 ; i<n ; i++){
                System.out.println("Source"+"->"+i+"="+distance[i]);

            }

            System.out.println(Arrays.toString(distance)) ;

        }

    }

    public static void main(String[] args) {
        Graph gp = new Graph(5);
        gp.addEdge(0,1,-1);
        gp.addEdge(0,2,4);
        gp.addEdge(1,2,3);
        gp.addEdge(1,3,2);
        gp.addEdge(1,4,2) ;
        gp.addEdge(3,2,5) ;
        gp.addEdge(3,2,5) ;
        gp.addEdge(3,1,1);
        gp.addEdge(4,3,-3) ;

        gp.bellmanFord(0);
    }
}
