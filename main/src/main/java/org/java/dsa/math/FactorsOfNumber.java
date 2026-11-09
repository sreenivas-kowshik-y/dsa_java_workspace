import java.util.ArrayList;
import java.util.List;

// Find all factors of a number in O(sqrt(N)) time
public class FactorsOfNumber {
    public static void printFactors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Factors of 20: ");
        printFactors(20);
    }
}
