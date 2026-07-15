package AdvancedRecursion.Graph.Traversals.DFS.noShortestPath;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistance {

    public  static class Graph{
        int n ;
        List<List<Integer>> AdjacencyList ;

        public Graph(int n){
            this.n = n ;
            AdjacencyList = new ArrayList<>() ;

            for(int i = 0 ; i<n+1 ; i++){
                AdjacencyList.add(new ArrayList<>()) ;
            }
        }

        public void addEdge(int u , int v){
            AdjacencyList.get(u).add(v) ;
            AdjacencyList.get(v).add(u) ;
        }

        public  void DFS(int startNode , boolean []isVisited , int []nodeDistance){

            if(isVisited[startNode]){
                return ;
            }
            isVisited[startNode] = true ;

            for(int neighbour : AdjacencyList.get(startNode)){

                if(!isVisited[neighbour]){
                    nodeDistance[neighbour] = nodeDistance[startNode]+1 ;
                    DFS(neighbour , isVisited , nodeDistance);
                }
            }




        }

        public void printNodeDistance(int []nodeDistance ,int startNode){
            for(int value : nodeDistance){
                System.out.print(value + " ");
            }
            System.out.println();
        }



    }

}
