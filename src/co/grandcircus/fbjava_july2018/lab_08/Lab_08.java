package co.grandcircus.fbjava_july2018.lab_08;

import java.util.Scanner;
//import java.util.regex.Matcher;

public class Lab_08 {
	public static void main(String[] args) {
			
	// Task: Write a program that will recognize invalid inputs when the
	// user requests information about students in a class.

// Characters from the Brad Neely web short The Professor Brothers, later made into as series called China, IL.
	
		Scanner input = new Scanner(System.in);
		
		//String characterName;
		String prompt;
		String regex = "(roles|connection)";
		String yeaNay;
		int characterNum;
		int min = 1;
		int max = 9;
		//regex = ?

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
		
		String[] roles = new String[9];
		roles[0] = "Student";
		roles[1] = "History Teacher";
		roles[2] = "School Dean";
		roles[3] = "History Teacher";
		roles[4] = "Town Mayor";
		roles[5] = "Teacher of \"Super Science\"";
		roles[6] = "History Teacher Assistant";
		roles[7] = "History Teacher";
		roles[8] = "History Teacher";
		
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
		
			System.out.println("You have chosen the character " + characters[characterNum-1] + ". What would you like to know"
					+ " more about " + characters[characterNum-1] + "? (enter \"roles\" or \"connection\"): ");
		
			String userChoice = Validation.getStringMatchingRegex(input, "", regex);
			
			if (userChoice.equalsIgnoreCase("roles")) {
				System.out.println("You have chosen to know what " + characters + " role a and they " + roles);
			}
			
			if (userChoice.equalsIgnoreCase("connection")) {
				System.out.println(connection[characterNum]);
			}
			//TODO logic to allow user to chose opposite  
		System.out.println("");
		System.out.print("Do you want to continue (y/n)? ");
		yeaNay = input.next();
		
		} while (yeaNay.equals("y"));	
		
		System.out.println("Goodbye.");
		
		input.close();
	}
}
