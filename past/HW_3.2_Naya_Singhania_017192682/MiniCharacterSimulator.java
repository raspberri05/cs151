import java.util.*;

interface WeaponBehavior { 
	// xxx your codes
	public String useWeapon();
}

class   AxeBehavior implements WeaponBehavior { 
	// xxx your codes
	public String useWeapon() {
		return "chopping with an axe.";
	}
}

class SwordBehavior implements WeaponBehavior { 
	// xxx your codes
	public String useWeapon() {
		return "swinging a sword.";
	}
}

class KnifeBehavior implements WeaponBehavior { 
	// xxx your codes
	public String useWeapon() {
		return "cutting with a knife.";
	}
}

class BowAndArrowBehavior implements WeaponBehavior { 
	// xxx your codes
	public String useWeapon() {
		return "shooting with a bow and an arrow.";
	}
}

abstract class Character {
	// xxx your codes
	WeaponBehavior weaponBehavior = null;

	public Character() {
	}

	public void setWeapon(WeaponBehavior w) {
		weaponBehavior = w;
	}

	abstract void fight();

}
class King extends Character {
	// xxx your codes
	public void fight() {
		System.out.print("The King is ");
		System.out.println(weaponBehavior.useWeapon());
	}
}

class Knight extends Character {
	// xxx your codes
	public void fight() {
		System.out.print("The Knight is ");
		System.out.println(weaponBehavior.useWeapon());
	}
}

class Queen extends Character {
	// xxx your codes
	public void fight() {
		System.out.print("The Queen is ");
		System.out.println(weaponBehavior.useWeapon());
	}
}

class Troll extends Character {
	// xxx your codes
	public void fight() {
		System.out.print("The Troll is ");
		System.out.println(weaponBehavior.useWeapon());
	}
}

public class MiniCharacterSimulator {
	public static void main(String[] args) {
        SwordBehavior sword = new SwordBehavior();
        BowAndArrowBehavior bowArrow = new BowAndArrowBehavior();
        KnifeBehavior knife = new KnifeBehavior();
        AxeBehavior axe = new AxeBehavior();
		WeaponBehavior stone = () -> "throwing a stone." ;
		
		List <WeaponBehavior> weapons = List.of(sword,bowArrow, knife, axe, stone);

		King   king   = new King   ();
		Queen  queen  = new Queen  ();
		Knight knight = new Knight ();
		Troll  troll  = new Troll  ();
		List <Character> characters = List.of(king, queen,knight, troll);

		System.out.println();
		for (Character c: characters ) {
			for (WeaponBehavior w: weapons ) {
				c.setWeapon (w);
				c.fight ();
			}
			System.out.println();
		}
	}
}
