/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */
import java.util.Scanner;
public class ProblemSet4 {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		ProblemSet4 pset4 = new ProblemSet4();
		//exercise 1
		System.out.println("Enter outer string: ");
		String out = input.nextLine();
		System.out.println("Enter inner string: ");
		String in = input.nextLine();
		pset4.surroundMe(out, in);
	}
	
	public void surroundMe(String out, String in) {
		int length1 = out.length();
		int length2 = in.length();
		if ((length1 != 4) || (length2 != 3)) {
			System.out.println("null");
		}
		else if ((length1 == 4) && (length2 == 3)) {
			
		}
		if ((out == "null") || (in == "null")) {
			System.out.println("null");
		}
		if (out == in) {
			System.out.println("null");
		}
	}
	
	public void endsMeet(String str, int n) {
		
	}
}
