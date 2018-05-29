package Character;

public class Character {
	protected String name;
	protected int age;
	protected static int health;
	protected static int thirst;
	protected static int hunger;
	protected static int turns;
	protected static int sleep;

	public static void AgeRange(int age) {
		if (age < 12)
			System.out.println("Too Young, try again.");
		if (age >= 12 && age <= 18) {
			health = 100;
			thirst = 50;
			hunger = 50;
			turns = 15;
			sleep = 75;
		}
		if (age >= 19 && age <= 25) {
			health = 80;
			thirst = 65;
			hunger = 65;
			turns = 13;
			sleep = 60;
		}
		if (age >= 26 && age <= 40) {
			health = 60;
			thirst = 80;
			hunger = 80;
			turns = 10;
			sleep = 50;
		}
		if (age >= 41 && age <= 65) {
			health = 50;
			thirst = 100;
			hunger = 100;
			turns = 13;
			sleep = 40;
		}
		if (age >= 66 && age <= 80) {
			health = 25;
			thirst = 175;
			hunger = 175;
			turns = 10;
			sleep = 175;
		} else
			System.out.println("Too old, try again");
	}

	public Character() {
		name = "Gym E. Jahns";
		age = 21;
		health = this.health;
		thirst = this.thirst;
		hunger = this.hunger;
		turns = this.turns;
		sleep = this.sleep;
	}

	public Character(String name, int age) {
		name = this.name;
		age = this.age;
		health = this.health;
		thirst = this.thirst;
		hunger = this.hunger;
		turns = this.turns;
		sleep = this.sleep;
	}

	public String toString() {
		return "name = " + name + ", age = " + age + ", health = " + health + ",thirst = " + thirst + ",hunger = " + ",turns =  " + turns;
	}
}
