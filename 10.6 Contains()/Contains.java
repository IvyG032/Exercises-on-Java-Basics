/*
Write a boolean method called contains(), which takes an array of int and an int; and returns true if the array contains the given int. 
The method's signature is as follows:

public static boolean contains(int[] array, int key);
Also write a test driver to test this method.
*/

public class Contains {

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {14,21,28};
        int key = 3;
        System.out.println(contains(array, key));
    }
}