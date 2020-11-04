package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;
import com.naver.Test5;

public class MainEx {
	
	public static void main(String[] args) {
		
		Test t1 = new Test(); //객체생성
		boolean result =t1.me1(3, 4); // 메소드 호출
		System.out.println(result); 
		
		String a =t1.me3(4230, 1230);
		System.out.println(a);
		
		
		byte e = 120;
		byte f = 100;
		
		boolean a3 =t1.me4(e, f);
		System.out.println(a3);
		
		// 변수 선언을 해서 호출
		
		t1.me4((byte)3, (byte)-5);
		
		// 형변환해서 호출
		// 아무말 없으면 정수형은 기본형인 인트로 드감
		
		
		boolean a4 =t1.me50((short)23,(short)25);
		System.out.println(a4);
		
		t1.me5((short)1, (short)2);
		System.out.println();
		
		t1.me51(true, false);
		System.out.println(result);
		
		
		System.out.println("::::::::::::::::::::::::");
		
		t1.me6(true, true);
		
		//test2
	    System.out.println("::::::::::::::::");
		
	    
	    Test2 t2 = new Test2();
	    
	    t2.k1(true, true);
	    t2.k1(true, false);
	    t2.k1(false, true);
	    t2.k1(false, false);
	    
	    System.out.println(">>>>>>>>>>oror");
	    t2.k2(true, true);
	    t2.k2(true, false);
	    t2.k2(false, true);
	    t2.k2(false, false);
	    
	    System.out.println("::::::::::::::::::");
	    
	    
	    System.out.println(">>>>>>>>>>>>>>>>>>>");
	    t2.k3(true);
	    
	    boolean g = false;
	    t2.k3(g);
	    
	    t2.swithInt();
	    t2.swithInt();
	    t2.swithInt();
	    t2.swithInt();
	    
	    System.out.println("#####################");
	    
	    Test3 t3 = new Test3();
	    
	    t3.plus1();
	    
	    t3.plus11();
	    
	    System.out.println("#######################");
	    
	    t3.plus2();
	    
	    System.out.println("#######################");
	    
	    t3.plus21();
	    
	    t3.minus1();
	    
	    Test4 t4 = new Test4();
	    
	    t4.cond5(90);
	    
	    t4.cond2();
	    
	    System.out.println("#######################");
	    
	    t4.cond10();
	    
	    System.out.println("#######################");
	    
	    
	    
	    System.out.println("####################");
	    
	    t1.me3(4, 5);
	    System.out.println(result);
	    
	    
	    Test5 t5 = new Test5();
	    t5.h1();
	    t5.h2();
	    t5.h3();
	    t5.h4();
	    t5.h5(0);
	    t5.h5(1);
	    t5.h5(2);
	    t5.h5(3);
	    System.out.println("#############");
	    
	    t5.h6(0);
	    t5.h6(1);
	    t5.h6(2);
	    t5.h6(3);
	    t5.h6(4);
	    t5.h6(5);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
	}
	
	
	

}
