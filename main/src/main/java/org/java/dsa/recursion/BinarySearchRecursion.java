// Binary Search using Recursion
public class BinarySearchRecursion {
    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 12, 18};
        System.out.println("Index of 8: " + search(arr, 8, 0, arr.length - 1));
    }
}
