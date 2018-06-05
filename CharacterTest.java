package Character;

import Character.Character;
import Character.Introduction;
import Character.Ending;
import Character.Adventure;

public class CharacterTest {
	public static void main(String[] args) throws InterruptedException {
		Introduction.introduction();
		Character mainchar = new Character(Introduction.nameTemp,Introduction.resultTemp);
//		while (mainchar.health > 0 && mainchar.hunger > 0 && mainchar.thirst > 0) {
			Adventure.adventure(mainchar);
//			Ending.winEnding();
//			break;
//		}
//		Ending.loseEnding();
	}
}
