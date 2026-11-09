// Overview of Space Complexity Concepts (Auxiliary vs Total Space)
public class SpaceComplexityOverview {

    // O(1) Auxiliary Space - In-place array modification
    public static void reverseArrayInPlace(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // O(N) Auxiliary Space - Creating extra array/list copy
    public static int[] getReversedCopy(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[arr.length - 1 - i];
        }
        return copy;
    }

    // O(N) Call Stack Space - Recursive function call depth
    public static int recursiveFactorial(int n) {
        if (n <= 1) return 1;
        return n * recursiveFactorial(n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArrayInPlace(arr);
        System.out.println("Reversed in-place (O(1) auxiliary space)");
        System.out.println("Factorial of 5 (O(N) stack space): " + recursiveFactorial(5));
    }
}
