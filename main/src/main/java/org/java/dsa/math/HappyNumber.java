// LeetCode 202: Happy Number
public class HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int findSquareSum(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Is 19 a Happy Number? " + isHappy(19));
    }
}
