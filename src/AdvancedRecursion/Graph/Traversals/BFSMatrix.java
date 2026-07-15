package AdvancedRecursion.Graph.Traversals;

import java.util.*;

public class BFSMatrix {
    public static class Pair{
        int node ;
        int nodeDistance ;

        public Pair(int node , int nodeDistance){
            this.node = node;
            this.nodeDistance = nodeDistance ;

        }

    }
    public static class Graph{
        int n ;
        int [][] adjacent ;
        public Graph(int n){
            this.n = n;
            adjacent = new int[n+1][n+1] ;

        }

        void addEdge(int u ,int v){
            adjacent[u][v] = 1;
            adjacent[v][u] = 1;

        }

        void traversal(){
            for(int i = 1 ; i<adjacent.length ; i++){
                for(int j = 1 ; j<adjacent[i].length ; j++){
                    System.out.println(adjacent[i][j]+ " ");
                }
                System.out.println();
            }
        }

        void bfs(int start){
            boolean[]visited = new boolean[n+1] ;
            int []nodeDistance = new int[n+1] ;
            int []parent = new int[n+1] ;
            Queue<Pair> queue = new LinkedList<>() ;
            visited[start] = true ;
            queue.add(new Pair(start , 0)) ;

            while(!queue.isEmpty()){
                Pair pair = queue.poll();
                int node = pair.node ;
                int distance = pair.nodeDistance ;

                System.out.println(pair.node+" ");
                for(int i = 0 ; i<adjacent.length; i++){
                    if(adjacent[node][i]==1 && !visited[i]){
                        queue.offer(new Pair(node , distance+1)) ;
                        visited[i] = true;
                        nodeDistance[i] = distance+1 ;
                        parent[i] = node ;
                    }
                }
            }

            printDistance(nodeDistance) ;
            shortestPath(start , 4 , parent) ;


        }
       void printDistance(int[] nodeDistance){
            for(int value : nodeDistance){
                System.out.print(value + " ");
            }
           System.out.println();
       }
       void shortestPath(int start , int destination , int[]parent){
            List<Integer> list = new ArrayList<>() ;
            int current = destination;

             while(current!=0){
                 list.add(current);
                 current = parent[current] ;
             }

             Collections.reverse(list);
           System.out.println(list.toString()) ;
       }

    }
    public static void main(String []args){
        Graph graph = new Graph(4) ;

        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);

        graph.traversal();
        graph.bfs(1) ;



    }
}
