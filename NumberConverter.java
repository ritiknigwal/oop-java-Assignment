  // Question 21  //

      //BINARY TO DECIMAL AND DECIMAL TO BINARY
      import java.util.Scanner;

      public class NumberConverter {
      
          public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
      
              System.out.println("Choose an option:");
              System.out.println("1. Convert Binary to Decimal");
              System.out.println("2. Convert Decimal to Binary");
              System.out.print("Enter your choice (1/2): ");
              int choice = scanner.nextInt();
      
              if (choice == 1) {
                  System.out.print("Enter a binary number: ");
                  String binary = scanner.next();
                  try {
                      int decimal = binaryToDecimal(binary);
                      System.out.println("Binary " + binary + " is Decimal " + decimal);
                  } catch (NumberFormatException e) {
                      System.out.println("Invalid binary number entered.");
                  }
              }
              else if (choice == 2) {
                  System.out.print("Enter a decimal number: ");
                  int decimal = scanner.nextInt();
                  String binary = decimalToBinary(decimal);
                  System.out.println("Decimal " + decimal + " is Binary " + binary);
              } else {
                  System.out.println("Invalid choice. Please choose 1 or 2.");
              }
      
              scanner.close();
          }
      
          public static int binaryToDecimal(String binary) {
              return Integer.parseInt(binary, 2);
          }
      
          public static String decimalToBinary(int decimal) {
              return Integer.toBinaryString(decimal);
          }
      }