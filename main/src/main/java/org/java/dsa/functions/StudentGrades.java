import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (out of 100): ");
        int marks = sc.nextInt();

        System.out.println("Grade: " + getGrade(marks));
        sc.close();
    }

    public static String getGrade(int marks) {
        if (marks >= 91 && marks <= 100) return "AA";
        else if (marks >= 81) return "AB";
        else if (marks >= 71) return "BB";
        else if (marks >= 61) return "BC";
        else if (marks >= 51) return "CD";
        else if (marks >= 41) return "DD";
        else return "Fail";
    }
}
