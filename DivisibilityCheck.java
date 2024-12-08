  // Ass 1 (que.8)  //

 import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        System.out.print("Enter a divisor: ");
        double divisor = scanner.nextDouble();

        if (isDivisible(number, divisor)) {
            System.out.println(number + " is divisible by " + divisor);
        } else {
            System.out.println(number + " is not divisible by " + divisor);
        }
    }

    public static boolean isDivisible(double number, double divisor) {
        return number % divisor == 0;
    }
}
