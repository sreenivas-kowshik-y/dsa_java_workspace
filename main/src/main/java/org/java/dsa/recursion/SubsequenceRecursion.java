import java.util.ArrayList;
import java.util.List;

// Recursion: Print and return all Subsequences of a String
public class SubsequenceRecursion {
    public static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    public static void main(String[] args) {
        System.out.println("Subsequences of 'abc':");
        subseq("", "abc");
    }
}
