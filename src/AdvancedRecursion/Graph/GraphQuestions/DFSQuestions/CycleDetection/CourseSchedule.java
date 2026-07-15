package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions.CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public static class Graph{
        int n ;
        List<List<Integer>> adjacencyList ;
        public Graph(int n){
            this.n = n ;
            adjacencyList = new ArrayList<>() ;
            for(int i = 0 ; i<n ; i++){
                adjacencyList.add(new ArrayList<>()) ;
            }
        }
        public void addEdge(int u , int v){
            adjacencyList.get(u).add(v) ;

        }
         boolean hasCycle(){
            int []state = new int[n+1] ;
            for(int i = 0 ; i<n ; i++){
                if(state[i]==0){
                    if(hasCycleDFS(i , state)){
                        return true ;
                    }
                }
            }

            return false ;
        }

        public  boolean hasCycleDFS(int node , int []state){



            state[node] = 1 ;

            for(int neighbour: adjacencyList.get(node)){
                if(state[neighbour]==1){
                    return true ;
                }
                if(state[neighbour]==0){
                    if(hasCycleDFS(neighbour, state))
                        return true ;
                }
            }
            state[node] = 2 ;
            return false ;

        }


    }
    public static void main(String[] args) {

        int numCourses = 2 ;
        int [][] prerequisites= {{1,0},{0,1}} ;

        Graph graph  = new Graph(numCourses) ;
        for(int []elem : prerequisites){
            graph.addEdge(elem[1], elem[0]) ;

        }
        System.out.println(!graph.hasCycle()) ;




    }
}
