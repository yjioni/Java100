// �θ� Ŭ����
class Person{
	// field �Ӽ�
	int gender;
	int power;
	// constructor ������
	Person(){
		this.gender = 1;
		this.power = 100;
	}
	// method �޼���
	void walk(){
		System.out.println("�ɾ�� �־��!");
	}
}

// �ڽ� Ŭ����
class Hero extends Person{
	// field
	String name;
	int age;
	// constructor
	Hero(){}
	Hero(String name, int age){
		this.name = name;
		this.age = age;
	}
	// method
	void eat(){ System.out.println("��԰� �־��"); }
	void displayPerson(){
		System.out.printf("�̸�: %s | ����: %d | ����: %s | �Ŀ�: %d%n", name, age, gender, power);
	}
}

public class Java100_oop_inheritanceSample2{
	public static void main(String[] args){
		// ��ü ����
		Person p1 = new Person();
		p1.walk();
		// ����� ���� ��ü ����
		Hero h1 = new Hero("���۸�", 20);
		h1.eat();
		h1.displayPerson();
		System.out.println(h1.name);
		System.out.println(h1.power);
	}
}