package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;
import com.naver.Car;
import com.naver.Dog;
import com.naver.Person;
import com.naver.Team;

public class MainEx {

	private static Person captin;

	public static void main(String[] args) {
		
		Car car1 = new Car("K7","����34��1234",4000);
		//car1. showMePrice();
		Car car2 = new Car("bmw", "����33��9876", 5000);
		Car car3 = new Car("sm5", "���31��1234", 4000);
		
		Dog dog1 = new Dog(1,"happy", new Date(11));
		Dog dog2 = new Dog(2, "merry", new Date());
		Dog dog3 = new Dog(3, "�鱸", new Date(Calendar.getInstance().getTimeInMillis()));
		
		Person captain = new com.naver.Person("p1", "a������", dog1, car1);
		Person member1 = new Person("p2", "������", dog2 , car2);
		Person member2 = new Person("p3", "�̼���", dog3 , car3);
		
	    Team aTeam = new Team(captain, member1, member2);
		
		// Team Ŭ������ �̿��Ͽ� aTeam�� bTeam�� ����ÿ�.
		// �� �����ڿ� ���� �Ķ���ʹ� ���� ����� ������ ���.
		
		Car car4 = new Car("K5", "4", 5000);
		Car car5 = new Car("����", "5", 5000);
		Car car6 = new Car("sm7", "6", 5000);
		
		Dog dog4= new Dog(4, "Ȳ��", new Date());
		Dog dog5 = new Dog(5, "��ĥ��", new Date());
		Dog dog6 = new Dog(6, "��", new Date());
		
		
		Person othercaptain = new Person("p4", "b������", dog4, car4);
		Person member3 = new Person("p5", "����", dog5, car5);
		Person member4 = new Person("p6", "ȫ��", dog6, car6);
		
		Team bTeam = Team(othercaptain, member3, member4);
		
		aTeam.fight(bTeam);
		bTeam.fightMem1(aTeam);
		
		aTeam.fightMem2Dog(bTeam);
		
		
		
	}

	private static Team Team(Person othercaptain, Person member3, Person member4) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
