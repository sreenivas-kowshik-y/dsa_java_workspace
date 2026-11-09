import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount (P): ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest (R %): ");
        double r = sc.nextDouble();
        System.out.print("Enter time in years (T): ");
        double t = sc.nextDouble();

        double amount = p * Math.pow((1 + r / 100.0), t);
        double ci = amount - p;

        System.out.printf("Compound Interest = ₹%.2f\n", ci);
        System.out.printf("Total Amount = ₹%.2f\n", amount);
        sc.close();
    }
}
