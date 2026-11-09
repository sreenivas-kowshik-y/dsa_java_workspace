// Find the i-th bit of a number
public class FindIthBit {
    public static int getIthBit(int n, int i) {
        return (n & (1 << (i - 1))) != 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int n = 182; // Binary: 10110110
        int i = 5;
        System.out.println("The " + i + "-th bit of " + n + " is: " + getIthBit(n, i));
    }
}
