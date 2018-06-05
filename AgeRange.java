package Character;

public class AgeRange {
	protected int age;
	protected int health;
	protected int thirst;
	protected int hunger;
	protected int turns;
	protected int sleep;

	public AgeRange() {
		if (age < 12)
			System.out.println("Too Young, try again.");
		if (age >= 12 && age <= 18) {
			health = 100;
			thirst = 50;
			hunger = 50;
			turns = 15;
			sleep = 75;
		}
		else if (age >= 19 && age <= 25) {
			health = 80;
			thirst = 65;
			hunger = 65;
			turns = 13;
			sleep = 60;
		}
		else if (age >= 26 && age <= 40) {
			health = 60;
			thirst = 80;
			hunger = 80;
			turns = 10;
			sleep = 50;
		}
		else if (age >= 41 && age <= 65) {
			health = 50;
			thirst = 100;
			hunger = 100;
			turns = 13;
			sleep = 40;
		}
		else if (age >= 66 && age <= 80) {
			health = 25;
			thirst = 175;
			hunger = 175;
			turns = 10;
			sleep = 175;
		} else
			System.out.println("Too old, try again");
	}
}
