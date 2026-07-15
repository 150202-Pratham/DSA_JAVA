package AdvancedRecursion.Graph.GraphQuestions.DFSQuestions.TopologicalSort;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {

    public static class Graph {
        int n;
        List<List<Integer>> adjacencyList;

        public Graph(int n) {
            this.n = n;
            adjacencyList = new ArrayList<>();


            for (int i = 0; i < n; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }


        public void addEdge(int u, int v) {
            adjacencyList.get(u).add(v);
        }


        public List<List<Integer>> allPaths() {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> path = new ArrayList<>();


            path.add(0);
            dfs(0, path, result);

            return result;
        }


        private void dfs(int node, List<Integer> path, List<List<Integer>> result) {


            if (node == n - 1) {
                // IMPORTANT → store COPY of path
                result.add(new ArrayList<>(path));
                return;
            }


            for (int neighbour : adjacencyList.get(node)) {

                path.add(neighbour);          // choose
                dfs(neighbour, path, result); // explore
                path.remove(path.size() - 1); // backtrack
            }
        }
    }

    public static void main(String[] args) {

        int[][] graphInput = {{1, 2}, {3}, {3}, {}};

        Graph gp = new Graph(graphInput.length);


        for (int i = 0; i < graphInput.length; i++) {
            for (int v : graphInput[i]) {
                gp.addEdge(i, v);
            }
        }
        
        List<List<Integer>> ans = gp.allPaths();
        System.out.println(ans);
    }
}
