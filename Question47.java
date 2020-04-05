public class Question47 {
	
	public static void main(String args []) {

	/*            */

		System.out.println("I'm going to be multiplying all integers between 3-7.");

		int start = 3;
		int end = 2520;

		boolean repeat = true;
		int counter = 3;

		while (repeat) {
		    counter++;
			int number = start * counter;
			System.out.println("3 * 4 = " + number);
			if (counter == 4) {
				counter++;
				System.out.println("3 * 4 * 5 = " + (12 * counter));
			}
			if (counter == 5) {
				counter++;
				System.out.println("3 * 4 * 5 * 6 = " + (60 * counter));
			}
			if (counter == 6) {
				counter++;
				System.out.println("3 * 4 * 5 * 6 * 7 = " + (360 * counter));
			}
			if (counter == 7) {
			repeat = false;
			}
		}
	}
}