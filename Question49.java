import java.util.Scanner;

public class Question49 {
	
	public static void main(String args []) {

	/*            */

		Scanner input = new Scanner (System.in);

		int counter = 0;
		
		boolean repeat = true;

		System.out.println("How many times would like <Hello World!> to be printed?");
		int number = input.nextInt();

		while (repeat) {
			counter++; 
			System.out.println("Hello World!");
		if (counter == number) {
		repeat = false;
		}
		}
	}
}
