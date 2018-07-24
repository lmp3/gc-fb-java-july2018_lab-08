package co.grandcircus.fbjava_july2018.lab_08;

import java.util.Scanner;

public class Lab_08 {
	public static void main(String[] args) {
			
	// Task: Write a program that will recognize invalid inputs when the
	// user requests information about students in a class.

// Characters from the Brad Neely web short The Professor Brothers, later made into as series called China, IL.		
//					
//		Name				Role							Connection to other characters 
//	Baby Cakes			Student							son of P. Cakes
//	Crystal Peppers 	history teacher					rival of Steve
//	The Dean			School Dean  					rival of the mayor
//	Frank Smith			history teacher					brother of Steve
//	Professor Cakes		teacher of \'super science\'	father of b cakes
//	Sammy Davis			history teacher					oldest staff
//	Steve Smith			history teacher					brother of frank
//	Pony Merks			teacher assistant of history	youngest staff
//	The Mayor			City Mayor						rival of the dean
	
		Scanner scnr = new Scanner(System.in);
		
		String characterName;
		int characterNum;

		String[] characters = new String[8];
		characters[0] = "Baby Cakes";
		characters[1] = "Crystal Peppers";
		characters[2] = "The Dean";
		characters[3] = "Frank Smith";
		characters[4] = "The Mayor";
		characters[5] = "Professor Cakes";
		characters[6] = "Pony Merks";
		characters[7] = "Sammy Davis";
		characters[8] = "Steve Smith";
		
		String[] roles = new String[8];
		roles[0] = "Student";
		roles[1] = "History Teacher";
		roles[2] = "School Dean";
		roles[3] = "History Teacher";
		roles[4] = "Town Mayor";
		roles[5] = "Teacher of 'Super Science'";
		roles[6] = "History Teacher Assistant";
		roles[7] = "History Teacher";
		roles[8] = "History Teacher";
		
		String[] connection = new String[8];
		connection[0] = "Son of Professor Cakes";
		connection[1] = "Rival of Steve Smith";
		connection[2] = "Rival of The Mayor";
		connection[3] = "Brother of Steve Smith";
		connection[4] = "Rival of The Dean";
		connection[5] = "Father of Baby Cakes";
		connection[6] = "Youngest Faculty Member";
		connection[7] = "Oldest Faculty Member";
		connection[8] = "Brother of Frank";
		
		System.out.println("Welcome to the Worst College in America! Which character would you like to learn "
				+ "more about? (enter a number 1-9): ");
		
		System.out.println("That character does not exist or unrepresented here. Please try again. (enter a"
				+ " number 1-9): ");
		
		System.out.println("Character " + characterNum  + " is " + characterName);
	}
}
