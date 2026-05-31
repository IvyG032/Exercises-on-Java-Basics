/*
Write a program called CircleComputation that prompts user for the radius of a circle in floating point number. 
The program shall read the input as double; compute the diameter, circumference, and area of the circle in double; 
and print the values rounded to 2 decimal places. Use System-provided constant Math.PI for pi. The formulas are:

diameter = 2.0 * radius;
area = Math.PI * radius * radius;
circumference = 2.0 * Math.PI * radius;
*/
import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
      // Declare variables
    double radius, diameter, circumference, area;  // inputs and results - all in double
    
    Scanner in = new Scanner(System.in);
    // Prompt and read inputs as "double"
    System.out.print("Enter the radius: ");
    radius = in.nextDouble();  // read input as double
    in.close();

    // Compute in "double"  
    diameter = 2.0 * radius;
    area = Math.PI * radius * radius;
    circumference = 2.0 * Math.PI * radius;

    // Print results using printf() with the following format specifiers:
    //   %.2f for a double with 2 decimal digits
    //   %n for a newline
    System.out.printf("Diameter is: %.2f%n", diameter);
    System.out.printf("Area is: %.2f%n", area);
    System.out.printf("Circumference is: %.2f%n", circumference);
    }
}