import java.security.PublicKey;

public interface Assaultable {
	public abstract void attack();
}

public interface Mobile {
	public abstract void move();
}

public abstract class Weapon implements Assaultable, Mobile {
	public void attack() {
		System.out.println("可攻击");
	}

	public void Mobile() {
		System.out.println("可移动");
	}
}

public class Tank extends Weapon {
	public void attack() {
		System.out.println("坦克攻击目标");
	}

	public void move() {
		System.out.println("坦克移动");
	}
}

class Flighter extends Weapon {
	public void attack() {
		System.out.println("飞机攻击目标");
	}

	public void move() {
		System.out.println("飞机移动");
	}
}

class WarShip extends Weapon {
	public void attack() {
		System.out.println("战舰攻击目标");
	}

	public void move() {
		System.out.println("战舰移动");
	}
}

class Army {

	private Weapon[] w = null;
	private int i = 0;

	public Army(int i) {
		w = new Weapon[i];
	}

	public void addWeapon(Weapon we) {
		if (i >= w.length) {
			System.out.println("武器量足够");
			return;
		} else {
			w[i] = we;
			i++;
		}
	}

	public void attackAll() {
		for (Weapon we : w) {
			if (we != null) {
				we.attack();
			}
		}
	}

	public void moveAll() {
		for (Weapon we : w) {
			if (we != null) {
				we.move();
			}
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		Army a = new Army(3);
		a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new WarShip());
		// a.addWeapon(new Tank());
		a.attackAll();
		a.moveAll();
	}

}
