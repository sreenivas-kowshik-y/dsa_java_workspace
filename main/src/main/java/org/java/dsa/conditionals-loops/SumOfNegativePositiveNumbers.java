import java.util.Scanner;

public class SumOfNegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;

        System.out.println("Enter numbers (enter 0 to terminate):");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;

            if (num < 0) {
                negSum += num;
            } else if (num % 2 == 0) {
                posEvenSum += num;
            } else {
                posOddSum += num;
            }
        }

        System.out.println("Sum of negative numbers: " + negSum);
        System.out.println("Sum of positive even numbers: " + posEvenSum);
        System.out.println("Sum of positive odd numbers: " + posOddSum);
        sc.close();
    }
}
