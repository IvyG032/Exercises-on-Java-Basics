/*
Write a program called HarmonicSum to compute the sum of a harmonic series, where n=50000. 
The program shall compute the sum from left-to-right as well as from the right-to-left.
Are the two sums the same? Obtain the absolute difference between these two sums and explain the difference. 
Which sum is more accurate?
*/

public class HarmonicSum{
    public static void main(String[] args) {
        // Define variables
        final int MAX_DENOMINATOR = 5000;  // Use a more meaningful name instead of n
        double sumL2R = 0.0;         // Sum from left-to-right
        double sumR2L = 0.0;         // Sum from right-to-left
        double absDiff;              // Absolute difference between the two sums

        // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            // denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
            sumL2R += 1D/denominator;
            // Beware that int/int gives int, e.g., 1/2 gives 0.
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        // for-loop for summing from right-to-left
        for (int denominator = MAX_DENOMINATOR; denominator >=1; --denominator) {
            sumR2L += 1D/denominator;
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);

        // Find the absolute difference and display
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        }
        else absDiff = sumR2L - sumL2R;
        System.out.println("The absolute difference is: " + absDiff);

    }
}