package com.naver;

public class Car {
	
	private String modelName;
	private String carNo;
	private int price;
	
	public Car(String string, String string2, int i ) {
		
		
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showMeprice() {
		System.out.println(price);	
	}
	
	public String run(int speed) {
		String msg = speed +"로 달린다.";
		return msg;
		
	}

}
