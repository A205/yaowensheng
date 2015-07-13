import java.security.PublicKey;

public interface Assaultable {
	public abstract void attack();
}

public interface Mobile {
	public abstract void move();
}

public abstract class Weapon implements Assaultable, Mobile {
	public void attack() {
		System.out.println("�ɹ���");
	}

	public void Mobile() {
		System.out.println("���ƶ�");
	}
}

public class Tank extends Weapon {
	public void attack() {
		System.out.println("̹�˹���Ŀ��");
	}

	public void move() {
		System.out.println("̹���ƶ�");
	}
}

class Flighter extends Weapon {
	public void attack() {
		System.out.println("�ɻ�����Ŀ��");
	}

	public void move() {
		System.out.println("�ɻ��ƶ�");
	}
}

class WarShip extends Weapon {
	public void attack() {
		System.out.println("ս������Ŀ��");
	}

	public void move() {
		System.out.println("ս���ƶ�");
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
			System.out.println("�������㹻");
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
