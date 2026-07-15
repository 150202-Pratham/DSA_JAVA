package AdvancedRecursion.Graph.GraphQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    public static boolean checkKeysAndRooms(List<List<Integer>> rooms){
        Queue<Integer> queue = new LinkedList<>() ;
        boolean[]visited = new boolean[rooms.size()] ;

        visited[0] = true ;
        queue.offer(0) ;
        while(!queue.isEmpty()){
            int room = queue.poll() ;

            for(int key : rooms.get(room)){
                if(!visited[key]){
                    visited[key] = true;
                    queue.offer(key) ;
                }
            }
        }

        for(boolean i: visited){
            if(!i) return false ;

        }
        return true ;


    }
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>() ;

        rooms.add(new ArrayList<>(List.of(1)));
        rooms.add(new ArrayList<>(List.of(2)));
        rooms.add(new ArrayList<>(List.of(3)));
        rooms.add(new ArrayList<>());

        System.out.print(checkKeysAndRooms(rooms)) ;

    }
}
