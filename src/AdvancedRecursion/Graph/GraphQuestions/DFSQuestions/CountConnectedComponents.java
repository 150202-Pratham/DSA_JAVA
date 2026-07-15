package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountConnectedComponents {
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
        public void dfs(int node , boolean []isVisited){
            if(isVisited[node]){
                return ;
            }
            isVisited[node] = true ;
            for(int neighbour : adjacencyList.get(node)){
                dfs(neighbour , isVisited) ;

            }


        }
    }
    public static void main (String[]args){



        boolean [] isVisited = new boolean[4] ;
        Graph graph = new Graph(4) ;
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);


        int count = 0;
        for(int i = 1 ; i<=4 ; i++){
            if(!isVisited[i]){
                graph.dfs(i, isVisited) ;
                count++;
            }

        }

        System.out.println(count) ;


    }
}
