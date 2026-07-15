package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions;

import java.util.ArrayList;
import java.util.List;

public class DetectCycle {
    public static class Graph{
        int n ;
        List<List<Integer>> adjacentList ;

        public Graph(int n){
            this.n = n ;
            adjacentList = new ArrayList<>() ;
            for(int i = 0 ; i<n+1 ; i++){
                adjacentList.add(new ArrayList<>()) ;
            }
        }

        public void addEdge(int u , int v){
            adjacentList.get(u).add(v) ;
            adjacentList.get(v).add(u) ;
        }

        public boolean DFS(int node , int parent , boolean []isVisited){

            isVisited[node] = true;
            for(int neighbour: adjacentList.get(node)){
                if(!isVisited[neighbour]) {
                    System.out.println(neighbour);
                    if (DFS(neighbour, node, isVisited)){
                        return true;
                    }
                }
                else if(neighbour!=parent){
                    System.out.println( neighbour);
                    return true ;
                }

            }

            return false ;
            
        }

        public int countNodes(int node , int parent, boolean []isVisited){
            isVisited[node] = true ;

            int count = 1 ;
            for(int neighbour :  adjacentList.get(node)){
                if(!isVisited[neighbour]) {
                    count+= countNodes(neighbour,node, isVisited) ;

                }

            }

            return count ;

        }

    }

    public static void main(String []args){
        Graph g = new Graph(7) ;
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 3);




        boolean isVisited[] = new boolean[8] ;

//        g.DFS(1, -1,isVisited);
        System.out.println(g.countNodes(1,-1,isVisited));

    }
}
