package AdvancedRecursion.Graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
     public static class AdjacentList{
        int n;
        List<List<Integer>> list ;
        public AdjacentList(int n){
            this.n = n ;
            list = new ArrayList<>();

            for(int i = 0 ; i<n+1 ; i++){
                list.add(new ArrayList<>());

            }
        }
        public void addEdge(int u , int v){
            list.get(u).add(v) ;
            list.get(v).add(u) ;

        }

        public void display(){
            int i = 0;
            for(List<Integer> li : list){

                System.out.println(i + " - " + li);
                i++;

            }
            System.out.println();

        }
    }
    public static void main(String []args){
        AdjacentList adjList = new AdjacentList(4);
        adjList.addEdge(1 ,2);
        adjList.addEdge(1, 3);
        adjList.addEdge(2 ,4);
        adjList.addEdge(3 ,4);
        adjList.display() ;



    }
}
