// LeetCode 191: Number of 1 Bits (Hamming Weight)
public class CountSetBits {
    public static int setBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n -= (n & -n);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println("Set bits in " + n + ": " + setBits(n));
    }
}
