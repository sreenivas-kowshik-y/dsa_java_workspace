import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius (r): ");
        double r = sc.nextDouble();
        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();
        double volume = (1.0 / 3.0) * Math.PI * r * r * h;
        System.out.printf("Volume of Cone = %.2f\n", volume);
        sc.close();
    }
}
