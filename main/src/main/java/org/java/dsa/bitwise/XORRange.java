// Find XOR of all numbers from 0 to N and from A to B
public class XORRange {
    // XOR from 0 to n
    public static int xorTill(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }

    // XOR between a and b (inclusive)
    public static int xorRange(int a, int b) {
        return xorTill(b) ^ xorTill(a - 1);
    }

    public static void main(String[] args) {
        int a = 3, b = 9;
        System.out.println("XOR from " + a + " to " + b + " = " + xorRange(a, b));
    }
}
