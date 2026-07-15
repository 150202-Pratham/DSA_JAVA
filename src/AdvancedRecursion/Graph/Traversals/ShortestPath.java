package AdvancedRecursion.Graph.Traversals;

import java.util.*;

public class ShortestPath {
    public static class Pair{
         int value ;
         int nodeVal ;

        public Pair(int value , int nodeVal){
            this.value = value;
            this.nodeVal = nodeVal;
        }
    }
    public static class Graph{
        int n ;
        List<List<Integer>> adjacentList ;

        public Graph(int n){
            this.n  = n ;
            adjacentList = new ArrayList<>();

            for(int i = 0 ; i<n+1 ; i++){
                adjacentList.add(new ArrayList<>());
            }
        }
        public void addEdge(int u ,int v){
            adjacentList.get(u).add(v);
            adjacentList.get(v).add(u);
        }

        public void BFS(int start){
            boolean []visited = new boolean[n+1] ;
            int []store = new int[n+1] ;

            Queue<Pair> queue = new LinkedList<>();
            visited[start] = true;
            queue.add(new Pair(start, 0));

            while(!queue.isEmpty()){
                Pair pair = queue.poll() ;
                System.out.print(pair.value+" ") ;

                for(int i = 0 ; i<adjacentList.get(pair.value).size() ; i++){
                    if(!visited[adjacentList.get(pair.value).get(i)]){
                        visited[adjacentList.get(pair.value).get(i)] = true;
                        queue.add(new Pair(adjacentList.get(pair.value).get(i), pair.nodeVal + 1));
                       store[adjacentList.get(pair.value).get(i)] = pair.nodeVal+1;
                    }
                }
            }
            System.out.println();


            for(int i = 0 ;i<store.length ; i++){
                System.out.print(store[i]+ " ") ;

            }
        }
        public void BFSStandard(int start){
            boolean []visited  = new boolean[n+1] ;
//            Now we need to store the NodeDistance so that we can use iut Directly
            int []nodeDistance = new int[n+1] ;
            int []parent = new int[n+1] ;
            Queue<Pair> queue = new LinkedList<>() ;
            visited[start] = true;
            queue.add(new Pair(start , 0)) ;

            while(!queue.isEmpty()){
                Pair pair = queue.poll();
                int node = pair.value ;
                System.out.println(pair.value+" ") ;

                for(int neighbour : adjacentList.get(node)){
                    if(!visited[neighbour]){
                        visited[neighbour] = true;
                        queue.offer(new Pair(neighbour , pair.nodeVal+1)) ;
                        nodeDistance[neighbour] = pair.nodeVal+1 ;
                        parent[neighbour] = node ;


                    }
                }

               printDistance(nodeDistance) ;
                shortestDistance(start, 4 , parent) ;


            }
        }
        void printDistance(int []nodeDistance){
            for(int value: nodeDistance){
                System.out.print(value + " ");

            }
            System.out.println();

        }
        void shortestDistance(int start , int destination , int []parent){

            List<Integer> path = new ArrayList<>() ;
            int current = destination ;
            while(current!=0){
                path.add(current);
                current = parent[current] ;

            }
            Collections.reverse(path) ;
            System.out.println(path);
        }

    }

    public static void main(String []args){
        Graph gp = new Graph(4) ;
        gp.addEdge(1,2);
        gp.addEdge(1,3);
        gp.addEdge(2,4);
        gp.addEdge(3,4);

//        gp.BFS(1) ;
        gp.BFSStandard(1) ;


    }
}
