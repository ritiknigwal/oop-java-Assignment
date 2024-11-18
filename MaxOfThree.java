  // Question 03 //

import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the First Number: ");
    int a = scanner.nextInt();

    System.out.println("Enter the First Number: ");
    int b = scanner.nextInt();

    System.out.println("Enter the First Number: ");
    int c = scanner.nextInt();
    
    int max = a;  // Assuming a is maximux initially

    if(b>max){
        max = b;
    }

    if(c>max){
        max = c;
    }

    System.out.println("The maximum number is: " + max);

    scanner.close();
}
}
