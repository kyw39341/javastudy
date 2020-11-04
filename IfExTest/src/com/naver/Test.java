package com.naver;

public class Test {
	
	public void me1() {
		int a = 10;
		
		if(a % 5 == 0) {
			System.out.println(5);
		}
	}
	
	public void me2(int a) {
		
		if(a % 4 == 0 && a % 12 == 0) {
			System.out.println(12);
		}
			
		
	}
	
	public void me3(int a) {
		if(a != 4) {
			System.out.println(true);
		}
		
		
	}
	
	
	public String me4(int a) {
		if (a >= 10) {
			return "ok";
		}else {
			return"no";
		}
		
		
	}
	
	public void me5(int x) {
		if (x > 0) {
			System.out.println(5);
		}else {
			System.out.println(10);
		}
		
	}
	
	public void me6(int a) {
		if (a % 2 == 0) {
			System.out.println(2);
		}else if(a % 3 == 0){
			System.out.println(3);
		}else if(a % 5 == 0) {
			System.out.println(5);
		}else {
			System.out.println(0);
		}
		
	}
	
	public char me7(int score) {
		
		if(score >= 90) {
			return '우';
		}else if(score >= 80) {
			return '수';
		}else if(score >= 70) {
			return '미';
		}else if(score >= 60) {
			return '양';
		}else{
			return '가';
		}
	}
	
	 

}
