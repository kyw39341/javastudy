package com.naver;

public class Test {
	
	public boolean me1(int a, int b) {
	    return a > b;
		
	}
	
	public boolean me2(long a, long b) {
		return a >= b;
		
	}
	
	public String me3(float a, float b) {
		boolean result =  a < b;
		// a = 3.0, b =9.0 result = true;
		// a = 9.0, b =3.0 result = false;
		
		if(result) {
		   return"OK";
		}else {
			return"NO";
		}
	
	}
	
	
	public char me31(int a, int b) {
		boolean a1 = a > b;
		
		if(a1) {
			return 'a';
		}else {
			return 'z';
		}
		
	}
	
	public boolean me4(byte a, byte b) {
		return a <= b;
		
	}
	
	public void me5(short a, short b) {
		System.out.println(a == b);
		
		
	}
	
	
	
	public boolean me50(short a, short b) {
		return a == b;
		
	}
	
	public void me51(boolean a, boolean b) {
		boolean result = a == b;
		System.out.println(result);
		
	}
	
	public void me6(boolean a, boolean b) {
		boolean result = a != b;
		System.out.println(result);
		
	}
	
	
	
}
