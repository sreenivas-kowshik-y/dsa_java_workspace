// Euclidean Algorithm for HCF / GCD and LCM
public class GCDandLCM {
    public static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 4, b = 9;
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
        System.out.println("LCM(" + a + ", " + b + ") = " + lcm(a, b));
    }
}
