package AdvancedRecursion.BackTracking;

public class UniquePath3 {

    public static int toVisit = 0;

    public static int findPath(int row, int col, int[][] grid, int visit) {


        if (grid[row][col] == 2) {
            return (visit == toVisit) ? 1 : 0;
        }


        if (grid[row][col] == -1) {
            return 0;
        }

        int temp = grid[row][col];
        grid[row][col] = -1; // mark visited

        visit++;

        int count = 0;


        if (row < grid.length - 1)
            count += findPath(row + 1, col, grid, visit);



        if (row > 0)
            count += findPath(row - 1, col, grid, visit);


        if (col < grid[0].length - 1)
            count += findPath(row, col + 1, grid, visit);


        if (col > 0)
            count += findPath(row, col - 1, grid, visit);

        grid[row][col] = temp;

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}
        };

        int row = 0, col = 0;

        // FIX 1: count all visitable cells (0 + 1 + 2)
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] != -1)
                    toVisit++;   // count 0, 1, and 2

                if (grid[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(findPath(row, col, grid, 1));
    }
}
