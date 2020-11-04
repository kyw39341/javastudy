package com.naver;

public class Test {
	
	public void me1() {
		// 2차원 배열
		// 2차원 배열 안에는 1차원 배열이 들어 있다.
		// 최종 요소값의 자료형이 int가 2차원 배열을 선언하시오.
		
		int [][] arr;
	}
	
	public void me2() {
		// 최종 요소값의 자료형이 StringBuffer인 2차원 배열 arr 에는 5개의 1차원 배열이 있다.
		// 그리고 그 안에 있는 1차원 배열의 크기는 3이다.
		
		StringBuffer[][] arr = new StringBuffer[5][3];
		System.out.println(arr.length);
		
		System.out.println(arr[0].length); // 파레트안에 라면상자, 라면상자의 갯수 확인 = length
		
		//arr[0].lenght << 일반적으로 많이 사용하는 방법
	}
	
	public void me21() {
		// 최종 요소값의 자료형이 Dog인 2차원 배열 arr의 크기는 10이고,
		// 그 안에 있는 배열의 크기는 2이다.
		
		Dog[][] arr = new Dog[10][2];
		
		
		// arr의 모든 요소값 (Dog[])를 출력하시오!
		
		for (int i = 0; i < arr.length; i++) {
			Dog[] dogs = arr[i];
			System.out.println(dogs);
			
			// arr의 최종 요소값을 모두 출력하시오.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
				
			}
		}
	}
	
	
	public void me22() {
		int[][] arr = new int[5][4];
		
		// 1. arr의 모든 요소값을 출력하시오.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
			// 2.arr의 최종 요소값을 모두 출력하시오.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		// 3. arr의 인덱스가 0인 요소값에 인덱스가 2인 요소값을 출력.
		System.out.println(arr[0][2]);
		
		//4. arr의 가장 큰 인덱스의 요소값에 가장 작은 인덱스의 요소값을 100으로 설정하시오.
		arr[arr.length-1][0] = 100;
		
		// arr의 가장 큰 인덱스의 요소값의 가장 작은 인덱스의 요소값을 출력하시오.
		System.out.println(arr[arr.length-1][0]);
		
		
		
		
	}
	
	public void me3() {
		int[][] arr1 = {
				{4,1,0},
				{4,1,8},
				{5,7,1}
		};
		
		String[][] arr2= {
				{"good","oh","my"},
				{"god","thank","you"}
		};
		
		// 5 ~ 0이 순환되면서 배열에 들어감.
		// int형 3차원 arr3은 3X1X4 크기이다.
		
		int[][][] arr3= {
				{
					{5,6,7,8}
					},
				{
						{9,0,1,2}
				},
				{
					{3,4,5,6}
				}
		};
		
		// int형 2차원 배열 arr4는 5x3크기를 갖는다.
		
		int[][] arr4= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15}
		};
		
		// arr4의 [2] [1]의 요소값을 100으로 수정하여라.
		
		arr4[2][1] = 100;
		
		// arr4의 3번째 요소값의 최종 요소값을 구하라.
		
		int[] sub1 =arr4[2];
		for (int i = 0; i < sub1.length; i++) {
			System.out.println(sub1[i]);
		}
		
		// for (int i = 0; i < arr4[i].length; i++) {
			// System.out.println(arr4[i]);
		
		System.out.println("#######################");
		
		// arr3의 마지막 index의 요소값의 첫번째 요소값을 출력.
		
		int[] sub2 =arr3[arr3.length-1][0];
				System.out.println(sub2);
			
			
		}
	
	
	public void me4() { 
		int[][] arr = new int[3][10];
		
		// 0: 1,2,3,4,5,6,7,8,9,10
		// 1: 0,2,4,6,8,10,12,14,16,18
		// 2: 1,3,5,7,9,11,13,15,17,19
		
		for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
				if(i==0) {
					arr[i][j] = i+1;
				}else if(i==1) {
					arr[i][j] = i *2;
				}else {
					arr[i][j] = i*2+1;
				}
			}
		
		}
		
	}
	
	public void me5() {
		//가변형 배열
		int[][] arr = new int[3][];
		// 0 : 1,2,3,4
		// 1 : 0,2,4
		// 2 : 1,3,5,7,9
		
		arr[0] = new int[] {1,2,3,4};
		arr[1] = new int[] { 0,2,4 };
		arr[2] = new int[] {1,3,5,7,9};
		
		
		// 출력은 반복문 가능.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}

	
		
	
	
	
	


