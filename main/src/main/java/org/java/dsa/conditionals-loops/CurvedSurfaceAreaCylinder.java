import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius (r): ");
        double r = sc.nextDouble();
        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();
        double csa = 2 * Math.PI * r * h;
        System.out.printf("Curved Surface Area of Cylinder = %.2f\n", csa);
        sc.close();
    }
}
