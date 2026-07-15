package AdvancedRecursion.Graph.Traversals.DFS.noShortestPath;

public class Main {

    public static void main(String[] args) {
        int n = 4 ;

        ShortestDistance.Graph gp = new ShortestDistance.Graph(n);
        gp.addEdge(1,2);
        gp.addEdge(1,3);
        gp.addEdge(2,4);
        gp.addEdge(3,4) ;

        int []nodeDistance = new int[n+1];
        nodeDistance[1] = 0 ;
        boolean []visited = new boolean[n+1] ;

        gp.DFS(1,visited , nodeDistance ) ;
        gp.printNodeDistance(nodeDistance , 1) ;

    }
}
