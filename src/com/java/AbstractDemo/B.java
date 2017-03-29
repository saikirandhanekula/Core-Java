package com.java.AbstractDemo;

class B {
	static int s =10;
		protected int method1(){
			int a=10;
			s=20;
			return a;
		}
	void method2(){
			int b=20;
			s=20;
			method1();
	System.out.println(b);
		}
	}