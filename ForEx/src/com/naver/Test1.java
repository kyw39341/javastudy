package com.naver;

public class Test1 {
	
	
	public void me1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello world");
			}
		
	}
	
	public void me2() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
			
			
		}
	}
	
	
	public void me3() {
		// 0 2 4 6 8 10 . . . . 51개의 숫자.
		for (int i = 0; i < 51; i++) {
			int a = i * 2;
			System.out.println(a);
			
		}
	}
	
	public void me4(int n) {
		for (int i = 0; i < n; i++) {
			int a = i*2+1;
			System.out.println(a);
			// 1 3 5 7 9 11 . . . . . 
		}
		
	}
	
	public void me6() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public void dan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+"x"+i+"="+(dan*i));
			
			
		}
	}
	
	public void gugudan() {
		for (int i = 2; i < 10; i++) {
			System.out.println("단>>>>>>>>");
			dan(i);
		}
	}

	
	
























}


