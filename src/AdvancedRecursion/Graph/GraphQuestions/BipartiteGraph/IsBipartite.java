package AdvancedRecursion.Graph.GraphQuestions.BipartiteGraph;

import java.util.*;

public class IsBipartite {
    public static class Graph{
        int num ;
        List<List<Integer>> adjList ;

        public Graph(int value){
            this.num = value ;
            adjList = new ArrayList<>() ;

            for(int i = 0  ; i<num;  i++){
                adjList.add(new ArrayList<>()) ;
            }
        }
        public void addEdge(int u , int v){
            adjList.get(u).add(v) ;
            adjList.get(v).add(u) ;

        }
        public  boolean isBFS(int node , boolean []isVisited , Set<Integer> A , Set<Integer> B){
            Queue<Integer> q = new LinkedList<>() ;
            q.add(node) ;
            isVisited[node] = true ;
            A.add(node) ;
            while(!q.isEmpty()){
                int elem = q.poll() ;
                for(int neigh: adjList.get(elem)){
                  if(A.contains(neigh) && A.contains(elem)){
                      return false ;

                  }
                  if(B.contains(neigh) && B.contains(elem)){
                      return false ;

                  }

                  if(!isVisited[neigh]){
                      if(A.contains(elem)){
                          B.add(neigh) ;
                      }
                      else{
                          A.add(neigh) ;
                      }
                      isVisited[neigh] = true ;
                      q.add(neigh) ;
                  }
                }
            }

            return true ;

        }
    }
    public static void main(String[] args) {
        int [][] grid = {{1,2,3} , {0,2} , {0,1,3} , {0,2}} ;

        boolean []isVisited = new boolean[grid.length] ;
        Graph gp = new Graph(grid.length);

        for(int i = 0; i < grid.length; i++){
            for(int v : grid[i]){
                gp.addEdge(i, v);
            }
        }
        Set<Integer> A = new HashSet<>() ;
        Set<Integer> B = new HashSet<>() ;


        for(int i = 0 ; i <grid.length ; i++){
            if(!isVisited[i]){
                if(!gp.isBFS(i,isVisited,A , B)) {
                    System.out.println(false);
                    return ;

                }
            }
        }
        System.out.println(true);




    }
}
