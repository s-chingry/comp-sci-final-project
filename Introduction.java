import java.util.Scanner;

public class Introduction {
	public static void introduction() throws InterruptedException {
		String lovedOne = "spouse";
		Scanner console = new Scanner(System.in);
		System.out.println("Please Enter Your Name:");
		String name = console.next();
		System.out.println("How old would you like to be?");
		String age = console.next();
		int result = Integer.parseInt(age);
		if (result<12) {
			System.out.println("You're too young to play the game! Please choose another age.");
			String newAge = console.next();
			int newResult = Integer.parseInt(newAge);
			result=newResult;
		}
		if (result>80) {
			System.out.println("You're too old to play the game! Please choose another age.");
			String newAge = console.next();
			int newResult = Integer.parseInt(newAge);
			result=newResult;
		}
		if(result<25) {
			lovedOne= "Dad";
		}
		System.out.println("Hello " + name + "! Today is your " + age + "th birthday! You are going on a trip to the philippines with your " + lovedOne +"!");
		Thread.sleep(4000);
		System.out.println("As you get on the helicopter, you see a section of metal missing on one of the wings. Oh well. You decide to go to sleep.");
		Thread.sleep(4000);
		System.out.println("You wake up to screaming. Your " + lovedOne + " is holding onto you, screaming your name. " +name + "!!! WAKE UP! THE HELICOPTER IS GOING DOWN.");
		Thread.sleep(4000);
		System.out.println("Everything goes black.");
		for (int i = 0; i<5;i++) {
			Thread.sleep(1000);
			System.out.println(".");
		}
		Thread.sleep(1000);
		System.out.println("You wake up to birds chirping. As you look around, you realize you're on a beach. You see the helicopter next to you but you don't know where your " +lovedOne + " is." );
		Thread.sleep(4000);
		System.out.println("You get up and walk to the helicopter to see if its still operational. The engine is missing and there are some wiring issues.");
		Thread.sleep(4000);
		System.out.println("Instructions: Your goal is to escape the island. You can do so by fixing up the helicopter or by waiting for somebody to rescue you.");
		Thread.sleep(4000);
		System.out.println("For stats, type \"Stats\" during your decision turns.");
	}
	public static void adventure() throws InterruptedException {
		System.out.println("What is your first course of action? (Type A, B or C)");
		Thread.sleep(1000);
		System.out.println("A: Venture into the forest");
		System.out.println("B: Walk along the beach");
		System.out.println("C: Go to sleep");
		Scanner console = new Scanner(System.in);
		String choice1 = console.next();
		choice1.toUpperCase();
		if(choice1 == "A") {
			System.out.println("You walk to the entrance of the forest. Right when you step onto the dirt, the wind blows through the trees and you hear howling in the distance.");
			System.out.println("What do you choose to do?");
			System.out.println("A: Continue exploring in the forest");
			System.out.println("B: Go back to the helicopter.");
			String choice2 = console.next();
			choice2.toUpperCase();
			if(choice2 == "B") {
				System.out.println("You walk back to the helicopter.");
				adventure();
			}
			System.out.println("You continue walking deeper into the forest. The trees around you seem like they are moving.");
			System.out.println("In the corner of your eye, you see something move in the bushes.")
		}
		if(choice1 == "B") {
			
		}
		
		
	}
	public static void main(String [] args) throws InterruptedException {
		introduction();
		adventure();
	}
}
