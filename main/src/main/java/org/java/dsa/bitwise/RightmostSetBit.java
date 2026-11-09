// Find the position of the rightmost set bit
public class RightmostSetBit {
    public static int getRightmostSetBitPosition(int n) {
        if (n == 0) return 0;
        int isolated = n & (-n);
        return (int) (Math.log(isolated) / Math.log(2)) + 1;
    }

    public static void main(String[] args) {
        int n = 182;
        System.out.println("Rightmost set bit position: " + getRightmostSetBitPosition(n));
    }
}
