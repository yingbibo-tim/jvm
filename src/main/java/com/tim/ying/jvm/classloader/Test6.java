package com.tim.ying.jvm.classloader;

/**
 * @author yingbibo
 * on 2019-03-18
 * email: yingbibo@canzhaoxi.com.cn
 */
public class Test6 {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println("count1 == "+Singleton.counter1);
		System.out.println("count2 == "+Singleton.counter2);

		System.out.println(" =================================== ");
		Singleton1 singleton1 = new Singleton1();
		System.out.println("count1 == " + singleton1.counter1);
		System.out.println("count2 == " + singleton1.counter2);

	}

}

class Singleton{
	public static int counter1;
	public static int counter2 = 0;  //@1

	private static Singleton singleton = new Singleton();

	private Singleton(){
		counter1++;
		counter2++;
	}

	//@1 	public static int counter2 = 0;

	public static Singleton getInstance(){
		return singleton;
	}
}

class Singleton1{
	public int counter1;


	public Singleton1(){
		counter1++;
		counter2++;
	}
	public int counter2 = 0;

}
