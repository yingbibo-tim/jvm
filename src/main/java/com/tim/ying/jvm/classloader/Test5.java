package com.tim.ying.jvm.classloader;

/**
 * @author yingbibo
 * on 2019-03-18
 * email: yingbibo@canzhaoxi.com.cn
 */


import java.util.Random;

/**
 * 接口的常量定义都是 public static final xxx xx
 * 当一个接口初始化的时候，并不要求其父接口都完成初始化
 * 只有真正使用到副接口的时候（如引用接口中定义的常量时），才会初始化
 */

public class Test5 {
	public static void main(String[] args) {
		System.out.println(Child5.a);
	}
}

interface Parent5{
	//@1 @2
	int a = 1;

	//@3
	//int a = new Random().nextInt(10);
}

interface Child5 extends Parent5{
	 //@1
	//int b = 2;

	//@2 @3
	 int b = new Random().nextInt(10);  //运行期才能决定
}
