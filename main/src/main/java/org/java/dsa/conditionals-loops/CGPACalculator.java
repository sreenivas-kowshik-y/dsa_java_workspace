import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        double totalGradePoints = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter grade point (out of 10) for subject " + i + ": ");
            totalGradePoints += sc.nextDouble();
        }

        double cgpa = subjects > 0 ? totalGradePoints / subjects : 0;
        System.out.printf("CGPA = %.2f\n", cgpa);
        System.out.printf("Percentage Equivalent = %.2f%%\n", cgpa * 9.5);
        sc.close();
    }
}
