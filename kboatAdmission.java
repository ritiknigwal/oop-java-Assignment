//A-1 Ques12

12import java.util.Scanner;

public class KboatAdmission
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int p = in.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int c = in.nextInt();
        System.out.print("Enter marks in Mathematics: ");
        int m = in.nextInt();
        int t = p + c + m;
        int pm = p + m;
        
        if (p >= 70 && c >= 60 && m >= 70 
             && (t >= 225 || pm >= 150))
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }