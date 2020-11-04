package com.naver;

public class Test {
	
	
	public void me11() {
		int j = 100;
		
		while(j>=0) {
			System.out.println(j);
			j--;
		}
				
	 // 1.2.3.4.5.6.....100
		
	}
	
	public void me1() {
		int i = 0;
		
		while(i<101) {
			System.out.println(i);
			i++;
		}
		
	}
	
	// 1.2.3.4.5.6.7.... 101
	
	public void me100() {
		int i = 100;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
	}
	
	// 100.99.98.97....0
	
	public void me2() {
		int i = 0;
		
		while (i<47) {
			System.out.println(i);
			
			i = i + 2;
			}
	}
	
	// 0 2 4 6 8 10.... 46
	
	
	public void me21() {
		// 99, 97 , 95, 93, 91, 89
		int i = 99;
		
		while (i>0) {
			System.out.println(i);
			i = i -2;
		}
	}
	
	
	public void dan(int dan) {
		// 3 x 1 = 3
		// 3 x 2 = 6
		int i = 1;
		
		while (i<10) {
			StringBuffer sb = new StringBuffer();
			sb.append(dan);
			sb.append("X");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
			String msg = sb.toString();
			System.out.println(sb.toString());
			System.out.println(msg);
			
			// System.out.println(dan + "x" + i + "=" + (dan*i));
			
			i++;
			
			
		}
		
		
	}
	
	public void dan1(int dan) {
		int i = 1;
		while(i<10) {
			System.out.println(dan+"x"+i+"="+(dan*1));
			i++;
		}
	}
	
	
	public void me3() {
		// ************
		// while문 이용 print() vs println( )
		
		int i = 0;
		
		while(i<10) {
			System.out.print('*');
				i++;
		}
		System.out.println();
		
		
	}
	
	public void me4(int n) {
		int i = 0;
		
		while(i < n) {
			System.out.print('*');
			
			i++;
			break;
		}
		
	}
	
	public void gugudan() {
		int i = 2;
		while (i < 10) {
			System.out.println(i+"단:::::");
			dan(i);
			i++;
			// 같은 패키지 다른 메소드 호출 
			// dan(i);
		}
	
	}
	
	
	public void printstar(int n) {
		// *
		// **
		// *** ....
		
		int i = 0;
		while (i<n) {
	     me4(i+1);
	     i++;
		}
		
		
	}
	
	public void printpibo(int n) {
		//1,1,2,3,5,8,13....
		// 값 = 전전값 + 전값;
		// 전값 -> 전전값
		
		int a = 1;
		int b = 1;
		
			for (int i = 0; i < n; i++) {
				int c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
				
			}
	
	public void me4() {
		int i = 0;
		while(i<10) {
			if (i !=0 && i % 5 == 0) {
				break;
				
			}
			System.out.println(i);
			i++;
			
		}
		System.out.println("me4() 끝");
	}
	
	
	public void me5() {
		int i = 0;
		while (i<10) {
			if(i != 0 && i % 5 == 0) {
				i++;
				continue;
			}
			
			System.out.println(i);
			i++;
			
		}
		System.out.println("me9() 끝");
	}
	
	
	public static void me1() {
		
		
	}
		
	}
	
	

