public class Person {

	/**
	 * @param args
	 */
	String name;
	int age;
	String address;

	void introduce() {
		System.out.println("��Һ�,����" + name + "����" + age + "����" + address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "����";
		p.age = 20;
		p.address = "USA";
		p.introduce();

	}
}
