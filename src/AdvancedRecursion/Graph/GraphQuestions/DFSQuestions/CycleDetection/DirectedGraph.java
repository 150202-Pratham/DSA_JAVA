package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions.CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph {
    public static class Graph{
        int n ;
        List<List<Integer>> adjacencyList ;

        public Graph(int n){
            this.n = n ;
            adjacencyList = new ArrayList<>() ;

            for(int i = 0 ; i<n+1 ; i++){
                adjacencyList.add(new ArrayList<>()) ;
            }
        }
        void addEdge(int u , int v){
            adjacencyList.get(u).add(v) ;

        }
        boolean hasCycle(){
            int []state = new int [n+1] ;
            for(int i = 1 ; i<=n ; i++){
                if(hasCycleDFS(i,state)) return true ;
            }
            return false ;

        }
        boolean hasCycleDFS(int node , int []state){
            if(state[node]==1) return true ;
            if(state[node]==2) return false ;

            state[node] = 1 ;
            for(int neighbour : adjacencyList.get(node)){
                if(hasCycleDFS(neighbour , state)) return true ;
            }

            state[node] = 2 ;
            return false ;

        }
    }
    public static void main(String []args){
        Graph g = new Graph(9);

        /* Component 1 */
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 3);   // cycle (3 → 4 → 5 → 3)

        /* Component 2 */
        g.addEdge(6, 7);
        g.addEdge(7, 8);
        g.addEdge(8, 9);
        g.addEdge(9, 7);   // cycle (7 → 8 → 9 → 7)

        /* Cross edge */
        g.addEdge(5, 7);


        // Start DFS from node 1
        boolean status = g.hasCycle();
        System.out.println(status);

    }
}
