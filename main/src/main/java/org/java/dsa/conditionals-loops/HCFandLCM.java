import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int n1 = a, n2 = b;
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        int hcf = n1;
        int lcm = (a * b) / hcf;

        System.out.println("HCF (GCD) = " + hcf);
        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
