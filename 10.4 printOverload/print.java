/*
Write a method called print(), which takes an int array and print its contents in the form of [a1, a2, ..., an]. 
Take note that there is no comma after the last element. The method's signature is as follows:

public static void print(int[] array);
Also write a test driver to test this method (you should test on empty array, one-element array, and n-element array).

How to handle double[] or float[]? You need to write a overloaded version for double[] and a overloaded version for float[], 
with the following signatures:

public static void print(double[] array)
public static void print(float[] array)
The above is known as method overloading, where the same method name can have many versions, differentiated by its parameter list.

Hints
For the first element, print its value; for subsequent elements, print commas followed by the value.
*/

public class print {

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i ++){
            if (i==0) {
                System.out.print(array[i]);
            }
            else{
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
    }

    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i ++){
            if (i==0) {
                System.out.print(array[i]);
            }
            else{
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
    }
    
    public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i ++){
            if (i==0) {
                System.out.print(array[i]);
            }
            else{
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        float[] fl = {1.1f, 2.2f,3.3f};
        double[] db = {1.1, 2.2,3.3};
        int[] nums = {1,2,3};
        int[] empty = {};
        int[] single = {7};
        print(empty);
        print(single);
        print(nums);
        print(fl);
        print(db);
    }
}