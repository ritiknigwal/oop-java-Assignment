 // Ass.1(que.11)  // 

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversed = 0;

        while (number != 0) {
    
            reversed = reversed * 10 + digit; 
            number = number / 10; 
        }

        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}

