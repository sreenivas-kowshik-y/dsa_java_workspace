// LeetCode 1295: Find Numbers with Even Number of Digits
public class FindNumbersWithEvenDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (((int) Math.log10(num) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
