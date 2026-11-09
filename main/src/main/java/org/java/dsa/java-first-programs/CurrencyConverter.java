import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in Indian Rupees (INR): ");
        double inr = input.nextDouble();

        // Approximate conversion rate: 1 USD = 83 INR
        double usdRate = 83.0;
        double usd = inr / usdRate;

        System.out.printf("%.2f INR = %.2f USD
", inr, usd);
        input.close();
    }
}
