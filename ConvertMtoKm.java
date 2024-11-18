// Question 05//

import java.util.Scanner;

public class ConvertMtoKm {

	public static void main(String[] args) {

		double miles;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter miles:");
		miles = in.nextDouble();

		double kilometers = miles * 1.6;

		System.out.println(kilometers + " Kilometers");

	}
}