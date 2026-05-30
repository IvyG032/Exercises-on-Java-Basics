/*
Write a program called SumProductMinMax3 that prompts user for three integers. 
The program shall read the inputs as int; compute the sum, product, minimum and maximum of the three integers; and print the results. 
For examples,
Enter 1st integer: 8
Enter 2nd integer: 2
Enter 3rd integer: 9
The sum is: 19
The product is: 144
The min is: 2
The max is: 9
*/
import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        // Define variables
        int number1, number2, number3;
        int sum, product, min, max;

        // Prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();
        System.out.print("Enter third number: ");
        number3 = input.nextInt();
        input.close();

        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }

        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        System.out.print(
            "The sum is: " + sum + "\n" +
            "The product is: " + product + "\n" +
            "The min is: " + min + "\n" +
            "The max is: " + max + "\n"
        );
    }
}