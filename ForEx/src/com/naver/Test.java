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
			System.out.println("��>>>>>>>>");
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
		// 100���� ����ϰ� �ʹ�.
		
		for(int j = 0; j <=100; j++) {
			System.out.println(j);
			
		}
		}
	
	public void me3() {
		// 0 2 4 6 8 10 .... 51���� ���ڸ� ����.
		for(int i =0; i < 51; i++ ) {
			int a = i * 2;
			System.out.println(a);
		}
		
		
	}
	
	
	public void me4(int n) {
		// 1 3 5 7 9 11 .... 51���� ���ڸ� ����
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
		// num�� �Ҽ��� sysout("�Ҽ��Դϴ�");
		// num�� �Ҽ��� �ƴϸ�, sysout("�Ҽ��� �ƴմϴ�.");
		for (int i = 2; i < num+1; i++) {
			if(num % 1 == 0) {
				// 1. i�� num�� ��������� num�� �ƴ� ��Ȳ
				// 2. i == num 
			if(i ==num) {
				System.out.println("�Ҽ�");
				}else {
					System.out.println("�Ҽ��� �ƴ�");
					break;
				}
			
	
	
	
	
	
			}
			}
		
		
	
		
	}
	
	
	public void me7(int num) {
		for (int i = 0; i < 10; i++) {
			if(num % 3 == 0) {
				System.out.println("3�� ����� ����Ǿ����ϴ�. ���� ����� �ݺ��� �ߴ��մϴ�.");
				break;
			}
			
		}
		
	}
	
	public void me71() {
		for (int i = 10; i >= 0; i--) {
			System.out.println("�ܺ� for�� ����");
			for (int j = 100; j < 105; j++) {
				if (i%2==0) {
					break;
				}
				System.out.println(i+":"+j);
			}
			
			System.out.println("�ܺ� for�� ����");
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

