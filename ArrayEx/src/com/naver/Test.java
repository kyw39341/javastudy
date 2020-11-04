package com.naver;

public class Test {
	
	public void me11() {
		// 배열의 크기가 100인 Stringbuffer형의 1차원 배열 arrsb를 생성하시고
		// arrsb의 배열 크기를 출력하시오.
		
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println(arrSb);
		
		//arr sb의 51번째 요소값을 출력.
		
		System.out.println(arrSb[50]);
		
		StringBuffer sb1 = new StringBuffer();
		// arrsb의 인덱스가 1번인 곳에 sb1 객체를 대입하라.
		arrSb[1] = sb1; 
		
		
		System.out.println("::::::::::::::::::::");
		System.out.println(arrSb.length);
		
		// 배열 생성 첫번째 방법
		
		
		// arrSb가 갖고 있는 모든 요소값을 출력을 함.
		// 단, 출력 순서는 인덱스가 큰 값부터 출력합니다.
		
		
		for (int i = arrSb.length-1; i >= 0; i--) {
			System.out.println(arrSb[i]);
		
			
	
			
		}
		
	}
	
	public void me1() {
		// 자료형[] 변수명 = new 자료형[배열의 크기];
		int[] arrInt = new int[4];
		// arrInt에 0,1,2,3 을 입력하시오.
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
			
		}
		
		//arrInt에 0,2,4,6.
		
	    for (int i = 0; i < arrInt.length; i++) {
	    	arrInt[i] = i*2;
			
		}
	    
	    // arrInt에 1,3,5,7을 입력하세요.
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	arrInt[i] = i*2+1;
			
		}
	    
	    //arrInt에 10,20,30,40,50을 입력하세요.
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	arrInt[i] = i*10;
			
		}
	    
	    
		
		
		
			
		}
		
		
		
		
	
	
	
	
	
	public void me12(Dog[] dogs) {
		//1. Test class의 me12()에서 파라미터로 넘어온 배열 데이터의 크기를 출력하시오.
		//2. main( ) 에 가서 me12( ) 를 호출하시오.
		
		System.out.println(dogs.length);
		
		// dogs의 가장 큰 인덱스 요소값을 null로 설정하시오.
		
		int largestIdx = dogs.length -1;
		dogs[largestIdx] = null;
		
		// dogs[dogs.lenght -1] = null;
		
		//1. dogs 배열에 있는 모든 요소값(dog 객체)를 출력하시오.
		
		
		
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
		
		//2. dogs 배열에 있는 모든 dog 객체의 이름을 출력하시오.
		
		for (int i = 0; i < dogs.length; i++) {
			Dog dog = dogs[i];
			
			if (dog != null) {
				String name =dog.getName();
			    System.out.println(name);
			
			//System.out.println(dogs[i],getname());
		}
	
		}
		
		
		
		
	}
	
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		String[] arrData =data.split("#");
		//1. data.split("#")의 반환값을 arrData로 받고
		// 2. arrData의 크기를 출력하시오.
		System.out.println(arrData.length);
		
		// arrData의 가장 큰 인덱스의 요솟값을 100으로 설정하시오.
		
		int largestIdx = arrData.length -1;
		arrData[largestIdx] = "100";
		
		// arrdata의 가장 작은 인덱스의 요솟값을 "ezen"으로 설정하시오.
		
		
		arrData[0] = "ezen";
		
		//arrData의 모든 요소값을 출력하시오.
		
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		
		//arrData의 모든 요소값의 첫글자를 출력하시오.
		
		for (int i = 0; i < arrData.length; i++) {
			String msg = arrData[i];
			char c = msg.charAt(0);
			System.out.println(c);
			
			// sysout(arrData[i].charAt(0));
		}
		
		
		
		
		
		
		
		}
	
	public void me2() {
		// 자료형[] 배열명 = {값1, 값2, 값3....};
		int[] arrInt = {1, 4, 6};
	    System.out.println(arrInt.length);
	    
	    // 배열 생성 두번째 방법
		
	    
	   // arrInt 배열의 2번째 요소값을 출력하시오.
	    System.out.println(arrInt[1]);
	    
	    // arrInt 배열의 인덱스가 1인 요솟값을 333 으로 수정하여라.
	    
	    arrInt[1] = 333;
	    
	    // 1. arrint가 갖고있는 모든 요소값 출력
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	System.out.println(arrInt[i]);
			
		}
	    
	    //2. arrint가 갖고있는 모든 요소값 출력하기. 단, 인덱스가 1인 요소값은 출력금지
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	
	    	if(i ==1) {
	    		continue;
	    	}
	    	
	    	System.out.println(arrInt[i]);
			
		}
	    
	    // 3. arrInt가 갖고있는 모든 요소값 출력하기. 단 요소값이 6이면 출력금지.
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	
	    	int num = arrInt[i];
	    	if(num != 6) {
	    	      System.out.println(num);	
	    	}
	    	
	    	
			
		}
	    
	}
	
	
	public void me21() {
		// 1. 자료형이 dog인 1차원 배열 arrDog를 생성하되, 그 크기는 
		// 배열생성 두번째 방법으로 생성하시오.
		// 2. arrDog의 배열 크기를 출력하시오.
		
		Dog[] arrDog = {new Dog(), new Dog()};
		System.out.println(arrDog.length);
		//Dog a = new Dog();
		//Dog b = new Dog();
		//arrDog = {a,b};
		
		// arrDog의 가장 큰 인덱의 요소값을 null로 수정하시오.
		
		int largestrIdx = arrDog.length -1;
		arrDog[largestrIdx] = null;
		
		// arrDog[arrDog.lenght-1] = null;
		
		// 1. arrDog의 모든 요소값을 출력하시오.
		
		for (int i = 0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}
		
		// 2. arrDog의 인덱스가 1인 요소값의 name을 출력하시오.
	    // 단, 해당 요소값이 null이 아닌 경우에만
		
		Dog dog = arrDog[1];
		if(dog != null) {
			System.out.println(dog.getName());
		}
		
		
		
	}
	
	public void me22(String [] arrStr) {
		// 1. arrStr의 크기를 출력하시오.
		// 2. main( )에서 me22 ( ) 호출하시오.
		
		System.out.println(arrStr.length);
		
		// arrStr의 index가 1인 곳의 값을 "12"로 변경하시오.
		
		arrStr[1] = "12";
		
		// arrStr의 index가 1인 곳의 값을 출력하시오.
		
		System.out.println(arrStr[1]);
		
		String s1 =arrStr[1];
		
		System.out.println(s1);
		System.out.println(arrStr[1]); // 둘이 똑같음
		
		int [][] arr2Int = {
				{1,3,5,7},
				{0,2,3,6}
		};
		
		int[] arr0Int =arr2Int[0];
		int i1 = arr0Int[1];
		
		
	}
	
	
	
	public void me31() {
		
		float[] arrfloat = new float[] {3.14F, 4.2F, 9.8F};
		System.out.println(arrfloat.length);
		
	}
	
	
	public void me32(Dog[] dogs) {
		// 1. dogs의 배열 크기를 출력하시오.
		// 2. main method에서 me32 method를 호출하시오.
		// 단, 데이터가 필요하면 new Dog( ), new Dog( ), new Dog( )를 모두 이용.
		
		int size = dogs.length;
		System.out.println(size);
		
		
	}
	
	
	public void me30() {
		
		int[] arrInt = new int[3000];
		System.out.println(arrInt.length);
		
		
		}
	
	
	public void me35() {
		double[] arrDoulbe = {4.3, 5.1123, 69.3 };
		System.out.println(arrDoulbe.length);
		
		
	}
	
	public void me3() {
		int[] arrInt = new int[] {1,3,5,7};
		System.out.println(arrInt.length);
		
		// 1. arrint 1의 배열 크기 출력
		// 2. arrint 1의 배열 크기를 45로 변환.
		
		System.out.println(arrInt[1]);
		
		arrInt[1] = 45;
		
		
		
	}
	
	
	public void me01() {
		int[] arr = {3,6,3,7};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	
	
	
	public void me0() {
		// 1. 반복문 사용을 위해서
		// 2. 여러개의 데이터를 반환하기 위해서.
		
		
		int a0 = 3;
		int a1 = 6;
		int a2 = 3;
		int a3 = 7;
		
		for(int i =0; i<4; i++) {
			System.out.println('a'+i);
		}
		
	}
	
	
	
	
	
		
		
	}
	
	
	
	
	
	


