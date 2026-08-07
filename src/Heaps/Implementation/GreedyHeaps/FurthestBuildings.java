package Heaps.Implementation.GreedyHeaps;

import java.util.PriorityQueue;

public class FurthestBuildings {
    public static int findFurthestBuildings(int []heights , int bricks , int ladders){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i<heights.length-1  ; i++){

            int diff = heights[i+1] - heights[i] ;

            if(diff<0) continue ;
            pq.offer(diff) ;

            if(pq.size() > ladders){
                bricks -= pq.poll() ;

                if(bricks < 0){
                    return i ;

                }
            }

        }

        return heights.length -1 ;

    }
    public static void main(String[] args) {
        int []heights = {4,2,7,6,9,14,12} ;
        int bricks = 5 ;
        int ladders = 1 ;

        System.out.println(findFurthestBuildings(heights, bricks , ladders));



    }
}
