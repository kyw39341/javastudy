package com.naver;

public class Test3 {
	
	private int a;
	private int b;
	
	
	public Test3() {
		a = 0;
		b = 0;
		
	}
	public void plus1() {
		System.out.println(a);
		++a;
		System.out.println(a);
		
	}
	
	public void plus11() {
		System.out.println(++a);
	}
	
	public void plus2() {
		System.out.println(b);
		b++;
		System.out.println(b);
	}
	
	public void plus21() {
		System.out.println(b++);
	}
	public void minus1() {
		System.out.println(--a);
	}
	
	public void me1() {
		int a = 3;
		int b = 5;
		int c = a==b? 44 : 33;
	}
	
	

}
