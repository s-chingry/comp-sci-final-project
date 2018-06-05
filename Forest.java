package Character;

import java.util.Scanner;

public class Forest {
	public static void forest(Character x) {
		Scanner console = new Scanner(System.in);
		System.out.println("You walk to the entrance of the forest. Right when you step onto the dirt, the wind blows through the trees and you hear howling in the distance.");
		System.out.println("You continue walking deeper into the forest. The trees around you seem like they are moving.");
		System.out.println("In the corner of your eye, you see something move in the bushes.");
		System.out.println("A: Pick up a rock nearby and go investigate");
//		Thread.sleep(1000);
		System.out.println("B: Ignore it and continue walking foward");
//		Thread.sleep(1000);
		System.out.println("C: Go to sleep");
		String choice3 = console.next();
		String choice3Upper=choice3.toUpperCase();
		if(choice3Upper.equals("A")) {
//			Thread.sleep(1000);
			System.out.println("You peer into the bushes..");
//			Thread.sleep(3000);
			System.out.println("A fox jumps out and scrathes your face! You lose 5 points of health.");
			x.health -= 5;
//			Thread.sleep(1000);
			System.out.println("What do you do?");
//			Thread.sleep(1000);
			System.out.println("A: Run away");
//			Thread.sleep(1000);
			System.out.println("B: Hit it with a rock. (75% chance of winning)");
			String choice4 = console.next();
			String choice4Upper = choice4.toUpperCase();
			if (choice4Upper.equals("A")) {
				System.out.println("You run away and find yourself at the beach");
				Other.action(x);
				Beach.beach(x);
				System.out.println("You walk to the entrance of the forest. Right when you step onto the dirt, the wind blows through the trees and you hear howling in the distance.");
				System.out.println("You continue walking deeper into the forest. The trees around you seem like they are moving.");
				System.out.println("In the corner of your eye, you see something move in the bushes.");
				System.out.println("This time you investigate the bush.");
				System.out.println("A fox jumps out and scrathes your face! You lose 5 points of health.");
				System.out.println("You hit it with a rock (75% chance of winning)");
			}
			if (choice4Upper.equals("B")) {
				System.out.println("You try to hit the fox with the rock...");
				double fight=Math.random();
				if(fight>.75) {
					System.out.println("The fox dodges your attack! The fox swipes at your legs. You lose 5 points of health.");
					//x.health -= 5;
					System.out.println("What do you do?");
			//		Thread.sleep(1000);
					System.out.println("A: Run away");
			//		Thread.sleep(1000);
					System.out.print("B: Hit it with a rock. (60% chance of winning)");
					String choice5 = console.next();
					String choice5Upper = choice5.toUpperCase();
					if(choice5Upper.equals("A")) {
						System.out.println("You run away and find yourself at the beach");
						//	Other.action(x);
					}
					if (choice4Upper.equals("B")) {
						System.out.println("You try to hit the fox with the rock...");
						double fight2=Math.random();
						if(fight2>.60) {
							System.out.println("The fox dodges your attack! You turn and try to run away but the fox swipes at your ankles and tears through your achilles heel.");
							System.out.println("As you bleed out, the fox starts to eat your leg. Eventually, you black out from the pain.");
							System.out.println("YOU DIED.");
							System.out.println("THE END");
						}
						else {
							System.out.println("You hit the fox in the head, killing it instantly. You realize that the fox was guarding something in the bushes. As you move the fox's body, you find a steering wheel and return to the beach. You eat the fox and restore 5 points of hunger and thirst.");
							//x.hunger +=5;
							//x.thirst +=5;
						}
					}
				}
				else {
					System.out.println("You hit the fox in the head, killing it instantly. You realize that the fox was guarding something in the bushes. As you move the fox's body, you find a steering wheel and return to the beach. You eat the fox and restore 5 points of hunger and thirst.");
					//x.hunger +=5;
					//x.thirst +=5;
				}
				//Add chance calculator here and lose condition
				Other.action(x);
				Beach.beach(x);
				Adventure.forestDone = true;
			}
	}
	}
}
	
