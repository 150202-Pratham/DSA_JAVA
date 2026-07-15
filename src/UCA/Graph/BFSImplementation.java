package UCA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSImplementation {
    public static class Graph{
        int n;
        List<List<Integer>> list ;

        public Graph(int n){
            this.n = n ;
            list = new ArrayList<>() ;
            for(int i=0 ; i<n+1 ; i++) {
                list.add(new ArrayList<>());
            }
        }
        public void addEdge(int u , int v){
            list.get(u).add(v) ;
            list.get(v).add(u) ;

        }
        public void BFS(int node){
            boolean []confirmArr = new boolean [n+1] ;
            Queue<Integer> q = new LinkedList<>() ;
            confirmArr[node] = true ;
            q.add(node) ;

            while(!q.isEmpty()){

                int elem = q.poll() ;
                System.out.println(elem);
                for(int neighbour : list.get(elem)){
                    if(!confirmArr[neighbour]){
                        confirmArr[neighbour] = true;
                        q.add(neighbour) ;

                    }
                }
            }

        }


    }

    public static void main(String[] args) {
        Graph g = new Graph(4) ;
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.BFS(1) ;


    }
}
