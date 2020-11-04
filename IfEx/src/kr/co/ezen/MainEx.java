package kr.co.ezen;

import com.naver.Person;
import com.naver.TV;
import com.naver.Test;

public class MainEx {
	
	public static void main(String[] args) {
		Test t1 = new Test();
		
		
		t1.me1();
		t1.me2(90);
		t1.me3(43);
		t1.me4(3);
		
		System.out.println("###################");
		
		t1.me6(6);
		
		char c =t1.me7(95);
		System.out.println(c);
		
		
		TV tv1 = new TV(10, 15, false);
		
		tv1.powerOn();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.powerOff();
		tv1.volUp();
		System.out.println(tv1.getVol());
		
		t1.me7(80);
		
		Person kim =  new Person(tv1);
		//kim이 tv를 켠다.
		kim.tvOn();
		// tv를 끕니다.
		kim.tvOff();
		
		// kim의 채널을 +1 시키시오
		kim.tvOn();
		TV tv = kim.getTv1();
		tv.chUp();
		System.out.println(tv.getCh());
		
		//kim의 tv 볼륨을 -1 시키시오.
		
		System.out.println("$$$$$$$$$$$$$$$$$$$");
		
		kim.getTv1();
		tv.volDown();
		System.out.println(tv.getVol());
		
		// kim의 tv 볼륨을 50으로 설정하시오.
		
		kim.getTv1().setVol(50);
		// 한방에 50으로 설정.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
