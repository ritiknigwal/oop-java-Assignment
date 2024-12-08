// Question 05//

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();

        double kilometers = milesToKilometers(miles);
        System.out.printf("%.2f miles is equal to %.2f kilometers%n", miles, kilometers);
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
