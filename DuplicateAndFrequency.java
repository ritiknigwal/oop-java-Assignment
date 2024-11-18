  // Question 29  // 

import java.util.HashMap;

public class DuplicateAndFrequency {
    public static void main(String[] args) {
        // Example array
        int[] arr = {4, 5, 7, 4, 2, 9, 5, 5, 7, 7};

        // Print original array
        System.out.println("Original Array:");
        printArray(arr);

        // Duplicate elements in the array
        int[] duplicatedArray = duplicateArrayElements(arr);

        // Print the duplicated array
        System.out.println("\nDuplicated Array:");
        printArray(duplicatedArray);

        // Find and print the frequency of each element
        System.out.println("\nFrequency of Elements:");
        findFrequency(duplicatedArray);
    }

    // Method to duplicate elements in the array
    public static int[] duplicateArrayElements(int[] arr) {