package UCA.Graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static class Graph{
        int n;
        List<List<Integer>> adjList ;

        public Graph(int n){
            this.n = n ;
            adjList = new ArrayList<>();

            for(int i = 0 ; i<n+1 ; i++){
                adjList.add(new ArrayList<>());
            }
        }
        public void addEdge(int u , int v){
            adjList.get(u).add(v) ;
            adjList.get(v).add(u) ;
        }
        public void display(){
            int i = 0;
            for(List<Integer> li : adjList){

                System.out.println(i + " - " + li);
                i++;

            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        Graph gp = new Graph(4);
        gp.addEdge(1,2);
        gp.addEdge(1,3);
        gp.addEdge(2,4);
        gp.addEdge(3,4) ;
        gp.display() ;


    }
}
