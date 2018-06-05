package Character;

public class Other {
	public static void sleep(Character x) {
		System.out.println("You go to sleep. You wake up feeling healthier but a little hungry and thirsty. ");
		x.health += 10;
		x.hunger -= 8;
		x.thirst -= 8;
		x.toString();
	}
	public static void action(Character x) {
		x.hunger -= 4;
		x.thirst -= 4;
	}
}

