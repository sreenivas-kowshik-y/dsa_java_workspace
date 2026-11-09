import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length (a): ");
        double a = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * a * a;
        System.out.printf("Area of Equilateral Triangle = %.2f\n", area);
        sc.close();
    }
}
