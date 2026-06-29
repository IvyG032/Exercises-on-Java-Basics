/*
Write a method called arrayToString(), which takes an int array and return a String in the form of [a1, a2, ..., an]. 
Take note that this method returns a String, the previous exercise returns void but prints the output. The method's signature is as follows:

public static String arrayToString(int[] array);
Also write a test driver to test this method (you should test on empty array, one-element array, and n-element array).

Notes: This is similar to the built-in function Arrays.toString(). You could study its source code.
*/

public class ArrayToString {
    
    public static String arrayToString(int[] array) {
        String strs = "[";
        for (int i = 0; i < array.length; i ++) {
            if (i ==0){
                strs += (""+array[i]);
            }
            else{
            strs += (", "+array[i]);
            }
        }
        strs += "]";
        return strs;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {1};
        int[] array3 = {};
        System.out.println(arrayToString(array1));
        System.out.println(arrayToString(array2));
        System.out.println(arrayToString(array3));
    }
}