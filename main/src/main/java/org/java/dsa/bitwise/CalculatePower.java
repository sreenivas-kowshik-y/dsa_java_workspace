// Calculate a ^ b using Bitwise Magic (Binary Exponentiation)
public class CalculatePower {
    public static long power(int base, int power) {
        long ans = 1;
        long b = base;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= b;
            }
            b *= b;
            power >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int base = 3;
        int pow = 6;
        System.out.println(base + "^" + pow + " = " + power(base, pow));
    }
}
