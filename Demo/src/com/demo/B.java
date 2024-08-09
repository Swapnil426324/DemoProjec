package com.demo;

class A{
	
	void m1() {
		System.out.println("method Of A1");
	}
}
public class B {

	void m1() {
		System.out.println("method Of B1");
	}

	public static void main(String[] args) {
		
		B b=new B();
		b.m1();

	}
}
