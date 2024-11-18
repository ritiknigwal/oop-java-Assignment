   // Question 18  //

   import java.util.Scanner;

   public class CountDigits {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
   
           System.out.print("Enter an integer: ");
           int number = scanner.nextInt();
   
           scanner.close();
   
           if (number == 0) {
               System.out.println("The number has 1 digit.");
           } else {
               int digitCount = 0;
   
               number = Math.abs(number);
   
               while (number > 0) {
                   number /= 10;  
                   digitCount++;  
               }
   
               
               System.out.println("The number has " + digitCount + " digits.");
           }
       }
   }