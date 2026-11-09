import java.util.Scanner;

class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = Math.abs(a);
        int y = Math.abs(b);

        int num1 = x;
        int num2 = y;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int hcf = num1;

        int lcm = (x == 0 || y == 0) ? 0 : (x / hcf) * y;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}