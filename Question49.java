import java.util.Scanner;

public class Question49 {
	
	public static void main(String args []) {

	/*This programs prompts the user for how many times they would like to print
	'Hello World'. The program will output the number requested by the user.*/

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
