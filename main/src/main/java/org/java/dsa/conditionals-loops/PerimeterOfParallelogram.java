import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        double perimeter = 2 * (a + b);
        System.out.printf("Perimeter of Parallelogram = %.2f\n", perimeter);
        sc.close();
    }
}
