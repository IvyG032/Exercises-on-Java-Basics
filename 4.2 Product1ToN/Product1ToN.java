/*
Write a program called Product1ToN to compute the product of integers from 1 to 10 (i.e., 1×2×3×...×10), as an int. 
Take note that It is the same as factorial of N.
Hints
Declare an int variable called product, initialize to 1, to accumulate the product.
      // Define variables
      int product = 1;      // The accumulated product, init to 1
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 10;
*/
public class Product1ToN {
    public static void main(String[] args) {
        // Define variables
        int product = 1;      // The accumulated product, init to 1
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;

        for  (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            product *= number;
        }
        System.out.print("Product: " + product);
    }
}