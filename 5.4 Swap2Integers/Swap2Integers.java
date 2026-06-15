import java.util.Scanner; 

public class Swap2Integers {
    public static void main(String[] args) {
        int number1, number2;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        number1 = input.nextInt();
        System.out.print("Enter second number:");
        number2 = input.nextInt();
        input.close();

        int temp = number1; 
        number1 = number2; 
        number2 = temp;

        System.out.println("number1 is " + number1 + " number2 is " + number2);
    }
}
