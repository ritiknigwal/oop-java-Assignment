  // Question 33  //

import java.util.Scanner;

class Commission {
    private double sales; 

    // Constructor to initialize sales
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate commission
    public double getCommission() {
        if (sales < 0) {
            System.out.println("Invalid input: Sales cannot be negative.");
            return 0; // Return 0 if sales is negative
        }
        // Assuming a commission rate of 10% for example
        return sales * 0.1; 
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your total sales: ");
        double totalSales = scanner.nextDouble();

        // Create a Commission object
        Commission commissionCalc = new Commission(totalSales);

        // Calculate and print the commission
        System.out.println("Your commission is: " + commissionCalc.getCommission());
    }
}