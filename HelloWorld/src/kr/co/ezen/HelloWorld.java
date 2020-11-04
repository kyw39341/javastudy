package kr.co.ezen;

import java.util.Scanner;

public class HelloWorld {
	
     Scanner sc = new Scanner(System.in);
     int[] arr = new int[10];
     public void start() {
    	 int selsct;
    	 while(true) {
    		 System.out.println("힐튼호텔 관리 프로그램v1.0");
    		 System.out.println("1.입실 2.퇴실 3.방보기 4.종료");
    		 System.out.println("선택 >");
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
    	System.out.println("몇번방에 입실 하시겠습니까? = ");
    	int select=sc.nextInt();
    	System.out.println(select+"번 방에 입실 하셨습니다.");
    	arr[select-1]=1;
 
    }
    public void checkOut() {
    	System.out.println("몇번방에서 퇴실 하시겠습니까? =");
    	int select = sc.nextInt();
    	if(arr[select -1]==0) {
    		System.out.println(select+"번방은 현재 빈방입니다.");
    	}else {
    		arr[select-1]=0;
    		System.out.println(select+"번 방에서 퇴실 하였습니다.");
    	}
    }
    
    public void emptyRoom() {
    	for(int i=0; i<arr.length;i++) {
    		if(arr[i]==0) {
    			System.out.println((i+1)+"번방이 현재 비어 있습니다.");
    		}else {
    			System.out.println((i+1)+"번방에는 현재 손님이 있습니다.");
    		}
    	}
    }
    
    
    
}
