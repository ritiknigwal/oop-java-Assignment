   // Question 15  //

   import java.util.Scanner;

   public class MultiplicationTable {
   
       public static void main(String[] args) {
          
           Scanner scanner = new Scanner(System.in);

           System.out.print("Enter a number to generate its multiplication table: ");
           int number = scanner.nextInt();
   
           System.out.print("Enter the range (up to which the table should go): ");
           int range = scanner.nextInt();
   
           System.out.println("\nMultiplication Table for " + number + " up to " + range + ":");
           for (int i = 1; i <= range; i++) {
               System.out.println(number + " x " + i + " = " + (number * i));
           }
   
           scanner.close();
       }
   }