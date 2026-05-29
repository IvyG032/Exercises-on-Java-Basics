public class ComputePI2 {
    public static void main(String[] args) {
        double sum = 0.0;
        final int MAX_TERM = 10000;
        for (int term = 1; term <= MAX_TERM; term++) {
            if (term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        System.out.println("PI: " + (double)sum * 4);
    }
}