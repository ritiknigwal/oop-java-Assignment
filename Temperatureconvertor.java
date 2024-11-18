 // Question 1 //

import java.util.Scanner;

    public class TemperatureConverter {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Choose conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
    
            int choice = scanner.nextInt();
    
            if (choice == 1) {
                System.out.println("Enter temperature in Celsius:");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + "�C is equal to " + fahrenheit + "�F");


            } else if (choice == 2) {
                System.out.println("Enter temperature in Fahrenheit:");
                double fahrenheit = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + "�F is equal to " + celsius + "�C");
            } else {
                System.out.println("invalid choice.");
            }

    
            scanner.close();
        }
    
        private static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
    
        private static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }