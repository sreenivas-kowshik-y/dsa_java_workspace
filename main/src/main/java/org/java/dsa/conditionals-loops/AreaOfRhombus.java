import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diagonal 1 (d1): ");
        double d1 = sc.nextDouble();
        System.out.print("Enter diagonal 2 (d2): ");
        double d2 = sc.nextDouble();
        double area = 0.5 * d1 * d2;
        System.out.printf("Area of Rhombus = %.2f\n", area);
        sc.close();
    }
}
