package com.naver;

public class Test {
	
	public void me11() {
		// �迭�� ũ�Ⱑ 100�� Stringbuffer���� 1���� �迭 arrsb�� �����Ͻð�
		// arrsb�� �迭 ũ�⸦ ����Ͻÿ�.
		
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println(arrSb);
		
		//arr sb�� 51��° ��Ұ��� ���.
		
		System.out.println(arrSb[50]);
		
		StringBuffer sb1 = new StringBuffer();
		// arrsb�� �ε����� 1���� ���� sb1 ��ü�� �����϶�.
		arrSb[1] = sb1; 
		
		
		System.out.println("::::::::::::::::::::");
		System.out.println(arrSb.length);
		
		// �迭 ���� ù��° ���
		
		
		// arrSb�� ���� �ִ� ��� ��Ұ��� ����� ��.
		// ��, ��� ������ �ε����� ū ������ ����մϴ�.
		
		
		for (int i = arrSb.length-1; i >= 0; i--) {
			System.out.println(arrSb[i]);
		
			
	
			
		}
		
	}
	
	public void me1() {
		// �ڷ���[] ������ = new �ڷ���[�迭�� ũ��];
		int[] arrInt = new int[4];
		// arrInt�� 0,1,2,3 �� �Է��Ͻÿ�.
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
			
		}
		
		//arrInt�� 0,2,4,6.
		
	    for (int i = 0; i < arrInt.length; i++) {
	    	arrInt[i] = i*2;
			
		}
	    
	    // arrInt�� 1,3,5,7�� �Է��ϼ���.
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	arrInt[i] = i*2+1;
			
		}
	    
	    //arrInt�� 10,20,30,40,50�� �Է��ϼ���.
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	arrInt[i] = i*10;
			
		}
	    
	    
		
		
		
			
		}
		
		
		
		
	
	
	
	
	
	public void me12(Dog[] dogs) {
		//1. Test class�� me12()���� �Ķ���ͷ� �Ѿ�� �迭 �������� ũ�⸦ ����Ͻÿ�.
		//2. main( ) �� ���� me12( ) �� ȣ���Ͻÿ�.
		
		System.out.println(dogs.length);
		
		// dogs�� ���� ū �ε��� ��Ұ��� null�� �����Ͻÿ�.
		
		int largestIdx = dogs.length -1;
		dogs[largestIdx] = null;
		
		// dogs[dogs.lenght -1] = null;
		
		//1. dogs �迭�� �ִ� ��� ��Ұ�(dog ��ü)�� ����Ͻÿ�.
		
		
		
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
		
		//2. dogs �迭�� �ִ� ��� dog ��ü�� �̸��� ����Ͻÿ�.
		
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
		//1. data.split("#")�� ��ȯ���� arrData�� �ް�
		// 2. arrData�� ũ�⸦ ����Ͻÿ�.
		System.out.println(arrData.length);
		
		// arrData�� ���� ū �ε����� ��ڰ��� 100���� �����Ͻÿ�.
		
		int largestIdx = arrData.length -1;
		arrData[largestIdx] = "100";
		
		// arrdata�� ���� ���� �ε����� ��ڰ��� "ezen"���� �����Ͻÿ�.
		
		
		arrData[0] = "ezen";
		
		//arrData�� ��� ��Ұ��� ����Ͻÿ�.
		
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		
		//arrData�� ��� ��Ұ��� ù���ڸ� ����Ͻÿ�.
		
		for (int i = 0; i < arrData.length; i++) {
			String msg = arrData[i];
			char c = msg.charAt(0);
			System.out.println(c);
			
			// sysout(arrData[i].charAt(0));
		}
		
		
		
		
		
		
		
		}
	
	public void me2() {
		// �ڷ���[] �迭�� = {��1, ��2, ��3....};
		int[] arrInt = {1, 4, 6};
	    System.out.println(arrInt.length);
	    
	    // �迭 ���� �ι�° ���
		
	    
	   // arrInt �迭�� 2��° ��Ұ��� ����Ͻÿ�.
	    System.out.println(arrInt[1]);
	    
	    // arrInt �迭�� �ε����� 1�� ��ڰ��� 333 ���� �����Ͽ���.
	    
	    arrInt[1] = 333;
	    
	    // 1. arrint�� �����ִ� ��� ��Ұ� ���
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	System.out.println(arrInt[i]);
			
		}
	    
	    //2. arrint�� �����ִ� ��� ��Ұ� ����ϱ�. ��, �ε����� 1�� ��Ұ��� ��±���
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	
	    	if(i ==1) {
	    		continue;
	    	}
	    	
	    	System.out.println(arrInt[i]);
			
		}
	    
	    // 3. arrInt�� �����ִ� ��� ��Ұ� ����ϱ�. �� ��Ұ��� 6�̸� ��±���.
	    
	    for (int i = 0; i < arrInt.length; i++) {
	    	
	    	int num = arrInt[i];
	    	if(num != 6) {
	    	      System.out.println(num);	
	    	}
	    	
	    	
			
		}
	    
	}
	
	
	public void me21() {
		// 1. �ڷ����� dog�� 1���� �迭 arrDog�� �����ϵ�, �� ũ��� 
		// �迭���� �ι�° ������� �����Ͻÿ�.
		// 2. arrDog�� �迭 ũ�⸦ ����Ͻÿ�.
		
		Dog[] arrDog = {new Dog(), new Dog()};
		System.out.println(arrDog.length);
		//Dog a = new Dog();
		//Dog b = new Dog();
		//arrDog = {a,b};
		
		// arrDog�� ���� ū �ε��� ��Ұ��� null�� �����Ͻÿ�.
		
		int largestrIdx = arrDog.length -1;
		arrDog[largestrIdx] = null;
		
		// arrDog[arrDog.lenght-1] = null;
		
		// 1. arrDog�� ��� ��Ұ��� ����Ͻÿ�.
		
		for (int i = 0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}
		
		// 2. arrDog�� �ε����� 1�� ��Ұ��� name�� ����Ͻÿ�.
	    // ��, �ش� ��Ұ��� null�� �ƴ� ��쿡��
		
		Dog dog = arrDog[1];
		if(dog != null) {
			System.out.println(dog.getName());
		}
		
		
		
	}
	
	public void me22(String [] arrStr) {
		// 1. arrStr�� ũ�⸦ ����Ͻÿ�.
		// 2. main( )���� me22 ( ) ȣ���Ͻÿ�.
		
		System.out.println(arrStr.length);
		
		// arrStr�� index�� 1�� ���� ���� "12"�� �����Ͻÿ�.
		
		arrStr[1] = "12";
		
		// arrStr�� index�� 1�� ���� ���� ����Ͻÿ�.
		
		System.out.println(arrStr[1]);
		
		String s1 =arrStr[1];
		
		System.out.println(s1);
		System.out.println(arrStr[1]); // ���� �Ȱ���
		
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
		// 1. dogs�� �迭 ũ�⸦ ����Ͻÿ�.
		// 2. main method���� me32 method�� ȣ���Ͻÿ�.
		// ��, �����Ͱ� �ʿ��ϸ� new Dog( ), new Dog( ), new Dog( )�� ��� �̿�.
		
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
		
		// 1. arrint 1�� �迭 ũ�� ���
		// 2. arrint 1�� �迭 ũ�⸦ 45�� ��ȯ.
		
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
		// 1. �ݺ��� ����� ���ؼ�
		// 2. �������� �����͸� ��ȯ�ϱ� ���ؼ�.
		
		
		int a0 = 3;
		int a1 = 6;
		int a2 = 3;
		int a3 = 7;
		
		for(int i =0; i<4; i++) {
			System.out.println('a'+i);
		}
		
	}
	
	
	
	
	
		
		
	}
	
	
	
	
	
	


