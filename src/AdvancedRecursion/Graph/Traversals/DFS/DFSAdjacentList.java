package AdvancedRecursion.Graph.Traversals.DFS;

import java.util.ArrayList;
import java.util.List;

public class DFSAdjacentList {
    public static  class Graph{
         private int n ;
         private List<List<Integer>> list ;

         public Graph(int n){
             this.n = n ;
             list = new ArrayList<>() ;

             for(int i = 0 ; i<n+1 ; i++){
                 list.add(new ArrayList<>()) ;
             }

         }

         public void addEdges(int u , int v){
             list.get(u).add(v) ;
             list.get(v).add(u) ;
         }
         public void dfs(int node , boolean []isVisited){
             if(isVisited[node]){
                 return ;
             }
             System.out.print(node+ " ") ;
             isVisited[node] = true ;

             for(int neighbour : list.get(node)){
                 if(!isVisited[neighbour]){
                     dfs(neighbour , isVisited) ;

                 }
             }
         }


    }
    public static void main(String[] args) {
        Graph g = new Graph(4) ;
        g.addEdges(1,2) ;
        g.addEdges(1,3) ;
        g.addEdges(2,4) ;
        g.addEdges(3,4) ;

        boolean isVisited[] = new boolean[5] ;
        g.dfs(1,isVisited) ;

     }
}
