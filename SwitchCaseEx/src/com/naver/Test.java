package com.naver;

public class Test {
	
	private int sum = 0;
	
	public void me9(int a) {
		sum = sum + a;
		// sum += a;
	
	
	
	}
	
	public void tt() {
		System.out.println("hello world");
		System.out.println("�ȳ��ϼ���.");
		System.out.println("gooten");
		
	}
	
	public void func3() {
		tt();
		sum -= 3;
		
	}
	
	public void func2() {
		tt();
	    sum *= 3;
	    
	}
	public void func1() {
		System.out.println("� ������.");
		sum += 3;
		System.out.println(sum);
		
	
	}
	public void me8(String a, String b) {
		// a ������ b�� ���� �ְ�
		// b �������� a�� ���� �������� �մϴ�.
		// ġȯ �˰���.
		
		String c = a;
		a = b;
		b = c;
		
		}
		
	}
	
	
	public void me6(int month) {
		//�޷�
		//1,3,5,7,8,10,12 ( 31�� )
		// sysout("31�ϱ��� �ֽ��ϴ�.)
		// 2 : 28
		// sysout("28�ϱ��� �ֽ��ϴ�.)
		// �������� ( 30�� )
		// sysout("30�ϱ��� �ֽ��ϴ�.)
		
		
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
			
		case 2:
			System.out.println("28�ϱ��� �ֽ��ϴ�");
			break;
		
		default: // ������
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		}
}
	
	
    public void me7(int score) {
    	switch (score/10) {
    	
    	case 10:
		case 9:
			System.out.println('��');
			break;
		case 8:
			System.out.println('��');
			break;
		case 7:
			System.out.println('��');
			break;
		case 6:
			System.out.println('��');
			break;
        default:
        	System.out.println('��');
			break;
		}
    	
    	
    	
    	
    	
    }
	
	
	
	
	
	
	
	
	/*	public void me5(Long a) {
		switch (a) {  //��Ÿ���� �ȵ�./
		case 10L:
			
			break;

		default:
			break;
		}
	} */
	
	
	
	
	
	
	public void me4(int a) {
		switch (a) {
		
		//int a = 10 ( ����ġ�� case ���̿��� ���� ���� �ȉ� )
		
		case 1:
			
			break;

		default:
			break;
		}
		
	}
	
	
	
	
	public void me31(int a) {
		int data = a/10; // ���� ������ swith�� ���԰���
		
		switch (data) {
		case 1:
			
			break;

		default:
			break;
		}
	}
	
	
	public void me3(int a) {
		switch (a/10) { //swith�� ������� ���� ������ ����. 
		case 1:
			System.out.println("10~19");
			break;
			
		case 2:
			System.out.println("20~29");
			break;

		default:
			System.out.println("end");
			break;
		}
		
		
	}
	
	public void me2(int a) {
		switch (a) {
		case 3:
			System.out.println(333);
			
			break;
			
		case 4:
			System.out.println(444);
			

		default:
			System.out.println(999);
			break;
		}
		
	}
	
	
	
	
	
	
	
	public void me1(int a) {
		
		switch (a) {
		case 3:
			System.out.println(3333);
			System.out.println(1111);
			break;
			
		case 4:
			System.out.println(4444);
			System.out.println("end");
			break;

		default: // else�� �Ȱ���
			System.out.println("fine");
			break;
		}
		
	}

}
