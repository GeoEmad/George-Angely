package Try_If_In_Java;
import java.util.Scanner;
public class Try_If {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt(); 


		if(num >= 0) {
			if(num%2==0)
			{
				System.out.println("Your num is Pos,Even");
			}
			else {
				System.out.println("Your num is Pos,Odd");
			}
		}
		else
		{
			System.out.println("Plz enter Positve num !");
		}
		scanner.close();
	}

}