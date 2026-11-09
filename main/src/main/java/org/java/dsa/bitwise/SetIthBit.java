// Set the i-th bit of a number to 1
public class SetIthBit {
    public static int setBit(int n, int i) {
        return n | (1 << (i - 1));
    }

    public static void main(String[] args) {
        int n = 86;
        int i = 4;
        System.out.println("After setting " + i + "-th bit: " + setBit(n, i));
    }
}
