package AdvancedRecursion.Graph.Traversals.DFS;

public class DFSAdjacentMatrix {

    public static class Graph{
        int n ;
        int [][]arr ;

        public Graph(int n){
            this.n = n ;
            arr = new int[n+1][n+1] ;
        }
        public void addEdges(int i,int j){
            arr[i][j] = 1 ;
            arr[j][i] = 1 ;

        }
        public void DFSMatrix(int node, boolean isVisited[]){
            if(isVisited[node]){
                return ;
            }
            System.out.print(node+ " ") ;
            isVisited[node]  = true ;

            for(int neighbour = 1 ; neighbour<arr[node].length ; neighbour++){
                if(!isVisited[neighbour]){
                    DFSMatrix(neighbour , isVisited) ;
                }
            }
        }


    }

    public static void main (String []args){
        Graph g = new Graph(4) ;
        g.addEdges(1,2) ;
        g.addEdges(3,2) ;
        g.addEdges(3,4) ;
        g.addEdges(2,4) ;

        boolean []isVisited = new boolean[5] ;
        g.DFSMatrix(1,isVisited) ;

    }
}
