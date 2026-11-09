// LeetCode 1662: Check If Two String Arrays are Equivalent
public class CheckEquivalentStrings {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
