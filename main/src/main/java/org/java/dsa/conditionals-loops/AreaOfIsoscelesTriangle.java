import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter equal side (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter base (b): ");
        double b = sc.nextDouble();
        double area = (b / 4.0) * Math.sqrt((4 * a * a) - (b * b));
        System.out.printf("Area of Isosceles Triangle = %.2f\n", area);
        sc.close();
    }
}
