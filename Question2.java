import java.util.Scanner;

public class Question2 {
	
	public static void main(String args []) {

		/*This porgram is intended to search for a valid email
		adress. I was not able to complete this program.*/

		Scanner input = new Scanner (System.in);

		System.out.println("Enter an email address to see if it is valid:");
		String str = input.nextLine();

		boolean repeat = true;

		while (str.indexOf('@')) {
			System.out.println("There's a @ in the email");
			if (str.indexOf != '@') {
				repeat = false;
				System.out.println("It is not a valid email address.");
			}

		}
	}
}