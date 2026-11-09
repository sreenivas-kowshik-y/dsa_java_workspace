import java.util.Scanner;

public class PythagoreanTripletFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("It is a Pythagorean Triplet.");
        } else {
            System.out.println("It is NOT a Pythagorean Triplet.");
        }
        sc.close();
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        int maxVal = Math.max(a, Math.max(b, c));
        if (maxVal == a) return a * a == b * b + c * c;
        else if (maxVal == b) return b * b == a * a + c * c;
        else return c * c == a * a + b * b;
    }
}
