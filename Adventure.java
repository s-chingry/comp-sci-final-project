package Character;

import java.util.Scanner;

public class Adventure {
	public static void adventure(Character x) throws InterruptedException {
		System.out.println("What is your first course of action? (Type A, B or C)");
//		Thread.sleep(1000);
		System.out.println("A: Venture into the forest");
		System.out.println("B: Walk along the beach");
		System.out.println("C: Go to sleep");
		Scanner console = new Scanner(System.in);
		String choice1 = console.next();
		choice1.toUpperCase();
		if(choice1.contains("A")) {
			System.out.println("You walk to the entrance of the forest. Right when you step onto the dirt, the wind blows through the trees and you hear howling in the distance.");
			System.out.println("You continue walking deeper into the forest. The trees around you seem like they are moving.");
			System.out.println("In the corner of your eye, you see something move in the bushes.");
			System.out.println("A: Pick up a rock nearby and go investigate");
//			Thread.sleep(1000);
			System.out.println("B: Ignore it and continue walking foward");
//			Thread.sleep(1000);
			System.out.println("C: Go to sleep");
			String choice3 = console.next();
			String choice3Upper=choice3.toUpperCase();
			if(choice3Upper.equals("A")) {
				Thread.sleep(1000);
				System.out.println("You peer into the bushes..");
				Thread.sleep(3000);
				System.out.println("A fox jumps out and scrathes your face! You lose 5 points of health.");
				x.health -= 5;
				Thread.sleep(1000);
				System.out.println("What do you do?");
				Thread.sleep(1000);
				System.out.println("A: Run away");
				Thread.sleep(1000);
				System.out.println("B: Hit it with a rock. (75% chance of winning)");
				String choice4 = console.next();
				String choice4Upper = choice4.toUpperCase();
				if (choice4Upper.equals("A")) {
					System.out.println("You run away and find yourself at the beach");
					Other.action(x);
				}
				if (choice4Upper.equals("B")) {
					//Add chance calculator here and lose condition
					System.out.println("You win. You find a steering wheel and return to the beach. You eat the fox and restore 10 points of health.");
					Other.action(x);
				}
		else if(choice1.equals("B")) {
			System.out.println("You walk onto the beach. You see a bunch of crabs and coconuts by the shore, and some smoke rising up from the distance.");
			System.out.println("What do you choose to do?");
			System.out.println("A: Investigate the crabs and coconuts");
			System.out.println("B: Investigate the smoke in the distance");
			String choice2 = console.next();
			choice2.toUpperCase();
			if(choice2.equals("A")); {
				System.out.println("You investigate the crabs and coconuts." );
				System.out.println("You eat the crabs and drink the coconut water");
				System.out.println("Gain 5 hunger and 5 thirst");
					x.health += 5;
					x.thirst += 5;
				System.out.println("Unfortunately, one of the crabs is alive and attacks you!");
				System.out.println("Lose 10 points of health");
					x.health -= 10;
					Other.action(x);
			}
			if(choice2.equals("B")) {
				System.out.println("You walk to the smoke. Lose 5 hunger and 5 thirst.");
					x.health -= 5;
					x.thirst -= 5;
				System.out.println("You find the oil tank for your helicopter");
				System.out.println("There is a strange guy wearing weird clothes sifting through the debris. What do you do?");
				System.out.println("A: Let him take the oil");
				System.out.println("B: Attack the guy for the oil");
				String choice5 = console.next();
				String choice5Upper = choice5.toUpperCase();
				Other.action(x);
				if (choice3.contains("A")) {
					System.out.println("The man takes the oil and leaves. You decide to head to the forest.");
				}
				if (choice3.contains("B")) {
					System.out.println("He attacks you but you successfully kill him. Lose 15 points of health. You get the oil tank and bring it back to the helicopter");
					Other.action(x);
				}
			}
			else if(choice1.equals("C")) {
				Other.sleep(x);
				System.out.println("You wake up feeling refreshed but a little hungrier and thirstier. What do you do now?");
				System.out.println("A: Walk to the forest.");
				System.out.println("B: Walk to the beach.");
			}
		}
		}
	}
}
}
