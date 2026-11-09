// LeetCode 74: Search a 2D Matrix
public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0, end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int element = matrix[mid / cols][mid % cols];
            if (element == target) return true;
            else if (element < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
