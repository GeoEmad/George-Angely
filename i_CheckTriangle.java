package Try_If_In_Java;
import java.util.Scanner;

public class Try_If {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter scores
		System.out.println("Enter Num1 : ");
		int a = scanner.nextInt();
		System.out.println("Enter Num2: ");
		int b = scanner.nextInt();
		System.out.println("Enter Num3: ");
		int c = scanner.nextInt();


		if(a+b+c == 180) {
			System.out.println("your triangle is valid");
		}
		if(a+b+c != 180) {
			System.out.println("your triangle is not valid");
		}

		scanner.close();
	}
}
