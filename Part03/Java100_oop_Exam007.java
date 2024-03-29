class Person{
	// 속성 attribute
	int age;
	String name;
	// 생성자 constructor
	Person(){}
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	// 메서드 method
	void printPerson(){System.out.println(name + "(" + age + ")");}
}


public class Java100_oop_Exam007{
	public static void main(String[] args){
		Person p1 = new Person(20, "홍길동");
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.printPerson();
		
		Person p2 = new Person();
		p2.printPerson();
		
		Person p3 = new Person(30, "국영수");
		p3.printPerson();
		
		Person p4 = new Person(40, "을지문덕");
		p4.printPerson();
	}
}