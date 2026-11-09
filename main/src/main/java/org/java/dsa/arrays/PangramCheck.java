// LeetCode 1832: Check if the Sentence Is Pangram
public class PangramCheck {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }
        for (boolean present : seen) {
            if (!present) return false;
        }
        return true;
    }
}
