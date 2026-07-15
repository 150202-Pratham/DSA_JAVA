package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions.TopologicalSort;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public static class Graph{
        int n;
        List<List<Integer>> adjacencyList ;

        public Graph(int n){
            this.n = n ;
            adjacencyList = new ArrayList<List<Integer>>();

            for(int i = 0 ; i<n+1 ; i++){
                adjacencyList.add(new ArrayList<>()) ;

            }
        }

        public void addEdge(int u , int v){
            adjacencyList.get(u).add(v) ;
        }
        public boolean hasCycle(){
            int []state = new int[n+1] ;
            for(int i = 1 ; i<=n ; i++){
                if(state[i]==0){
                   if(hasCycleDFS(i, state)){
                       return true ;
                   }
                }
            }

            return false ;

        }

        public boolean hasCycleDFS(int node , int []state){
            if(state[node]==1) return true ;
            if(state[node]==2) return false ;
            state[node] = 1 ;

            for(int neighbour : adjacencyList.get(node)){
                if(state[neighbour]==0) {
                    if(hasCycleDFS(neighbour, state)) return true ;

                }
            }

            state[node] = 2 ;
            return false ;


        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(2) ;

        int [][]pre = {{1,0}} ;

        for(int [] elem : pre){
            graph.addEdge(elem[1] , elem[0]) ;
        }

        System.out.println(!graph.hasCycle()) ;


    }
}
