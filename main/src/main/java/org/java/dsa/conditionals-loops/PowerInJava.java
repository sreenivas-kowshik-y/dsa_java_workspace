import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        double result = 1;
        for (int i = 0; i < Math.abs(exp); i++) {
            result *= base;
        }

        if (exp < 0) result = 1.0 / result;

        System.out.println("Result: " + result);
        sc.close();
    }
}
