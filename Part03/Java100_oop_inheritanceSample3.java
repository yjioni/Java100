class Person{
	// field
	int gender;
	int power;
	// constructor
	Person(){}  //-- �̰� �� ���������� �𸣰���
	Person(int gender, int power){
		this.gender = 1;
		this.power = 100;
	}
	// method
	void walk(){ System.out.println("�ɾ���־��."); }
}

class Hero extends Person{
	// field
	String name;
	int age;
	// constructor
	Hero(){}
	Hero(String name, int age){
		super(); // �θ�Ŭ���� ������ ȣ��
		this.name = name;
		this.age = age;
	}
	// method
	void walk(){ // �������̵�
		System.out.printf("%s(��)�� ��û ���� �ɾ���־��.%n", name);
	}
	void eat(){System.out.println("��԰��־��.");}
	void displayPerson(){
		System.out.printf("�̸�: %s (%d, %d) - power: %d%n", name, age, gender, power);
		}
	
}

public class Java100_oop_inheritanceSample3{
	public static void main(String[] args){
		// ��ü ����
		Person p1 = new Person();
		p1.walk();
		// ����� ���� ��ü ����
		Hero h1 = new Hero("���̾��", 40);
		h1.walk();
		h1.eat();
		h1.displayPerson();
	}
}