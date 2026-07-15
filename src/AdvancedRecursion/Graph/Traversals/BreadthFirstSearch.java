package AdvancedRecursion.Graph.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public static class Graph{
        List<List<Integer>> list ;
        int n ;

        public Graph(int n){
            this.n = n ;
            list = new ArrayList<>() ;

            for(int i = 0 ; i<n+1 ; i++){
                list.add(new ArrayList<>()) ;
            }
        }

        public  void addEdge(int u , int v){
            list.get(u).add(v) ;
            list.get(v).add(u) ;
        }

        public void display(){
            for(List<Integer> li : list ){
                System.out.println(li);
            }
            System.out.println();
        }
//        Now making its First Iteration using BFS

        public void BFS(int start){
            boolean []visited =  new boolean[n+1] ;
            Queue<Integer> queue = new LinkedList<>() ;
            visited[start] = true ;

            queue.add(start) ;
            while(!queue.isEmpty()){
                int node = queue.poll() ;
                System.out.print(node+" ");

                for(int neighbour: list.get(node)){
                    if(!visited[neighbour]){
                        visited[neighbour] = true ;
                        queue.add(neighbour) ;
                    }
                }


            }

        }

    }
    public static void main(String[] args) {
        Graph gp = new Graph(4) ;
        gp.addEdge(1,2);
        gp.addEdge(1,3);
        gp.addEdge(2,4);
        gp.addEdge(3,4);

        gp.display() ;

        gp.BFS(1) ;


    }

}
