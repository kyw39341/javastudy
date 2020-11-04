package com.naver;

public class Test4 {
	
	private int a ;
	private int b;
	
	//디폴트 생성자
	public Test4() {
		a = 34;
		b = 55;
		
		
	}
	
	public void cond1() {
		//변수 c는 
		//a가 b보다 크거나 같으면 'a'
		// 그렇지 않으면 'z'를 
		// 갖는다.
		// 변수 c를 선언하시오.
		
		char c = a>=b? 'a' : 'z';
		
		
		
	}
	
	public void cond10() {
		String c = a <= b? new String("hello") : new String("no");
		System.out.println(c);
		
		
		
	}
	
	public void cond2() {
		
		String c = a!=b? new String("hello") : new String("no");
		System.out.println(c);
		
	}
	
	public void cond3() {
		StringBuffer c = a<=b? new StringBuffer("hello") : new StringBuffer("no");
	}
	
	public void cond5(int score) {
		char c = score >= 90? 'A' 
				: score >=80? 'B' 
						: score >=70? 'C'
								: score >=60? 'D'
										:'F';
								System.out.println(c);
								
								
	}
	
	
	
	public void cond4() {
		int c = a > b*2? me1() : a;
	} // me1() : me2() 는 반환형이 없으니 안됌.
	
	
	public void me2() {
		System.out.println(44);
	}
	
	public int me1() {
		return 3;
	}
	
	
	

}
