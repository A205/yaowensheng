public class Person {

	/**
	 * @param args
	 */
	String name;
	int age;
	String address;

	void introduce() {
		System.out.println("大家好,我是" + name + "今年" + age + "来自" + address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "张三";
		p.age = 20;
		p.address = "USA";
		p.introduce();

	}
}
