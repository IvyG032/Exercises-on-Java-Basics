/**
 Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100. 
 Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily. 
 Also compute and display the average. The output shall look like:
 The sum of 1 to 100 is 5050
 The average is 50.5
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int / int produces int!
        average = sum / (UPPERBOUND - LOWERBOUND + 1.0);
      // Print sum and average
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
   }
}