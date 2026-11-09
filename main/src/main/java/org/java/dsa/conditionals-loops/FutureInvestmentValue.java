import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value (PV): ");
        double pv = sc.nextDouble();
        System.out.print("Enter annual interest rate (r %): ");
        double r = sc.nextDouble() / 100.0;
        System.out.print("Enter time in years (t): ");
        double t = sc.nextDouble();

        double fv = pv * Math.pow((1 + r), t);
        System.out.printf("Future Investment Value = ₹%.2f\n", fv);
        sc.close();
    }
}
