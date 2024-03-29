class Person{
	// field
	int gender;
	int power;
	// constructor
	Person(){}  //-- 이거 왜 오류나는지 모르겠음
	Person(int gender, int power){
		this.gender = 1;
		this.power = 100;
	}
	// method
	void walk(){ System.out.println("걸어가고있어요."); }
}

class Hero extends Person{
	// field
	String name;
	int age;
	// constructor
	Hero(){}
	Hero(String name, int age){
		super(); // 부모클래스 생성자 호출
		this.name = name;
		this.age = age;
	}
	// method
	void walk(){ // 오버라이딩
		System.out.printf("%s(이)가 엄청 빨리 걸어가고있어요.%n", name);
	}
	void eat(){System.out.println("밥먹고있어요.");}
	void displayPerson(){
		System.out.printf("이름: %s (%d, %d) - power: %d%n", name, age, gender, power);
		}
	
}

public class Java100_oop_inheritanceSample3{
	public static void main(String[] args){
		// 객체 생성
		Person p1 = new Person();
		p1.walk();
		// 상속을 통한 객체 생성
		Hero h1 = new Hero("아이언맨", 40);
		h1.walk();
		h1.eat();
		h1.displayPerson();
	}
}