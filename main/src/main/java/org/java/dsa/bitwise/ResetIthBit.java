// Reset (clear) the i-th bit of a number to 0
public class ResetIthBit {
    public static int resetBit(int n, int i) {
        return n & ~(1 << (i - 1));
    }

    public static void main(String[] args) {
        int n = 86;
        int i = 5;
        System.out.println("After resetting " + i + "-th bit: " + resetBit(n, i));
    }
}
