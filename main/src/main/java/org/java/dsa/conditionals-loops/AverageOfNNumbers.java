import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements (N): ");
        int n = sc.nextInt();

        double sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }

        double avg = n > 0 ? sum / n : 0;
        System.out.printf("Average = %.2f\n", avg);
        sc.close();
    }
}
