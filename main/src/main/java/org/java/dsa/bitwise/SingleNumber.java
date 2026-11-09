// LeetCode 136: Single Number (Find unique element in array where every other appears twice)
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int unique = 0;
        for (int n : nums) {
            unique ^= n;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single Number: " + singleNumber(nums));
    }
}
