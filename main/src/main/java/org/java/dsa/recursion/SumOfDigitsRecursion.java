// Recursion: Sum of digits of a number
public class SumOfDigitsRecursion {
    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits of 1342 = " + sumOfDigits(1342));
    }
}
