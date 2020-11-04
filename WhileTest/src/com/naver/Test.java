package com.naver;

public class Test {
	
	public void me1() {
		int i = 0;
		
		while (i<=101) {
			System.out.println(i);
			i++;
			
		}
	}
	
	
	public void me2() {
		int i = 100;
		while (i>=0) {
			System.out.println(i);
			i--;
		}
	}
	
	public void me3() {
		int i = 0;
		while (i<=100) {
			System.out.println(i);
			i = i + 2;
			
		}
	}
	
	public void me4() {
		int i = 100;
		while (i>=0) {
			System.out.println(i);
			i = i - 2;
		}
	}
	
	
	public void dan(int dan) {
		int i = 1;
		
		while(i<10) {
			System.out.println(i+"X"+dan+"="+(dan*i));
			i = i+1;
			
			
		}
	}
	
	public void me10() {
	   System.out.println("시작");
	
		int i =0;
		while ( i <= 5) {
			i ++ ;
		if (i==3) {
			break;
		}
		System.out.println(i);
		
	}
		System.out.println("끝");
	
	}
	
	public void me11(int n) {
		System.out.println("시작");
		int i = 0;
		while(i<=6) {
		System.out.println('*');
		i++;
		if(i==3) {
			continue;
			
		}
		System.out.println(i);
	}
		System.out.println("끝");
	}
}



