import java.util.concurrent.Callable;

public class Shouji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ʵ����һ���ֻ�
		Phone p = new Phone();
		p.name = "note";
		p.brand = "���׻�";
		p.price = 99;
		System.out.println(p.name);
		System.out.println(p.brand);
		System.out.println(p.price);
       p.call();
       p.sendMsg();
	}

}

class Phone {
	//����
	String name;
	String brand;
	int price;

	// ��Ϊ
	void call() {
		System.out.println("��绰��������");
	}

	void sendMsg() {
		System.out.println("�����š�������");
	}
}