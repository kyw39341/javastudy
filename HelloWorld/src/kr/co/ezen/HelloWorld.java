package kr.co.ezen;

import java.util.Scanner;

public class HelloWorld {
	
     Scanner sc = new Scanner(System.in);
     int[] arr = new int[10];
     public void start() {
    	 int selsct;
    	 while(true) {
    		 System.out.println("��ưȣ�� ���� ���α׷�v1.0");
    		 System.out.println("1.�Խ� 2.��� 3.�溸�� 4.����");
    		 System.out.println("���� >");
    		 selsct=sc.nextInt();
    		 switch(selsct) {
    		 case 1: checkIn();break;
    		 case 2: checkOut();break;
    		 case 3: emptyRoom();break;
    		 case 4: return;
    	 }
     }

}
     
    public void checkIn() {
    	System.out.println("����濡 �Խ� �Ͻðڽ��ϱ�? = ");
    	int select=sc.nextInt();
    	System.out.println(select+"�� �濡 �Խ� �ϼ̽��ϴ�.");
    	arr[select-1]=1;
 
    }
    public void checkOut() {
    	System.out.println("����濡�� ��� �Ͻðڽ��ϱ�? =");
    	int select = sc.nextInt();
    	if(arr[select -1]==0) {
    		System.out.println(select+"������ ���� ����Դϴ�.");
    	}else {
    		arr[select-1]=0;
    		System.out.println(select+"�� �濡�� ��� �Ͽ����ϴ�.");
    	}
    }
    
    public void emptyRoom() {
    	for(int i=0; i<arr.length;i++) {
    		if(arr[i]==0) {
    			System.out.println((i+1)+"������ ���� ��� �ֽ��ϴ�.");
    		}else {
    			System.out.println((i+1)+"���濡�� ���� �մ��� �ֽ��ϴ�.");
    		}
    	}
    }
    
    
    
}
