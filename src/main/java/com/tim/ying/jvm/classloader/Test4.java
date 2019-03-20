package com.tim.ying.jvm.classloader;

/**
 * @author yingbibo
 * on 2019-03-21
 * email: yingbibo@canzhaoxi.com.cn
 * 类初始化验证
 * 主动引用\被动引用
 * 结果：
 *   ------------------
 *   parent4 init
 *   1
 *   -------------------
 *
 */
public class Test4 {

	public static void main(String[] args) {
		System.out.println(Child4.a);
		//System.out.println(Child4.b);
	}
}

class Parent4{
	public static int a = 1;
	static {
		System.out.println("parent4 init");
	}
}

class Child4 extends Parent4{
	public static int b = 2;
	static {
		System.out.println("child4 init");
	}

}
