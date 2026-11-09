import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers (enter 0 to stop and get sum):");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            sum += num;
        }
        System.out.println("Total Sum = " + sum);
        sc.close();
    }
}
