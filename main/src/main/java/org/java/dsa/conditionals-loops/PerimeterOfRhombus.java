import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length (a): ");
        double a = sc.nextDouble();
        double perimeter = 4 * a;
        System.out.printf("Perimeter of Rhombus = %.2f\n", perimeter);
        sc.close();
    }
}
