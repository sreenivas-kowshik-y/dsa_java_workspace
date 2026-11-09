import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount percentage (%): ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (price * discountPercent) / 100.0;
        double finalPrice = price - discountAmount;

        System.out.printf("Discount Amount = ₹%.2f\n", discountAmount);
        System.out.printf("Final Price = ₹%.2f\n", finalPrice);
        sc.close();
    }
}
