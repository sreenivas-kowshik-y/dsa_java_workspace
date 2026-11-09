// Recursion: Reverse a number
public class ReverseNumberRecursion {
    public static int reverse(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + reverse(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        int n = 1824;
        int digits = (int) (Math.log10(n)) + 1;
        System.out.println("Reversed 1824 = " + reverse(n, digits));
    }
}
