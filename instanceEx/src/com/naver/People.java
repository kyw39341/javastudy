package com.naver;

public class People {
	public String name;
	String Emotion;
	int age;

	public People() {
		
	}

	public People(String name, String emotion, int age) {
		super();
		this.name = name;
		Emotion = emotion;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmotion() {
		return Emotion;
	}

	public void setEmotion(String emotion) {
		Emotion = emotion;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}

