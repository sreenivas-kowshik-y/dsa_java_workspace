import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius (r): ");
        double r = sc.nextDouble();
        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.printf("Volume of Cylinder = %.2f\n", volume);
        sc.close();
    }
}
