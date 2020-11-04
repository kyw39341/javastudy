package com.naver;

public class Test {
	
	
	
	public void printStar(int n) {
		for (int i = 0; i < n; i++) {
			me5(i+1);
		}
		
	}
	
	
	
	
	
	public void me6() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
			
		}
		
		
		
	
	}
	
	
	public void gugudan() {
		for (int i = 2; i < 10; i++) {
			System.out.println("단>>>>>>>>");
			dan(i);
		}
	
		
	}
	
	
	public void me5(int n) {
		for (int j = 0; j < n; j++) {
			System.out.print('*');
		}
		}
		
	
	
	public void me1() {
		for(int i = 0; i < 10; i++ ){
		System.out.println("Hello world");
		}
		
		
	}
	
	public void me2() {
		// 0
		// 1
		// 2
		// ..
		// 100까지 출력하고 싶다.
		
		for(int j = 0; j <=100; j++) {
			System.out.println(j);
			
		}
		}
	
	public void me3() {
		// 0 2 4 6 8 10 .... 51개의 숫자를 찍어내라.
		for(int i =0; i < 51; i++ ) {
			int a = i * 2;
			System.out.println(a);
		}
		
		
	}
	
	
	public void me4(int n) {
		// 1 3 5 7 9 11 .... 51개의 숫자를 찍어내라
		for(int i = 0; i < n; i++ ) {
			int a = i*2+1;
			System.out.println(a);
		}
			
	}
	
	public void dan(int dan) {
		for (int i=1; i<10; i++) {
			System.out.println(dan+"X"+i+"="+dan*i);
		}
	}
	
	
	public void dan1(int dan) {
		for(int i = 3; i< 10; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
		
	}


	
	public void issossu(int num) {
		// num이 소수면 sysout("소수입니다");
		// num이 소수가 아니면, sysout("소수가 아닙니다.");
		for (int i = 2; i < num+1; i++) {
			if(num % 1 == 0) {
				// 1. i가 num의 약수이지만 num은 아닌 상황
				// 2. i == num 
			if(i ==num) {
				System.out.println("소수");
				}else {
					System.out.println("소수가 아님");
					break;
				}
			
	
	
	
	
	
			}
			}
		
		
	
		
	}
	
	
	public void me7(int num) {
		for (int i = 0; i < 10; i++) {
			if(num % 3 == 0) {
				System.out.println("3의 배수가 검출되었습니다. 가장 가까운 반복은 중단합니다.");
				break;
			}
			
		}
		
	}
	
	public void me71() {
		for (int i = 10; i >= 0; i--) {
			System.out.println("외부 for문 시작");
			for (int j = 100; j < 105; j++) {
				if (i%2==0) {
					break;
				}
				System.out.println(i+":"+j);
			}
			
			System.out.println("외부 for문 종료");
		}
	}
	
	
	public void me8() {
		for (int i = 0; i < 10; i++) {
			if(i%5==0) {
				continue;
			}
			
		}
	}
}

