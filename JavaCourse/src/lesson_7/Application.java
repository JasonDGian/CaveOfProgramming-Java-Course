package lesson_7;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		// Create scanner object.
		Scanner input = new Scanner(System.in);
		
		// Output prompt.
		System.out.println("Enter a line of text.");
		
		// Wait for the user to enter a line of text.
		String line = input.nextLine();
		
		// Tell the user what they entered.
		System.out.println("You entered " + line);

	}

}
