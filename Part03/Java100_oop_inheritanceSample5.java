class Person{
	// field 
	private String name;  //-- private: 이 변수에 대해서는 수정 불가
	private int age;
	private int height;
	private int weight;
	
	// constructor 
	Person(){}
	Person(String name, int age, int height, int weight){
		this.name  = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// Method
	// public은 같은 패키지가 아니더라도 사용 가능
	public void setName(String name){this.name = name;} 
	public String getName(){return name;}
	
	public void setAge(int age){this.age = age;}
	public int getAge(){return age;}
	
	public void setHeight(int height){this.height = height;}
	public int getHeight(){return height;}
	
	public void setWeight(int weight){this.weight = weight;}
	public int getWeight(){return weight;}
	
	public void move(){System.out.println("이동중...");}
}

class Villian extends Person{
	// field
	private String unique_key;
	private int weapon;
	private double power;
	
	// constructor
	Villian(){}
	Villian(String name, int age, int height, int weight, String unique_key, int weapon, double power){
		super(name, age, height, weight); //-- 부모클래스 생성자 호출
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;
	}
	
	// method
	public void setUnique_key(String unique_key){this.unique_key = unique_key;}
	public String getUnique_key(){return unique_key;}
	
	public void setWeapon(int weapon){this.weapon = weapon;}
	public int getWeapon(){return weapon;}
	
	public void setWPower(double power){this.power = power;}
	public double getPower(){return power;}
	
	public void printPerson(){
		System.out.println("(부모)----->>>>>");
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("키: " + getHeight());
		System.out.println("체중: " + getWeight());
		
		System.out.println("(자식)----->>>>>");
		System.out.println("번호: " + getUnique_key());
		System.out.println("무기: " + getWeaponName(getWeapon()));
		System.out.println("파워: " + getPower());
	}

	public String getWeaponName(int a){
		String weapon;
		switch(a){
			case 1:
				weapon = "창";
				break;
			case 2:
				weapon = "도끼";
				break;
			case 3:
				weapon = "활";
				break;
			case 4:
				weapon = "칼";
				break;
			default:
				weapon = "맨주먹";
				break;
		}
		return weapon;
	}
}
public class Java100_oop_inheritanceSample5{
	public static void main(String[] args){
		// 객체 생성
		Person p1 = new Person();
		p1.setName("홍길동");
		System.out.println(p1.getName());
		// System.out.println(p1.name);
		
		Villian v1 = new Villian("주정뱅이", 20, 180, 100, "0001", 0, 50.9);
		v1.printPerson();
		v1.move();
	}
}