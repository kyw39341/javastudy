package com.naver;

public class Test4 {
	
	private int a ;
	private int b;
	
	//����Ʈ ������
	public Test4() {
		a = 34;
		b = 55;
		
		
	}
	
	public void cond1() {
		//���� c�� 
		//a�� b���� ũ�ų� ������ 'a'
		// �׷��� ������ 'z'�� 
		// ���´�.
		// ���� c�� �����Ͻÿ�.
		
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
	} // me1() : me2() �� ��ȯ���� ������ �ȉ�.
	
	
	public void me2() {
		System.out.println(44);
	}
	
	public int me1() {
		return 3;
	}
	
	
	

}
