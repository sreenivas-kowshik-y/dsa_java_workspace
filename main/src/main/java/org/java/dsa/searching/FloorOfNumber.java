public class FloorOfNumber {
    // Find greatest element in array <= target
    public static int floor(int[] arr, int target) {
        if (target < arr[0]) return -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return end;
    }
}
