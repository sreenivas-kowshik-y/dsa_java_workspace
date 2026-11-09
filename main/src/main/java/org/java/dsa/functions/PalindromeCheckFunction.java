import java.util.Scanner;

public class PalindromeCheckFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is NOT a Palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number > 0) {
            int rem = number % 10;
            reversed = reversed * 10 + rem;
            number /= 10;
        }
        return original == reversed;
    }
}
