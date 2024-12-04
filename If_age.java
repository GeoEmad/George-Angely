package Try_If_In_Java;
import java.util.Scanner;
public class Try_If {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scanner.nextInt(); 
		if(age <= 30)	{
			System.out.println("Not old !!");
		}
		if(age>30 && age<50) {
			System.out.println("old enough !!");
		}
		if(age > 50)	{
			System.out.println("روح موت يا عم");
		}
		scanner.close();
}
	
}
