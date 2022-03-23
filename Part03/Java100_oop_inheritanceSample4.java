class Person{
	// field
	int gender;
	int power;
	
	// constructor
	Person(){}
	Person(int gender, int power){
		this.gender = gender;
		this.power = power;
	}
	
	// Method
	void walk(){ System.out.println("걸어가고 있습니당");	} 
}

class Hero extends Person{
	// field
	String name;
	int age;
	
	// constructor
	Hero(){}
	Hero( int gender, int power, String name, int age ){
		super(); //-- 부모클래스의 생성자 호출
		this.name = name;
		this.age = age;
	}
	
	// Method
	void walk(){
		System.out.println("(자식클래스)걸어가고 있어용"); //-- 오버라이딩(재정의)
	}
	void eat(){System.out.println("먹고 있는데요?");}
	void displayPerson(){
		System.out.println("이름: " + name + "(" + age + " | " + getGender(gender) + " ) | 파워: " + power);
	}
	public String getGender(int a){
		String rst;
		switch(a){
			case 0:
				rst = "남자";
				break;
			case 1:
				rst = "여자";
				break;
			default:
				rst = "---";
				break;
		}
		return rst;
	}
}

public class Java100_oop_inheritanceSample4{
	public static void main(String[] args){
		// 객체 생성
		Person p1 = new Person();
		System.out.println(p1);
		
		p1.walk();
		System.out.println("--------");
		
		Hero h1 = new Hero(1, 100, "원더우면", 30); //-- 부모클래스 생성자 설정이 왜 안되는거지??
		System.out.println(h1.name);
		System.out.println(h1.gender);
		System.out.println(h1.age);
		h1.walk();
		h1.eat();
		h1.displayPerson();
	}
}