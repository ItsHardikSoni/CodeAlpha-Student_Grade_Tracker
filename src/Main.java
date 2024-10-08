import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create a ArrayList to store student grade
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numOfStudent = sc.nextInt();

        // Get the grades for each student
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println("Enter the grade for Student" + (i+1) + ": ");
            int grade = sc.nextInt();
            grades.add(grade);
        }

        // Calculate average, highest, and lowest scores
        int total = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int grade : grades) {
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) total / numOfStudent;

        // Output the results
        System.out.println("\nGrade Summary:");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}