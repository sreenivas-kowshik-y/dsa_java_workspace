import java.util.Scanner;

public class SumOfNaturalNumbersFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers = " + sumOfNaturalNumbers(n));
        sc.close();
    }

    public static int sumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
}
