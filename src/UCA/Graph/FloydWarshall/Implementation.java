package UCA.Graph.FloydWarshall;

import java.util.Arrays;

public class Implementation {
    public static final int INF = Integer.MAX_VALUE ;

    public static void floydWarshall(int [][]distance){

        for(int k = 0 ; k<distance.length ; k++){

            for(int i = 0 ; i<distance.length ; i++){

                for(int j = 0 ; j<distance.length ; j++){

                    if(distance[i][k]!=INF && distance[k][j]!=INF){
                        distance[i][j] = Math.min(distance[i][j],
                                distance[i][k]+distance[k][j]
                                );

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int n =4 ;
        int[][] edges = { {0,1,3}, {0,2,10}, {1,2,5}, {1,3,4}, {3,2,2} };
        int [][]distance = new int [n][n] ;

        for(int i = 0 ; i<n ; i++){
            Arrays.fill(distance[i],INF);

            distance[i][i] = 0;

        }
        for(int []edge : edges){

            int u = edge[0] ;
            int v = edge[1] ;
            int wt = edge[2] ;

            distance[u][v] = wt ;
        }

        floydWarshall(distance);

        for(int[] row : distance){

            for(int value : row){

                if(value == INF){

                    System.out.print("INF ");

                }else{

                    System.out.print(value + " ");

                }

            }

            System.out.println();
        }
    }
}
