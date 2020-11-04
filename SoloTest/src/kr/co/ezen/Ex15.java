package kr.co.ezen;

public class Ex15 {
	
	//객체 클래스
    // 변수 : 콜라(1200원). 식혜(1500원), 포카리(1800원), 마운틴듀(2000원)
	
	private String drink; // 음료이름
	private int get; // 잔고량
	private int price; // 가격
	
	public Ex15(String drink, int get, int price) {
		this.drink = drink;
		this.get = get;
		this.price = price;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public int getGet() {
		return get;
	}

	public void setGet(int get) {
		this.get = get;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
		
		
	}
