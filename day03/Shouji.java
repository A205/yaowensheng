import java.util.concurrent.Callable;

public class Shouji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 实例化一个手机
		Phone p = new Phone();
		p.name = "note";
		p.brand = "爆米花";
		p.price = 99;
		System.out.println(p.name);
		System.out.println(p.brand);
		System.out.println(p.price);
       p.call();
       p.sendMsg();
	}

}

class Phone {
	//属性
	String name;
	String brand;
	int price;

	// 行为
	void call() {
		System.out.println("打电话。。。。");
	}

	void sendMsg() {
		System.out.println("发短信。。。。");
	}
}