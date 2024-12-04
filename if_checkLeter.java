package Try_If_In_Java;
import java.util.Scanner;

public class Try_If {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Charachter: ");
		char leter = scanner.next().charAt(0);



		// Correct condition for checking if 'leter' is a vowel
		if (leter == 'a' || leter == 'o' || leter == 'u' || leter == 'i' || leter == 'e') {
			System.out.println("The letter is a vowel.");
		} else {
			System.out.println("The letter is a consonant.");
		}



		scanner.close();
	}
}
