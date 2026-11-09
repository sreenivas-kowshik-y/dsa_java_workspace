import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base area (B): ");
        double b = sc.nextDouble();
        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();
        double volume = b * h;
        System.out.printf("Volume of Prism = %.2f\n", volume);
        sc.close();
    }
}
