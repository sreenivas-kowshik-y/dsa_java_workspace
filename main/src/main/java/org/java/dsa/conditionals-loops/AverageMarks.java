import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += sc.nextDouble();
        }

        double avg = n > 0 ? total / n : 0;
        System.out.printf("Average Marks = %.2f\n", avg);
        sc.close();
    }
}
