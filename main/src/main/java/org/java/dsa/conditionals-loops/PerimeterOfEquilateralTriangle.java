import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length (a): ");
        double a = sc.nextDouble();
        double perimeter = 3 * a;
        System.out.printf("Perimeter of Equilateral Triangle = %.2f\n", perimeter);
        sc.close();
    }
}
