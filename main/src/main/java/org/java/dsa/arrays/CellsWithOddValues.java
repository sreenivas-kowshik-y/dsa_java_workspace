// LeetCode 1252: Cells with Odd Values in a Matrix
public class CellsWithOddValues {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] rowOdd = new boolean[m];
        boolean[] colOdd = new boolean[n];

        for (int[] idx : indices) {
            rowOdd[idx[0]] ^= true;
            colOdd[idx[1]] ^= true;
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowOdd[i] ^ colOdd[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
