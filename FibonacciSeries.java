  // Ass1.(que.10)  //

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        long first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= n; i++) {
            long nextTerm = first + second;
            System.out.print(nextTerm + " ");
            
            first = second;
            second = nextTerm;
        }

        scanner.close();
    }
}
