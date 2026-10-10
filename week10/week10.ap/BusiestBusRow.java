public class BusiestBusRow {

    // Returns {zero-based row index, total students in that row}.
    // If rows tie, the first (smallest-index) row is returned.
    public static int[] busiestRow(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return new int[] {-1, 0};
        }

        int bestRow = 0;
        int bestTotal = -1;

        for (int row = 0; row < grid.length; row++) {
            int total = 0;

            if (grid[row] != null) {
                for (int seats : grid[row]) {
                    total += seats;
                }
            }

            // Strictly greater keeps the earlier row when totals tie.
            if (total > bestTotal) {
                bestTotal = total;
                bestRow = row;
            }
        }

        return new int[] {bestRow, bestTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };

        int[] result = busiestRow(grid);
        // Display row number as 1-based, as in the assignment example.
        System.out.println("Row " + (result[0] + 1)
                + ", Total " + result[1]);
    }
}
