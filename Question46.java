

public class Question46 {
	
	public static void main(String args []) {

	/*            */

		System.out.println("I'm going to add all integers between 10-20.");

		int start = 10;
		int end = 165;

		boolean repeat = true;
		int counter = 0;

		while (repeat) {
			counter++;
			int number = (start * counter) + counter;
			System.out.println(number);
			
			if (number == 165) {
				repeat = false;
			}
		}
	}
}