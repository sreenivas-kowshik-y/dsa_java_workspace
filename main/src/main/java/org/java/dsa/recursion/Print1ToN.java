// Recursion: Print numbers from 1 to N and N to 1
public class Print1ToN {
    public static void printNto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.print("N to 1: ");
        printNto1(5);
        System.out.println();

        System.out.print("1 to N: ");
        print1toN(5);
        System.out.println();
    }
}
