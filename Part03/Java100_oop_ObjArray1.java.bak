import java.util.Arrays;

class Person{
	// field
	private String name;
	private int age;
	
	// constructor
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// method
	public void setName(String name){this.name = name;}
	public String getName(){return name;}
	
	public void setAge(int age){this.age = age;}
	public int getAge(){return age;}
}

public class Java100_oop_ObjArray1{
	public static void main(String[] args){
		// 객체
		Person[] pa;
		pa = new Person[10];
		
		// for 로 객체 생성
		for (int i=0; i<pa.length; i++){
			pa[i] = new Person(i+"번 후보자", i+20);
			System.out.println(pa[i].getName() + "(" + pa[i].getAge() + ")");
		}
	}
}