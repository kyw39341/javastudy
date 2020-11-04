package com.naver;

public class Hero {
	
	private Bow bow;
	private Spear spear;
	private Sword sword;
	
	public Hero() {

	}

	public Hero(Bow bow, Spear spear, Sword sword) {
		super();
		this.bow = bow;
		this.spear = spear;
		this.sword = sword;
	}

	public Bow getBow() {
		return bow;
	}

	public void setBow(Bow bow) {
		this.bow = bow;
	}

	public Spear getSpear() {
		return spear;
	}

	public void setSpear(Spear spear) {
		this.spear = spear;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public void attackBySpear(Monster mon) {
		// TODO Auto-generated method stub
		
	}
	
	
		
	}
	
	
	
	


