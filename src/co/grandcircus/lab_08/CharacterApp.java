package co.grandcircus.lab_08;

import java.util.Scanner;

public class CharacterApp {
	public static void main(String[] args) {
			
	// Task: Write a program that will recognize invalid inputs when the user requests information
	// about students in a class. (Characters from the Brad Neely web short series The Professor Brothers, later
	// made into as regular series called China, IL. are used instead.)
	
		Scanner input = new Scanner(System.in);
		
		String prompt;
		String regex = "(role|connection)";
		String yeaNay;
		int characterNum;
		int min = 1;
		int max = 9;

		String[] characters = new String[9];
		characters[0] = "Baby Cakes";
		characters[1] = "Crystal Peppers";
		characters[2] = "The Dean";
		characters[3] = "Frank Smith";
		characters[4] = "The Mayor";
		characters[5] = "Professor Cakes";
		characters[6] = "Pony Merks";
		characters[7] = "Sammy Davis";
		characters[8] = "Steve Smith";
		
		//TODO Gender: he, she, and them. Used so that character names are not repeated in the same sentence.
		
		String[] role = new String[9];
		role[0] = "Student";
		role[1] = "History Teacher";
		role[2] = "School Dean";
		role[3] = "History Teacher";
		role[4] = "Town Mayor, an antagonist";
		role[5] = "Teacher of \"Super Science\"";
		role[6] = "History Teacher Assistant";
		role[7] = "History Teacher";
		role[8] = "History Teacher";
		
		String[] connection = new String[9];
		connection[0] = "Son of Professor Cakes";
		connection[1] = "Rival of Steve Smith";
		connection[2] = "Rival of The Mayor";
		connection[3] = "Brother of Steve Smith";
		connection[4] = "Rival of The Dean";
		connection[5] = "Father of Baby Cakes";
		connection[6] = "Youngest Faculty Member";
		connection[7] = "Oldest Faculty Member";
		connection[8] = "Brother of Frank";
		
		do {
		
		prompt = "Welcome to the Worst College in America! Which character would you like to learn more about?"
						+ " (enter a number 1-9): ";

		characterNum = Validation.getInt(input, prompt, min, max);
		
			System.out.println("You have chosen the character " + characters[characterNum-1] + ". What more would you"
					+ " like to know about " + characters[characterNum-1]
					+ "? (enter \"role\" or \"connection\"): ");
		
			String userChoice = Validation.getStringMatchingRegex(input, "", regex);
			
			if (userChoice.equalsIgnoreCase("role")) {
				System.out.println(characters[characterNum-1] + " has the role of " + role[characterNum-1] + " at"
						+ " the univerity.");
			}
			
			if (userChoice.equalsIgnoreCase("connection")) {
				System.out.println(characters[characterNum-1] + " is the " +connection[characterNum-1] + " .");
			}
			//TODO logic to allow user to chose opposite question for character instead of starting completely over.
		System.out.println("");
		System.out.print("Do you want to continue (y/n)? ");
		yeaNay = input.next();
		
		} while (yeaNay.equalsIgnoreCase("y"));	
		
		//TODO Implement true validation here, method already available in class Validator.java.
		System.out.println("Goodbye.");

		input.close();
	}
}
