package Character;

import java.util.Scanner;

public class Adventure {
	public static boolean forestDone = false;
	public static boolean beachDone = false;
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
				Forest.forest(x);
				}
		else if(choice1.equals("B")) {
			Beach.beach(x);
			}
			else if(choice1.equals("C")) {
				Other.sleep(x);
				System.out.println("You wake up feeling refreshed but a little hungrier and thirstier. What do you do now?");
				System.out.println("A: Walk to the forest.");
				System.out.println("B: Walk to the beach.");
			}
		}
}
