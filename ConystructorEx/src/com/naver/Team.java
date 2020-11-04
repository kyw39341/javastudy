package com.naver;

public class Team {
	
	private Person captain;
    private Person member1;
    private Person member2;
	private Person othercaptain;
    
    public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(Person captain, Person member1, Person member2) {
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
	}

	public Person getCaptain() {
		return captain;
	}

	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	public Person getMember1() {
		return member1;
	}

	public void setMember1(Person member1) {
		this.member1 = member1;
	}

	public Person getMember2() {
		return member2;
	}

	public void setMember2(Person member2) {
		this.member2 = member2;
	}
	
	
	public void showCaptainCarPrice() {
		Car captainCar =captain.getK7();
		captainCar.showMeprice();
		
	}
	public void mem1Sleep(String where) {
		String msg = member1.getHappy().sleep("방");
		System.out.println(msg);
		
	}
		
	public void mem2PrintCarModelName() {
		
		String modelName= member2.getK7().getModelName();
		System.out.println(modelName);
		
		}
	
    public char getCaptainCarModelNameFirstChar() {
    	Car car =captain.getK7();
    	String modelName =car.getModelName();
    	char c = modelName.charAt(0);
    	return c;
    	
    }
    
    public void changeMem1Dog(Dog dog) {
    	member1.setHappy(dog);
    	}
    
    public void changeMem1DogName(String dogname) {
    	Dog dog = member1.getHappy();
    	dog.setName(dogname);
    	
    }
    
    public void fight(Team bTeam) {
    	String aTeamCaptainName = this.captain.getName();
    	String bTeamCaptainName = bTeam.captain.getName();
		System.out.println(captain+"과"+othercaptain+"이 싸웁니다.");
    }

	public void fightMem1(Team otherTem) {
		String captain = this.captain.getName();
		String otherCaptainString = otherTem.captain.getName();
		
	 
		
	}

	public void fightMem2Dog(Team otherTeam) {
		String aTeamDog = this.member2.getHappy().getName();
		String bTeamDog = otherTeam.member2.getHappy().getName();
		System.out.println(aTeamDog+"와"+bTeamDog+"가 개싸움을 합니다.");
			
	}
	
	
	
    
	
	
	
		
	}
	

