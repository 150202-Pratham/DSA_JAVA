package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions;

import java.util.ArrayList;
import java.util.List;

public class CountCycles {
    public static class Graph{
        int n;
        List<List<Integer>> adjacencyList ;
        public Graph(int n){
            this.n = n ;
            adjacencyList = new ArrayList<>() ;

            for(int i = 0 ; i<n+1 ; i++){
                adjacencyList.add(new ArrayList<>()) ;

            }
        }
        public void addEdge(int u , int v){
            adjacencyList.get(u).add(v) ;
            adjacencyList.get(v).add(u) ;
        }
        public int hasCycle(boolean []visited){
            int count = 0 ;

            for(int i = 1 ; i<=n ; i++){
                if(!visited[i]){
                    count+= dfsCount(i , -1, visited) ;
                }

            }

            return count/2;
        }
        public boolean hasCycleDFS(int node , int parent , boolean []visited){
            visited[node] = true;
            for(int neighbour: adjacencyList.get(node)){
                if(hasCycleDFS(neighbour, node, visited)){
                    return true;
                }
                else if(neighbour!=parent){
                    return true ;
                }
            }

            return false ;

        }
        public int dfsCount(int node , int parent , boolean []isVisited){

            int count = 0 ;

            isVisited[node] = true ;
            for(int neighbour : adjacencyList.get(node)){
                if(!isVisited[neighbour]){
                    count+= dfsCount(neighbour , node , isVisited);

                }

                else if(neighbour!=parent){
                    count++;

                }

            }

            return count ;

        }
    }
    public static void main(String[] args) {
        Graph g =  new Graph(7);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 3);

        boolean []visited = new boolean[8] ;
        System.out.println(g.hasCycle(visited));

    }
}
