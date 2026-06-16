/*
Write a program called printArrayInStars which prompts user for the number of items in an array (a non-negative integer), 
and saves it in an int variable called NUM_ITEMS. 
It then prompts user for the values of all the items (non-negative integers) 
and saves them in an int array called items. The program shall then print the contents of the array in a graphical form, 
with the array index and values represented by number of stars. For examples,

Enter the number of items: 5
Enter the value of all items (separated by space): 7 4 3 0 7
0: *******(7)
1: ****(4)
2: ***(3)
3: (0)
4: *******(7)
*/
import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        // Declare variables
        final int NUM_ITEMS;
        int[] items;  // Declare array name, to be allocated after NUM_ITEMS is known
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = input.nextInt();
        items = new int[NUM_ITEMS];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; ++i) {  // Read all items
                items[i] = input.nextInt();
            }
        }

        // Print array in "index: number of stars" using a nested-loop
        // Take note that rows are the array indexes and columns are the value in that index
        for (int idx = 0; idx < items.length; ++idx) {  // row
        System.out.print(idx + ": ");
        // Print value as the number of stars
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
            System.out.print("*");
            }
        System.out.print("(" + items[idx] + ")" + "\n");
        }
    }
}
