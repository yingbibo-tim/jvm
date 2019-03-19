package com.tim.ying.jvm.classloader;

/**
 * @author yingbibo
 * on 2019-03-20
 * email: yingbibo@canzhaoxi.com.cn
 * 初始化一个类的时候,并不会一定初始化
 */
public class Test7 {

	public static void main(String[] args) {
		System.out.println(Child7.b);
	}
}

interface Parent7{
	Thread t = new Thread(){
		{
			System.out.println("parent 初始化了么？");
		}
	};
}

interface Child7 extends Parent7{
	int b = 1;
}