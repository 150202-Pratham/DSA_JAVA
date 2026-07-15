package UCA.Graph;

public class AdjacencyMatrix {
    public static  class Graph{
        int n ;
        int [][]arr ;

        public Graph(int n){
            this.n = n ;
            arr = new int [n+1][n+1] ;
        }
        public void addEdge(int u , int v){
            arr[u][v] = 1 ;
            arr[v][u] = 1 ;

        }
        public void display(){
            for(int i = 0 ; i<arr.length ; i++){
                for(int j = 0 ; j<arr[i].length ; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String []args){
        Graph g = new Graph(4) ;
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,4) ;

        g.display() ;



    }
}
