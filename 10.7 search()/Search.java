/*
Write a method called search(), which takes an array of int and an int; and returns the array index if the array contains the given int; 
or -1 otherwise. The method's signature is as follows:

public static int search(int[] array, int key);
Also write a test driver to test this method.
*/

public class Search {

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i ++){
            if (array[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {14, 21, 28};
        int key = 2;
        System.out.println(search(array, key));
    }
}
