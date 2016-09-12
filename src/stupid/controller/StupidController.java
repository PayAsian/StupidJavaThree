package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner readKeyboardInput; 
	
	public StupidController()
	{
		myName = "Peyton Trevino";
		readKeyboardInput = new Scanner(System.in);
	}
	public void start()
	{
		System.out.println("This is slightly less stupid :D");
		System.out.println(myName);
		askQuestions();
	}

	
	private void askQuestions()
	{
		System.out.println("What is your Name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput); 
	
		System.out.println(" What is your favorit color? ");
		String userInput1 = readKeyboardInput.nextLine();
		System.out.println(" That's cool I also love the color " + userInput1);
	
		System.out.println(" What is your favorite type of food? ");
		String userInput2 = readKeyboardInput.nextLine();
		System.out.println("No Way! I love " + userInput2);
	
		System.out.println(" What is your faviorte Video Game of all time? ");
		String userInput3 = readKeyboardInput.nextLine();
		System.out.println(" NO way you play it too, ive never met anyone else who have played " + userInput3);
	
		System.out.println("When is your birthday? ");
		int userInput4 = readKeyboardInput.nextInt();
		System.out.println("I love the number" + userInput4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

