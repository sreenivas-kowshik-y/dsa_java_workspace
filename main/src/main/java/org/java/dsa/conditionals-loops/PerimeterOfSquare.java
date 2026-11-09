import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length (a): ");
        double a = sc.nextDouble();
        double perimeter = 4 * a;
        System.out.printf("Perimeter of Square = %.2f\n", perimeter);
        sc.close();
    }
}
