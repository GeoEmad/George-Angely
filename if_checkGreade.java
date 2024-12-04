package Try_If_In_Java;
import java.util.Scanner;
public class Try_If {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your score: ");
		int score = scanner.nextInt(); 


		String grade ;
		
        if (score >= 90) {
            grade = "A+";
        } else if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("Your grade is: " + grade);
		scanner.close();
	}

}
