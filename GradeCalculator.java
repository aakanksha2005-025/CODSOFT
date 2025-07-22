import java.util.Scanner;

public class GradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int Subjects = scan.nextInt();

        int[] marks = new int[Subjects];
        int total = 0;

        for (int i = 0; i < Subjects; i++) 
        {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scan.nextInt();

            if (marks[i] < 0 || marks[i] > 100)
            {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; 
            } else {
                total += marks[i];
            }
        }

      
        double average = (double) total / Subjects;

        // Grade Calculation
        char grade;
        if (average >= 90) 
        {
            grade = 'A';
        } else if (average >= 80) 
        {
            grade = 'B';
        } else if (average >= 70)
        
        {
            grade = 'C';
        } else if (average >= 60)
        
        {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        } else 
        {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nResult");
        System.out.println("Total Marks: " + total + " / " + (Subjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        scan.close();
    }
}
