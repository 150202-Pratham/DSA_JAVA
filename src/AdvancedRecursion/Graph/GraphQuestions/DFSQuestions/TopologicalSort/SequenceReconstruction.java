package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions.TopologicalSort;

import java.util.*;

public class SequenceReconstruction {
    public  static class Graph{
        int n ;
        List<List<Integer>> adjacencyList ;

        public Graph(int n){
            this.n = n ;
            adjacencyList = new ArrayList<>() ;

            for(int i = 0 ; i<=n ; i++){
                adjacencyList.add(new  ArrayList<>()) ;
            }
        }
        public void addEdge(int u , int v){
            adjacencyList.get(u).add(v) ;

        }
        public boolean topologicalOrder(){
            int []inDegree= new int[n+1] ;
            for(int i = 1 ; i<=n ; i++){
                for(int j : adjacencyList.get(i)){
                    inDegree[j]++;
                }
            }

            Queue<Integer> q= new LinkedList<>() ;
            for(int i = 1 ; i<=n ; i++){
                if(inDegree[i]==0){
                    q.offer(i) ;
                }
            }

            List<Integer> list = new ArrayList<>() ;
            int count = 0 ;

            while(!q.isEmpty()){
                if(q.size()>1) return false ;

                int node = q.poll() ;

                list.add(node) ;
                count++;

                for(int elem : adjacencyList.get(node)){
                    inDegree[elem]-- ;

                    if(inDegree[elem]==0){
                        q.offer(elem) ;

                    }
                }
            }

            return count==n;



        }
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt() ;

        int [][] pre = {{1,2},{1,3}} ;

        Graph gp = new Graph(n) ;
        for(int []elem : pre){
            gp.addEdge(elem[0] , elem[1]) ;
        }

        System.out.println( gp.topologicalOrder());




    }

}
