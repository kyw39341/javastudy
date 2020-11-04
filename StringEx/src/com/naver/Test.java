package com.naver;

public class Test {
	
	public void me1() {
		// 명시적 객체 생성법
		String msg = new String("hello");
	}
	
	public void me2() {
		// 암시적 객체 생성법
		String msg2 = "hello";
		
	}
	
	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";
		
		System.out.println(msg1==msg2); // false
		System.out.println(msg1==msg3); // false
		System.out.println(msg3==msg4); // true
		
		System.out.println(msg1.equals(msg2)); // true
		System.out.println(msg1.equals(msg3)); // true
		
		// String 클래스의 객체 생성 두가지 방법 학습
		// 1. 명시적 객체 생성법
		// 2. 암시적 객체 생성법
		// 두 방법이 메모리 측면에서 어떻게 다른지도 학습.
		// 데이터가 같을 경우, 같은 객체로 인식하게 하는 방법.
		// 참조자료형에서는 == 안씀.
		// 참조자료형에서 비교연산자는 equals를 사용함.
		// 동일성비교 VS 동등성 비교
		//    ==   VS  equals( )
		
		
	}
	
	public void me4() {
		StringBuffer sb = new StringBuffer();
		//String 클래스는 불변적 성격을 갖고 있음.
		
		String msg = "hello";
		msg = "good";
		
		//문자열이 계속해서 누적 되는 경우,
		// String 클래스를 사용하면
		// 성능 저하가 발생한다.
		// stringBuffer를 사용하세요.
		
		msg = " ";
		msg += "안녕하세요";
		msg += "저는 홍길동입니다.";
		msg += "저는 조선 세종대왕 시대에 살고있습니다.";
		
		sb.append("안녕하세요.");
		sb.append("저는 홍길동입니다.");
		sb.append("저는 조선 세종대왕 시대에 살고있습니다.");
		msg = sb.toString();
	}

}
