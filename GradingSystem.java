//A-1 Ques7

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks (out of 100): ");
        double marks = scanner.nextDouble();

        double percentage = (marks / 100) * 100;
        String grade = getGrade(percentage);

        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
    }

    public static String getGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "F";
        }
    }
}
