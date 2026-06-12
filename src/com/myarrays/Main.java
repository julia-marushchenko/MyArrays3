/**
 *  Java program to find the sum of all elements in arrays.
 */
package com.myarrays;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Array with length 8 and given elements.
        int[] arr = {1, -8, 9, 5, -2, -7, 4, 2};

        // Sum of array.
        int sum = 0;

        // Finding the sum.
        for (int i = 0; i < arr.length; i++) {

            // Adding next element.
            sum = sum + arr[i];

        }

        // Printing sum to console.
        System.out.println(" Sum is " + sum); // Output:  Sum is 4

    }
}