package com.naver;

public class Hero {
	
	private Bow bow;
	private Spear spear;
	private Sword sword;
	private Monster mon;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(Bow bow, Spear spear, Sword sword, Monster mon) {
		this.bow = bow;
		this.spear = spear;
		this.sword = sword;
		this.mon = mon;
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

	public Monster getMon() {
		return mon;
	}

	public void setMon(Monster mon) {
		this.mon = mon;
	}
	
	
	public void attackBySpear(Monster mon) {
		
	}
	
	
	
	
	
	

}
