// Check if a number is Odd or Even using Bitwise AND
public class OddEven {
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        int n = 67;
        System.out.println(n + " is odd? " + isOdd(n));
    }
}
