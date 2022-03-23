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
	public void setName(String name){ this.name = name; }
	public String getName(){return name;}
	
	public void setAge(int age){ this.age = age; }
	public int getAge(){return age;}
}

public class Java100_oop_ObjArray{
	public static void main(String[] args){
		int[] ar1 = {1, 2, 3, 4, 5};
		char[] ar2 = {'A', 'B', 'C', 'D', 'E'};
		
		Person[] pa = new Person[5];
		pa[0] = new Person("ȫ�浿", 20);
		pa[1] = new Person("������", 30);
		pa[2] = new Person("����������", 40);
		pa[3] = new Person("���̾��", 40);
		pa[4] = new Person("�丣", 100);
		// System.out.println(Arrays.toString(pa));
		
		// �����ڷ� ���
		for (int i=0; i<pa.length; i++){
			System.out.println(pa[i].getName() + " " + pa[i].getAge());
		}
		
		
	}
}