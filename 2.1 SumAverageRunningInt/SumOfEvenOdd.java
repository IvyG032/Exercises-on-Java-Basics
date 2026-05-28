/*
Modify the program to produce two sums: sum of odd numbers and sum of even numbers from 1 to 100.
Also computer their absolute difference.
HINTS:
 */
public class SumOfEvenOdd {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 10;
      int sumOdd  = 0;   // Accumulating sum of odd numbers
      int sumEven = 0;   // Accumulating sum of even numbers
      int absDiff;       // Absolute difference between the two sums

      // Compute sums
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
         if (number%2 != 0) {
            sumOdd += number;
         } else {
            sumEven += number;
         }
      }
      // Compute Absolute Difference
      if (sumOdd > sumEven) {
         absDiff = sumOdd - sumEven;
      } else {
         absDiff = sumEven - sumOdd;
      }
      // OR use one liner conditional expression
      //absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven) : (sumEven - sumOdd);

      System.out.println("SumOdd: " + sumOdd + ", SumEven" + sumEven);
      System.out.println("AbsDiff: " + absDiff);
   }
}