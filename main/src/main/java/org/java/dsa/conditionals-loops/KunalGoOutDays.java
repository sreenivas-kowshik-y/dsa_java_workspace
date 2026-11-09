public class KunalGoOutDays {
    public static void main(String[] args) {
        int augustDays = 31;
        int count = 0;

        for (int day = 1; day <= augustDays; day++) {
            if (day % 2 == 0) {
                count++;
            }
        }

        System.out.println("Kunal can go out on " + count + " days in August (even days).");
    }
}
