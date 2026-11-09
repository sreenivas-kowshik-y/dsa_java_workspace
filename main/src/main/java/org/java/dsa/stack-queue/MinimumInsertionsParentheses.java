// LeetCode 1541: Minimum Insertions to Balance a Parentheses String
public class MinimumInsertionsParentheses {

    public int minInsertions(String s) {
        int insertions = 0;
        int openCount = 0;
        int i = 0;
        int n = s.length();

        while (i < n) {
            if (s.charAt(i) == '(') {
                openCount++;
                i++;
            } else {
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    insertions++; // Needs one more ')'
                    i++;
                }

                if (openCount > 0) {
                    openCount--;
                } else {
                    insertions++; // Needs one '('
                }
            }
        }

        return insertions + (openCount * 2);
    }
}
