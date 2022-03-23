class Person{
	// field 
	private String name;  //-- private: �� ������ ���ؼ��� ���� �Ұ�
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
	// public�� ���� ��Ű���� �ƴϴ��� ��� ����
	public void setName(String name){this.name = name;} 
	public String getName(){return name;}
	
	public void setAge(int age){this.age = age;}
	public int getAge(){return age;}
	
	public void setHeight(int height){this.height = height;}
	public int getHeight(){return height;}
	
	public void setWeight(int weight){this.weight = weight;}
	public int getWeight(){return weight;}
	
	public void move(){System.out.println("�̵���...");}
}

class Villian extends Person{
	// field
	private String unique_key;
	private int weapon;
	private double power;
	
	// constructor
	Villian(){}
	Villian(String name, int age, int height, int weight, String unique_key, int weapon, double power){
		super(name, age, height, weight); //-- �θ�Ŭ���� ������ ȣ��
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
		System.out.println("(�θ�)----->>>>>");
		System.out.println("�̸�: " + getName());
		System.out.println("����: " + getAge());
		System.out.println("Ű: " + getHeight());
		System.out.println("ü��: " + getWeight());
		
		System.out.println("(�ڽ�)----->>>>>");
		System.out.println("��ȣ: " + getUnique_key());
		System.out.println("����: " + getWeaponName(getWeapon()));
		System.out.println("�Ŀ�: " + getPower());
	}

	public String getWeaponName(int a){
		String weapon;
		switch(a){
			case 1:
				weapon = "â";
				break;
			case 2:
				weapon = "����";
				break;
			case 3:
				weapon = "Ȱ";
				break;
			case 4:
				weapon = "Į";
				break;
			default:
				weapon = "���ָ�";
				break;
		}
		return weapon;
	}
}
public class Java100_oop_inheritanceSample5{
	public static void main(String[] args){
		// ��ü ����
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		System.out.println(p1.getName());
		// System.out.println(p1.name);
		
		Villian v1 = new Villian("��������", 20, 180, 100, "0001", 0, 50.9);
		v1.printPerson();
		v1.move();
	}
}