// Demonstrating Recurrence Relations for Recursion & Divide & Conquer
public class RecurrenceRelations {

    // T(N) = T(N-1) + O(1) => Overall Time Complexity: O(N)
    public static int linearRecursiveSum(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + linearRecursiveSum(arr, n - 1);
    }

    // T(N) = 2 T(N/2) + O(N) => Master Theorem Case 2 => Overall: O(N log N)
    public static int divideAndConquerSum(int[] arr, int l, int r) {
        if (l == r) return arr[l];
        int m = l + (r - l) / 2;
        return divideAndConquerSum(arr, l, m) + divideAndConquerSum(arr, m + 1, r);
    }

    // T(N) = T(N/2) + O(1) => Master Theorem Case 2 => Overall: O(log N)
    public static int binarySearchRecursive(int[] arr, int l, int r, int target) {
        if (l > r) return -1;
        int m = l + (r - l) / 2;
        if (arr[m] == target) return m;
        if (arr[m] > target) return binarySearchRecursive(arr, l, m - 1, target);
        return binarySearchRecursive(arr, m + 1, r, target);
    }

    // T(N) = 2 T(N-1) + O(1) => Overall Time Complexity: O(2^N)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("Linear sum: " + linearRecursiveSum(arr, arr.length));
        System.out.println("Divide & Conquer sum: " + divideAndConquerSum(arr, 0, arr.length - 1));
        System.out.println("Recursive Binary Search for 7: " + binarySearchRecursive(arr, 0, arr.length - 1, 7));
    }
}
