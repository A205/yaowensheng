package day003;

import day03.*;

public class Demo2 {
	public void method2() {
		Demo1 a = new Demo1();//生成对象实例化；    Demo1为类名
		a.methodA1();
	}

	public static void main(String[] args) {
		Demo2 b = new Demo2();
		b.method2();
	}
}
