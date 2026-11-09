// Recursion: Check if array is sorted
public class CheckSortedArray {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] <= arr[index + 1] && isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9, 12};
        System.out.println("Is array sorted? " + isSorted(arr, 0));
    }
}
