import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("How many subjects? ");
        int subjects = sc.nextInt();

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / (double)subjects;
        String grade = "";

        if (average >= 90) grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else grade = "F";

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);
    }
}

