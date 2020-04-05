import java.util.Scanner;
import java.lang.Math;


public class Question43 {
	
	public static void main(String args []) {

	/*This program is intended to ask the user for an input bigger than 10
	and output the squareroot of that number, until the number becomes so small
	it can't be squarerooted anymore. Unfortunately I wasn't able top achieve my final goal.*/

		Scanner input = new Scanner (System.in);

		int counter = 0;
		
		boolean repeat = true;

		while (repeat) {
			System.out.println("Input a number that is bigger than 10:");
			double number = input.nextDouble();
			counter++;
			if (number>=10) {
			System.out.println("The number that you entered is " + number);
			double root = (Math.sqrt(number));
			System.out.println(root + " is the squareroot.");
			}
			if (number>=10 && root<=1.01) {
			repeat = false;
			System.out.println("You can't squareroot this number anymore");
			System.out.println("The number of times the number went through the loop is equal to: "
				               + counter + " tries.");
			System.out.println("The final squareroot of " + number + " is equal to " + root);
			}
			if (number<=10) {
			repeat = false;
			System.out.println("Not a valid number, try again.");
			repeat = true;
			}
		}
	}
}