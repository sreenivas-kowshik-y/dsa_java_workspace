import java.util.Scanner;

class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter numbers (enter x to stop):");

        while (true) {
            String input = sc.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            sum = sum + Integer.parseInt(input);
        }

        System.out.println("Sum = " + sum);
    }
}