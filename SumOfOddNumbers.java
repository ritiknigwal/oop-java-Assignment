  // question 28 //

public class SumOfOddNumbers {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Call the method to calculate sum of odd numbers
        int sum = sumOfOddNumbers(arr);

        // Print the result
        System.out.println("Sum of odd numbers: " + sum);
    }

    // Method to calculate sum of odd numbers
    public static int sumOfOddNumbers(int[] arr) {
        int sum = 0;

        // Loop through the array
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;  // Add to sum if the number is odd
            }
        }

        return sum;
    }
}