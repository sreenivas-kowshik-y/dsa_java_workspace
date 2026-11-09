// LeetCode 405: Convert a Number to Hexadecimal
public class NumberToHexadecimal {
    public static String toHex(int num) {
        if (num == 0) return "0";
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        while (num != 0 && sb.length() < 8) {
            sb.append(hexChars[num & 15]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Hex of 26: " + toHex(26));
        System.out.println("Hex of -1: " + toHex(-1));
    }
}
