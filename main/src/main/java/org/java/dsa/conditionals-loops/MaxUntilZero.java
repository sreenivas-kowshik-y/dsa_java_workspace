import java.util.Scanner;

public class MaxUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        boolean entered = false;
        System.out.println("Enter numbers (enter 0 to stop and get max):");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            if (num > max) {
                max = num;
            }
            entered = true;
        }
        if (entered) {
            System.out.println("Maximum Number = " + max);
        } else {
            System.out.println("No numbers entered.");
        }
        sc.close();
    }
}
