package AdvancedRecursion.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//This is the Method One For Graph Traversal and it is mainly used when there is Dense Graphs Available and also there ia
//complex graphs that cannot be easily understandable


public class AdjacencyMatrix {
    public static class Matrix{
        int row ;
        int col ;
        int [][]matrix ;

         Matrix(int row , int col){
            this.row= row ;
            this.col = col ;
            matrix = new int[row+1][col+1] ;

        }

        public  void addEdge(int u ,  int v){
            matrix[u][v] = 1 ;
            matrix[v][u] = 1 ;
        }
        void display(){
            for(int i = 1 ; i<matrix.length ; i++){
                for(int j = 1 ; j<matrix[i].length ; j++){
                    System.out.print(matrix[i][j]+" ");

                }
                System.out.println();
            }
        }

    }


    public static void main (String []args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(isr) ;
        int n = Integer.parseInt(br.readLine());


        Matrix mat = new Matrix(n,n) ;
        mat.addEdge(1,2) ;
        mat.addEdge(1,3) ;
        mat.addEdge(2,4) ;
        mat.addEdge(3,4);

        mat.display() ;



    }
}
