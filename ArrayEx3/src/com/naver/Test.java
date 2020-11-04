package com.naver;

public class Test {
	
	public void me11() {
		StringBuffer[] arrsb = new StringBuffer[100];
		System.out.println(arrsb);
		
		System.out.println(arrsb[50]);
		
		StringBuffer sb1 = new StringBuffer();
		arrsb[1] = sb1;
		
		System.out.println(arrsb.length);
		
		for (int i = 0; i < arrsb.length; i++) {
			System.out.println(arrsb[i]);
			
		}
	}
	
	public void me1() {
		int[] arrInt = new int[4];
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i]=i;
		}
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 2;
			
		}
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i*2+1;
		}
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 10;
			
		}
		
		
		
			
		}
	
	
	
	
	public void me12(Dog[] dogs) {
		
		System.out.println(dogs.length);
		int largestIdx = dogs.length -1;
		dogs[largestIdx] = null;
		
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
		
		for (int i = 0; i < dogs.length; i++) {
			Dog dog = dogs[i];
			
			if(dog != null) {
				String name = dog.getName();
				System.out.println(name);
			}
		}
	}
	
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		String[] arrData = data.split("#");
		
		System.out.println(arrData.length);
		
		int largestIdx = arrData.length-1;
		arrData[largestIdx] = "100";
		
		arrData[0] = "ezen";
		
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		
		for (int i = 0; i < arrData.length; i++) {
			String msg = arrData[i];
			char c = msg.charAt(0);
			System.out.println(c);
			
			// sysout(arrData[i].charAt
		}
	}
	
	
	public void me2() {
		
		int[] arrInt = {1,4,7};
		System.out.println(arrInt.length);
		
		System.out.println(arrInt[1]);
		
		
		
		
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}		

