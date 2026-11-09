import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total sales amount: ");
        double sales = sc.nextDouble();
        System.out.print("Enter commission percentage (%): ");
        double rate = sc.nextDouble();

        double commission = (sales * rate) / 100.0;
        System.out.printf("Commission Amount = ₹%.2f\n", commission);
        sc.close();
    }
}
