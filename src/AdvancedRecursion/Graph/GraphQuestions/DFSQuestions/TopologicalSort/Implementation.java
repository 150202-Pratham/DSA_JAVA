package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions.TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Implementation {
    public static class Graph{
        int n ;
        List<List<Integer>> adjacencyList ;

        public Graph(int n){
            this.n = n  ;
            adjacencyList = new ArrayList<List<Integer>>() ;

            for(int i = 0 ; i<n+1 ; i++){
                adjacencyList.add(new ArrayList<>()) ;

            }
        }
        public void addEdge(int u , int v){
            adjacencyList.get(u).add(v) ;

        }

        public void topologicalSort(){
            int []indegree = new int[n+1] ;

            for(int i = 1 ; i<=n ; i++){
                for(int j : adjacencyList.get(i)){
                    indegree[j]++ ;

                }
            }

            Queue<Integer> q = new LinkedList<>() ;
            for(int i = 1 ; i<=n ; i++){
                if(indegree[i]==0){
                    q.add(i) ;
                }
            }

            List<Integer> list = new ArrayList<>() ;
            while(!q.isEmpty()){
                int node = q.poll() ;
                list.add(node) ;
                for(int neighbour : adjacencyList.get(node)){
                    indegree[neighbour]-- ;
                    if(indegree[neighbour]==0){
                        q.add(neighbour) ;
                    }
                }

            }

            System.out.println(list) ;
        }

    }
    public static void main(String[] args) {
        int n = 9; // Number of nodes (1 to 9)
        Graph graph = new Graph(n);

        // Edges for complex DAG
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        graph.addEdge(3, 7);
        graph.addEdge(4, 7);
        graph.addEdge(5, 7);

        graph.addEdge(5, 8);
        graph.addEdge(6, 8);

        graph.addEdge(7, 9);
        graph.addEdge(8, 9);

        graph.topologicalSort();
    }

}
