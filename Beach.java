package Character;

import java.util.Scanner;

public class Beach {
	public static void beach(Character x) {
		Scanner console = new Scanner(System.in);
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
			System.out.println("You walk to the smoke. Lose 5 hunger and 5 thirst.");
				x.health -= 5;
				x.thirst -= 5;
			System.out.println("You find the oil tank for your helicopter");
			System.out.println("There is a strange guy wearing weird clothes sifting through the debris. What do you do?");
			System.out.println("A: Let him take the oil");
			System.out.println("B: Attack the guy for the oil");
			String choice3 = console.next();
			String choice3Upper = choice3.toUpperCase();
			Other.action(x);
			if (choice3.contains("A")) {
				System.out.println("The man takes the oil and leaves. You decide to head to the forest.");
			}
			if (choice3.contains("B")) {
				System.out.println("He attacks you but you successfully kill him. Lose 15 points of health. You get the oil tank and bring it back to the helicopter");
				Other.action(x);
			}
			Adventure.beachDone = true;
			Forest.forest(x);
		}
		if(choice2.equals("B")) {
			System.out.println("You walk to the smoke. Lose 5 hunger and 5 thirst.");
				x.health -= 5;
				x.thirst -= 5;
			System.out.println("You find the oil tank for your helicopter");
			System.out.println("There is a strange guy wearing weird clothes sifting through the debris. What do you do?");
			System.out.println("A: Let him take the oil");
			System.out.println("B: Attack the guy for the oil");
			String choice3 = console.next();
			String choice3Upper = choice3.toUpperCase();
			Other.action(x);
			if (choice3.contains("A")) {
				System.out.println("The man takes the oil and leaves. You decide to head to the forest.");
			}
			if (choice3.contains("B")) {
				System.out.println("He attacks you but you successfully kill him. Lose 15 points of health. You get the oil tank and bring it back to the helicopter");
				Other.action(x);
			}
			Adventure.beachDone = true;
			Forest.forest(x);
			
		}
	}
}
