package com.nate;

public class Duck {
	
	private String modleName;
	private String carNo;
	private int price;
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}

	public Duck(String modleName, String carNo, int price) {
		super();
		this.modleName = modleName;
		this.carNo = carNo;
		this.price = price;
	}

	public String getModleName() {
		return modleName;
	}

	public void setModleName(String modleName) {
		this.modleName = modleName;
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
	
	public void shwMeprice() {
		System.out.println(price);
		}
	
	public String run(int speed) {
		String msg = speed + "로 달린다.";
		return msg;
		
	}
	
	

	
	
	
	
	
	

}
