package com.tim.ying.jvm.classloader;

/**
 * @author yingbibo
 * on 2019-03-21
 * email: yingbibo@canzhaoxi.com.cn
 *
 * 静态方法没有多肽一说
 */
public class Test3 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		System.out.println("------------");
		c.doSomething();
		c.doSomething1();

		System.out.println("----------------");
		Parent3 p = new Child3();
		p.doSomething();
		p.doSomething1();
	}
}

class Parent3{

	int a = 1;
	static {
		System.out.println("parent3 init");
	}
	public static void doSomething(){
		System.out.println("parent do something");
	}

	public void doSomething1(){
		System.out.println("parent do something1");
	}
}

class Child3 extends Parent3{
	int b = 2;
	static {
		System.out.println("child3 init");
	}
	public static void doSomething(){
		System.out.println("child do something");
	}

	public void doSomething1(){
		System.out.println("child do something1");
	}
}
