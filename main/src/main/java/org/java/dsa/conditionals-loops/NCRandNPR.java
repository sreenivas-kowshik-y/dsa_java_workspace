import java.util.Scanner;

public class NCRandNPR {
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid values of n and r.");
        } else {
            long npr = factorial(n) / factorial(n - r);
            long ncr = npr / factorial(r);

            System.out.println("nPr (Permutation) = " + npr);
            System.out.println("nCr (Combination) = " + ncr);
        }
        sc.close();
    }
}
