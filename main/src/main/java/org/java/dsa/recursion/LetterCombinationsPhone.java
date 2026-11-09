import java.util.ArrayList;
import java.util.List;

// LeetCode 17: Letter Combinations of a Phone Number
public class LetterCombinationsPhone {
    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        return pad("", digits);
    }

    private static List<String> pad(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        String letters = KEYPAD[digit];
        List<String> ans = new ArrayList<>();
        for (char ch : letters.toCharArray()) {
            ans.addAll(pad(p + ch, up.substring(1)));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Combinations for '23': " + letterCombinations("23"));
    }
}
