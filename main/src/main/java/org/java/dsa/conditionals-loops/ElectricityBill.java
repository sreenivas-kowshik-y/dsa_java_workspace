import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        double bill = 0;

        if (units <= 100) {
            bill = units * 4.0;
        } else if (units <= 300) {
            bill = (100 * 4.0) + ((units - 100) * 6.0);
        } else {
            bill = (100 * 4.0) + (200 * 6.0) + ((units - 300) * 8.5);
        }

        System.out.printf("Total Electricity Bill = ₹%.2f\n", bill);
        sc.close();
    }
}
