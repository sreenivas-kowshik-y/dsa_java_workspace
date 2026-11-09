import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base length (l): ");
        double l = sc.nextDouble();
        System.out.print("Enter base width (w): ");
        double w = sc.nextDouble();
        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();
        double volume = (l * w * h) / 3.0;
        System.out.printf("Volume of Pyramid = %.2f\n", volume);
        sc.close();
    }
}
