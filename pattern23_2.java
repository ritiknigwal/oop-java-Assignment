//A-1 Ques23(b)

public class NumberDiamondPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            
            // Printing decreasing sequence from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // Printing increasing sequence from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}