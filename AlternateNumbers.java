  // Question 30  // 

public class AlternateNumbers {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print every alternate number in the array
        printAlternateNumbers(arr);
    }

    // Method to print every alternate number from the array
    public static void printAlternateNumbers(int[] arr) {
        // Loop through the array, incrementing by 2 to get alternate elements
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line after printing all alternate elements
    }
}