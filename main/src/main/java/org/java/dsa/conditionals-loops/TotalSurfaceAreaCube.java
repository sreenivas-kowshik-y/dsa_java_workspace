import java.util.Scanner;

public class TotalSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length (a): ");
        double a = sc.nextDouble();
        double tsa = 6 * a * a;
        System.out.printf("Total Surface Area of Cube = %.2f\n", tsa);
        sc.close();
    }
}
