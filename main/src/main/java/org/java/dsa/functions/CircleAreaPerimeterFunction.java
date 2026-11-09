import java.util.Scanner;

public class CircleAreaPerimeterFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.printf("Area of Circle = %.2f\n", getArea(r));
        System.out.printf("Circumference of Circle = %.2f\n", getCircumference(r));
        sc.close();
    }

    public static double getArea(double r) {
        return Math.PI * r * r;
    }

    public static double getCircumference(double r) {
        return 2 * Math.PI * r;
    }
}
