// LeetCode 1309: Decrypt String from Alphabet to Integer Mapping
public class DecryptString {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            int num;
            if (s.charAt(i) == '#') {
                num = Integer.parseInt(s.substring(i - 2, i));
                i -= 3;
            } else {
                num = s.charAt(i) - '0';
                i--;
            }
            sb.append((char) ('a' + num - 1));
        }

        return sb.reverse().toString();
    }
}
