/*
Write a program which prompts user for the number of students in a class (a non-negative integer), 
and saves it in an int variable called numStudents. It then prompts user for the grade of each of the 
students (integer between 0 to 100) and saves them in an int array called grades. 
The program shall then compute and print the average (in double rounded to 2 decimal places) 
and minimum/maximum (in int).

Enter the number of students: 5
Enter the grade for student 1: 98
Enter the grade for student 2: 78
Enter the grade for student 3: 78
Enter the grade for student 4: 87
Enter the grade for student 5: 76
The average is: 83.40
The minimum is: 76
The maximum is: 98
*/

import java.util.Scanner;
import java.util.Arrays;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        // Set up initializers
        int sum = 0;
        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i ++) {
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            int grade = input.nextInt();
            sum += grade;
            grades[i] = grade;
        }
        double average = (double) sum / numStudents;
        String aResult = String.format("%.2f", average);
        System.out.println("The average is: " + aResult);

        Arrays.sort(grades);
        System.out.println("The minimum is: " + grades[0]);
        System.out.println("The maximum is: " + grades[numStudents-1]);
    }
}

/*
Another solution of finding min and max:

int min = grades[0];
int max = grades[0];

for (int i = 1; i < grades.length; i++) {
    if (grades[i] > max) {
        max = grades[i];
    }
    if (grades[i] < min) {
        min = grades[i];
    }
}
*/