import java.util.Scanner;
import java.util.Random;

public class Question3 {
	
	public static void main(String args []) {

		/*This program prompts the user to guess the number generated at random, 
		if the user is able to guess the number between 0-100 in under 10 tries, 
		If the user is not able to guess the number in 10 tries, he loses. */

		Scanner input = new Scanner (System.in);

		Random random = new Random ();
    	
    	int start = 0;
    	int end = 100;
    	
    	int number = random.nextInt(end - start + 1) + start;

    	boolean repeat = true;
    	int counter = 11;

    	while (repeat) {
    		counter--;
    		System.out.println("Guess a number from 0-100 (you have a total of " + counter + " tries.):");
		    int guess = input.nextInt();
    		if (guess == number) {
    				System.out.println("You have guessed the right number");
    			repeat = false;
    		}
    		if (guess != number) {
    			repeat = false;
    				System.out.println("Try again");
    			repeat = true;
       		}
    		}
    		if (counter<=0) {
    			repeat = false;
    				System.out.println("I'm sorry, you weren't able to guess the random number. :(");
    		}
    	}
	}	