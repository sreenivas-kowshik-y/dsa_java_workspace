import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        double v1 = sc.nextDouble();
        System.out.print("Enter rate of depreciation (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter time in years (t): ");
        double t = sc.nextDouble();

        double v2 = v1 * Math.pow((1 - r / 100.0), t);
        System.out.printf("Value after depreciation = %.2f\n", v2);
        sc.close();
    }
}
