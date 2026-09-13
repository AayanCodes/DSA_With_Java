// 1351. Count Negative Numbers in a Sorted Matrix

public class CountNegativeNumbers {
    public static void main(String[] args) {
        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for( int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Count of negative numbers in the grid: " + count);
    }
}

// OUTPUT :
// Count of the Negative Number in the grid: 8 
