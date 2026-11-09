import java.util.Scanner;

// LeetCode 1281: Subtract the Product and Sum of Digits of an Integer
public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        int temp = n;
        int product = 1;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            sum += digit;
            temp /= 10;
        }

        int result = product - sum;
        System.out.println("Result (Product - Sum) = " + result);
        sc.close();
    }
}
