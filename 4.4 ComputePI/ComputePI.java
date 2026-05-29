/*
Write a program called ComputePI to compute the value of π, using the following series expansion. 
Use the maximum denominator (MAX_DENOMINATOR) as the terminating condition. 
Try MAX_DENOMINATOR of 1000, 10000, 100000, 1000000 and compare the PI obtained. 
Is this series suitable for computing PI? Why?
*/

public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        final int MAX_DENOMINATOR = 1000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1D/denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1D/denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        System.out.println("PI: " + (double)sum * 4);
    }
}