// LeetCode 1859: Sorting the Sentence
public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];

        for (String word : words) {
            int len = word.length();
            int index = word.charAt(len - 1) - '0' - 1;
            res[index] = word.substring(0, len - 1);
        }

        return String.join(" ", res);
    }
}
