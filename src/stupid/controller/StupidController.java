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
		substringTest();
	}
	
	private void indexofTest()
	{
		String words = " ";
		String sample = "";
		int index = -99;
		
		index = words.indexOf(sample, 3);
		System.out.println("The index of words in sample is: " + index);
		index = sample.indexOf(words);
		System.out.println("The index of words in sample is: " + index);
	}

	private void substringTest()
	{
		String test = "The quick brown fox ... ";
		String words = "... jumped over hte lazy dog";
		
		String other = test.substring(4);
		System.out.println("Here is the substring: " + other);
		other = words.substring(2,5);
		System.out.println("Here is the partial substring: " + other);
	}

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

	System.out.println("What is your favorite song? ");
	String userInput4 = readKeyboardInput.nextLine();
	System.out.println("Thats so cool! I also like " + userInput4);
	
	System.out.println("What is your favorite meme of all times? ");
	String userInput5 = readKeyboardInput.next();
	System.out.println("I aslo like " + userInput5 );
	
	System.out.println("What kind of car do you like? ");
	String userInput6 = readKeyboardInput.nextLine();
	System.out.println("Ew, I hate the looks of " + userInput6);
	
	System.out.println("What is your favorite number?");
	int userInput7 = readKeyboardInput.nextInt();
	System.out.println("Thas cool " + userInput7);
	readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer.
	
}
}
