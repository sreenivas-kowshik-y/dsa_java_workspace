import java.util.ArrayList;
import java.util.List;

// Recursion: Linear Search & Find All Index Positions
public class LinearSearchRecursion {
    public static List<Integer> findAllIndex(int[] arr, int target, int index, List<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println("Target 4 found at indices: " + findAllIndex(arr, 4, 0, new ArrayList<>()));
    }
}
