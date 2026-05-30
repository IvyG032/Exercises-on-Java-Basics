import java.util.Scanner;   // For keyboard input
/**
 * Write a program called Add2Integers that prompts user to enter two integers. 
 * The program shall read the two integers as int; compute their sum; and print the result. For example,
    Enter first integer: 8
    Enter second integer: 9
    The sum is: 17
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum in "int"
 * 4. Print the result
 */
public class Add2Integers {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
      // Declare variables
      int number1, number2, sum;
      
      // Put up prompting messages and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
      System.err.print("Enter second integer: ");
      number2 = in.nextInt();
      in.close();  // Close Scanner

      // Compute sum
      sum = number1 + number2;

      // Display result
      System.out.println("The sum is: " + sum);   // Print with newline
   }
}