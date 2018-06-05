package Character;

import Character.Introduction;

public class Character {
	protected static String name;
	protected int age;
	protected static int health;
	protected static int thirst;
	protected static int hunger;

	public static void AgeRange() {
		int age = Introduction.resultTemp;
		if (age >= 12 && age <= 18) {
			health = 100;
			thirst = 50;
			hunger = 50;
		}
		else if (age >= 19 && age <= 25) {
			health = 80;
			thirst = 65;
			hunger = 65;
		}
		else if (age >= 26 && age <= 40) {
			health = 60;
			thirst = 80;
			hunger = 80;
		}
		else if (age >= 41 && age <= 65) {
			health = 50;
			thirst = 100;
			hunger = 100;
		}
		else if (age >= 66 && age <= 80) {
			health = 25;
			thirst = 175;
			hunger = 175;
		}
	}

	public Character() {
		name = "Gym E. Jahns";
		age = 21;
		health = this.health;
		thirst = this.thirst;
		hunger = this.hunger;
	}

	public Character(String name, int age) {
		name = this.name;
		age = this.age;
		health = this.health;
		thirst = this.thirst;
		hunger = this.hunger;
	}

	public String toString() {
		return "name = " + name + ", age = " + age + ", health = " + health + ",thirst = " + thirst + ",hunger = " + hunger;
	}
}
