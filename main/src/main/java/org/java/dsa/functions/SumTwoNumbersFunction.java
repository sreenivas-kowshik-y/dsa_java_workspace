import java.util.Scanner;

public class SumTwoNumbersFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + sum(a, b));
        sc.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
