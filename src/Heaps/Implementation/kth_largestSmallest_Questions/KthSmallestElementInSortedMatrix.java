package Heaps.Implementation.kth_largestSmallest_Questions;

import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {

    public static  class Pair implements Comparable<Pair>{
         int value ;
        int row ;
        int col ;

        public Pair( int value , int r , int c){
            this.value = value;
            this.row = r ;
            this.col = c ;
        }

        public int compareTo(Pair p){
            return Integer.compare(this.value,p.value);
        }
    }

    public static int KthSmallest( int [][]matrix , int k){
        PriorityQueue<Pair> pq = new PriorityQueue<>() ;
        for(int  i = 0 ; i<matrix.length ; i++){
            pq.offer(new Pair(matrix[i][0] , i , 0)) ;
        }

        while(k>1){

            Pair p = pq.poll() ;

            if(p.col+1< matrix[0].length){
                pq.offer(new Pair(matrix[p.row][p.col+1] , p.row , p.col+1)) ;

            }
            k-- ;
        }

        return pq.peek().value;

    }

    public static void main(String[] args) {
        KthSmallestElementInSortedMatrix obj = new KthSmallestElementInSortedMatrix() ;
        int [][]matrix = {{1,5,9},{10,11,13},{12,13,15}} ;
        int k = 8 ;
        System.out.println(obj.KthSmallest(matrix , k)) ;

    }

}
