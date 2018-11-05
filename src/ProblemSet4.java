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
import java.util.Objects;
import java.util.Scanner;
public class ProblemSet4 {
	
	private static Scanner input = new Scanner(System.input);
	public static void main(String[] args) {
		ProblemSet4 pset4 = new ProblemSet4();
		//exercise 1
		System.out.println("Enter outer string: ");
		String out = input.nextLine();
		System.out.println("Enter inner string: ");
		String in = input.nextLine();
		pset4.surroundMe(out, in);
		
		//exercise 2
		System.out.println("Enter word. It must be between 1 and 10 characters: ");
		String str = input.nextLine();
		System.out.println("Enter index. Must be between 1 and the length of the word.");
		int n = input.nextInt();
		pset4.endsMeet(str, n);
		
		input.nextLine();
		
		//exercise 3
		System.out.println("Enter word: ");
		String str = input.nextLine();
		pset4.middleMan(str);
		
		//exercise 4
		System.out.println("Enter string: ");
		String str = input.nextLine();
		pset4.doubleVision(str);

		//exercise 5
		System.out.println("Enter string: ");
		String string = input.nextLine();
		System.out.println("Enter target: ");
		String target = input.nextLine();
		pset4.centered(string, target); 
		
		//exercise 6
		System.out.println("Enter double.");
		double number = input.nextDouble();
		System.out.println("Enter either 'r', 'f', or 'c'.");
		String letter = input.next();
		char operation = letter.charAt(0);
		pset4.upOrDown(number, operation);
		
		//exercise 7
		System.out.println("Enter text.");
		input.nextLine();
		String text = input.nextLine();
		System.out.println("Enter letter to find.");
		String index = input.next();
		char end = index.charAt(0);
		pset4.countMe(text, end);	
		
		input.nextLine();
		
		//exercise 8
		System.out.println("Enter text.");
		String strings= in1.nextLine();
		pset4.isNotEqual(strings);	
		
		//exercise 9
		System.out.println("Enter text.");
		String three = input.nextLine();
		pset4.triplets(three);
		
		//exercise 10
		System.out.println("Enter string.");
		String set = input.nextLine();
		System.out.println("Enter boolean.");
		boolean digits = input.nextBoolean();
		pset4.addMe(set, digits);

		input.close();
	}
	
	
	public String surroundMe(String out, String in) {
    	String surround;
		int length1 = out.length();
		int length2 = in.length();
		if (((length1 != 4) || (length2 != 3))) {
			System.out.println("String must be correct length");
			return null;
		}
		else if ((out == "null") || (in == "null")) {
			return null;
		}
		else if (out == in) {
			return null;
		}
		else {
            String start = out.substring(0, 2);
            String end = out.substring(2, 4);
            surround = start + in + end;
            System.out.println(surround);
            return surround;
		}
	}
	
	public String endsMeet (String str, int n) {
		String begin;
		int length = str.length();
		if (str == "null") {
			return null;
		}
		else if (length > 10) {
			return null;
		}
		else if ((n < 1) || (n > length)) {
			return null;
		}
		else {
			String end1 = str.substring(0, n);
			String end2 = str.substring((length - n), length);
			begin = end1 + end2;
			System.out.println(begin);
			return begin;
		}
	}
	
	public String middleMan(String str) {
		String middle;
		int len = str.length();
		if (str == null) {
			return null;
		}
		if (str.length() % 2 == 0) {
			System.out.println("Enter string of correct length.");
			return null;
		}
		else {
			int index1 = 0;
			int index2 = end;
			String output = null;
			for (int i = 0; i < end; i++) {
				output = str.substring(index1, index2);
				if (output.length() != 3) {
					start++;
					end--;
				}
			}
			middle = output;
			System.out.println(output);
			return middle;
		}
	}
	public String doubleVision(String str) {
		String doubled = null;
		int len = str.length();
		if (str == null) {
			System.out.println("Must not be null.");
			return null;
		}
		else {
			int letter = 0;
			while (i < len) {
				if (doubled == null) {
					doubled = str.substring(letter, (letter + 1)) + str.substring(letter, (letter + 1));
				}
				else {
					doubled = doubled + str.substring(letter, (letter + 1)) + str.substring(letter, (letter + 1));
				}
				i++;
			}
			System.out.println(doubled);
			return doubled;
		}
	}
	public boolean centered(String str, String target) {
		int center = 0;
		boolean isCenter;
		String index1;
		String index2;
		int len = str.length();
		if (str == null || target == null) {
			System.out.println(false);
			return false;
		}
		if (target.length() != 3) {
			System.out.println(false);
			return false;
		}
		else {
			for (int i = 0; i <= (len - 3); i++) {
			    if (target.equals(str.substring(i, (i + 3))) == true) {
			        index1 = str.substring(0, 1);
			    }
			    else {
			        index1 = str.substring(0, (i - 1));
			    }
			    index2 = str.substring((i + 4), len);
					if (((index1.length() - index2.length()) == 0) || ((index1.length() - index2.length()) == 1)) {
						center++;
					}
			    }
			}
			if (center != 0) {
				isCenter = true;
				System.out.println(isCenter);
				return true;
			}
			else {
				isCenter = false;
				System.out.println(isCenter);
				return false;
			}
		}
	}

    public int upOrDown(double number, char operation) {
		int direction = 0;
		switch (operation) {
		case 'f':
			direction = (int)Math.floor(number);
			System.out.println(direction);
			return direction;
		case 'r':
			direction = (int)Math.round(number);
			System.out.println(direction);
			return direction;
		case 'c':
			direction = (int)Math.ceil(number);
			System.out.println(direction);
			return direction;
		default:
			direction = -1;
			System.out.println(direction);
			return direction;
		}
	}
	public int countMe(String text, char end) {
		int count = 0;
		int len = text.length();
		if (text == null) {
			System.out.println(-1);
			return -1;
		}
		for (int i = 0; i <= (len - 1); i++) {
			if (text.charAt(i) == ' ' || i == (len - 1)) {
				if (Character.isLetter(text.charAt(i - 1)) || Character.isLetter(text.charAt(i))) {
					if (text.charAt(i - 1) == end || text.charAt(i) == end) {
						count++;
					}
				}
				else {
					System.out.println(-1);
					return -1;
				}
			}
		}
		System.out.println(count);
		return count;
	}
	public boolean isNotEqual(String str) {
		boolean equalTo = false;
		int countIsNot = 0;
		int countIs = 0;
		int len = str.length();
		if (str == null) {
			System.out.println(false);
			return false;
		}
		for (int i = 0; i <= (len - 2); i++) {
			if (i != (len - 2)) {
				if (Objects.equals(str.substring(i, (i + 3)), "not")) {
					countIsNot++;
				}
			}
			if (Objects.equals(str.substring(i, (i + 2)), "is")) {
				countIs++;
			}
		}
		if (countIsNot == countIs) {
			equalTo = true;
		}
		System.out.println(equalTo);
		return equalTo;
	}
	public int triplets(String str) {
		String index;
		int threes = 0;
		int len = str.length();
		if (str == null) {
			System.out.println(-1);
			return -1;
		}
		for (int i = 0; i < len; i++) {
			if (Character.isLetter(str.charAt(i)) == false || str.charAt(i) == ' ') {
				System.out.println(-1);
				return -1;
			}
		}
		for (int i = 0; i <= (len - 3); i++) {
			index = Character.toString(str.charAt(i)) + Character.toString(str.charAt(i)) + Character.toString(str.charAt(i));
			if (Objects.equals(index, str.substring(i, (i + 3)))) {
				three++;
			}
		}
		System.out.println(threes);
		return threes;
	}
	public int addMe(String str, boolean digits) {
		boolean index = false;
		int index1;
		int add = 0;
		int len = str.length();
		if (str == null) {
			System.out.println(-1);
			return -1;
		}
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') {
				System.out.println(-1);
				return -1;
			}
		}
		if (digits == true) {
			for (int i = 0; i < len; i++) {
				if (Character.isDigit(str.charAt(i)) == true) {
					add = add + Character.getNumericValue(str.charAt(i));
				}
			}
		}
		else {
			for (int i = 0; i < len; i++) {
				if (Character.isDigit(str.charAt(i)) == true) {
					index1 = true;
					add = i;
					i++;
					while (temp == true && (i < len)) {
						if (Character.isDigit(str.charAt(i)) == true) {
							index = true;
							i++;
						}
						else {
							index = false;
						}
					}
					add = add + Integer.valueOf(str.substring(add, i));
				}
			}
		}
		System.out.println(add);
		return add;
	}
}
