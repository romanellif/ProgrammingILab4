import java.util.Scanner;

public class Question1 {
	
	public static void main(String args []) {

	/*          */

		String str, rev = "";
		Scanner input = new Scanner (System.in);

		System.out.println("Input a palindrome (can be a sentence or a word)");

		str = input.nextLine();
 
      	int length = str.length();
 
      	for ( int i = length - 1; i >= 0; i-- )
        rev = rev + str.charAt(i);
 
     	if (str.equals(rev))
        System.out.println(str+" is a palindrome");
      	else
        System.out.println(str+" is not a palindrome");
 
	}
}
