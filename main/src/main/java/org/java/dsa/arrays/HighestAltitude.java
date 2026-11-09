// LeetCode 1732: Find the Highest Altitude
public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int currentAlt = 0;
        for (int g : gain) {
            currentAlt += g;
            maxAlt = Math.max(maxAlt, currentAlt);
        }
        return maxAlt;
    }
}
