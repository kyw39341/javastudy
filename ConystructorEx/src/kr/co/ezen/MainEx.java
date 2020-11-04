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
		
		Car car1 = new Car("K7","서울34자1234",4000);
		//car1. showMePrice();
		Car car2 = new Car("bmw", "서울33사9876", 5000);
		Car car3 = new Car("sm5", "경기31자1234", 4000);
		
		Dog dog1 = new Dog(1,"happy", new Date(11));
		Dog dog2 = new Dog(2, "merry", new Date());
		Dog dog3 = new Dog(3, "백구", new Date(Calendar.getInstance().getTimeInMillis()));
		
		Person captain = new com.naver.Person("p1", "a팀주장", dog1, car1);
		Person member1 = new Person("p2", "김유신", dog2 , car2);
		Person member2 = new Person("p3", "이순신", dog3 , car3);
		
	    Team aTeam = new Team(captain, member1, member2);
		
		// Team 클래스를 이용하여 aTeam과 bTeam을 만드시오.
		// 단 생성자에 들어가는 파라미터는 위에 선언된 변수를 사용.
		
		Car car4 = new Car("K5", "4", 5000);
		Car car5 = new Car("벤츠", "5", 5000);
		Car car6 = new Car("sm7", "6", 5000);
		
		Dog dog4= new Dog(4, "황구", new Date());
		Dog dog5 = new Dog(5, "땡칠이", new Date());
		Dog dog6 = new Dog(6, "봄", new Date());
		
		
		Person othercaptain = new Person("p4", "b팀주장", dog4, car4);
		Person member3 = new Person("p5", "덕구", dog5, car5);
		Person member4 = new Person("p6", "홍구", dog6, car6);
		
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
