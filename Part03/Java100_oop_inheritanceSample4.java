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
	void walk(){ System.out.println("�ɾ�� �ֽ��ϴ�");	} 
}

class Hero extends Person{
	// field
	String name;
	int age;
	
	// constructor
	Hero(){}
	Hero( int gender, int power, String name, int age ){
		super(); //-- �θ�Ŭ������ ������ ȣ��
		this.name = name;
		this.age = age;
	}
	
	// Method
	void walk(){
		System.out.println("(�ڽ�Ŭ����)�ɾ�� �־��"); //-- �������̵�(������)
	}
	void eat(){System.out.println("�԰� �ִµ���?");}
	void displayPerson(){
		System.out.println("�̸�: " + name + "(" + age + " | " + getGender(gender) + " ) | �Ŀ�: " + power);
	}
	public String getGender(int a){
		String rst;
		switch(a){
			case 0:
				rst = "����";
				break;
			case 1:
				rst = "����";
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
		// ��ü ����
		Person p1 = new Person();
		System.out.println(p1);
		
		p1.walk();
		System.out.println("--------");
		
		Hero h1 = new Hero(1, 100, "�������", 30); //-- �θ�Ŭ���� ������ ������ �� �ȵǴ°���??
		System.out.println(h1.name);
		System.out.println(h1.gender);
		System.out.println(h1.age);
		h1.walk();
		h1.eat();
		h1.displayPerson();
	}
}