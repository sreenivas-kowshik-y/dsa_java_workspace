import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        int runs = sc.nextInt();
        System.out.print("Enter total times dismissed: ");
        int dismissals = sc.nextInt();

        if (dismissals == 0) {
            System.out.println("Batting Average is undefined (0 dismissals).");
        } else {
            double avg = (double) runs / dismissals;
            System.out.printf("Batting Average = %.2f\n", avg);
        }
        sc.close();
    }
}
