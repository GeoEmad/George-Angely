package Try_If_In_Java;
import java.util.Scanner;

public class Try_If {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year to check it: ");
		int year = scanner.nextInt();


		boolean isLeapYear = false; // Assume it's not a leap year

		if (year % 4 == 0) {
			isLeapYear = true; // A year divisible by 4 might be a leap year
		}

		if (year % 100 == 0) {
			isLeapYear = false; // A year divisible by 100 is not a leap year
		}

		if (year % 400 == 0) {
			isLeapYear = true; // A year divisible by 400 is a leap year
		}

		// Output the result
		if (isLeapYear) {
			System.out.println(year + " is a leap year.");
		}

		if (!isLeapYear) {
			System.out.println(year + " is not a leap year.");
		}



		scanner.close();
	}
}
