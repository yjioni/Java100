class FarmMachine{
	// attribute
	int price;
	int year;
	String color;
	// method
	void move(){System.out.println("FarmMachine is moving.");}
	void dig(){System.out.println("FarmMachine is digging.");}
	void grind(){System.out.println("FarmMachine is grindding.");}
}

public class Java100_oop_Exam003{
	public static void main(String[] args){
		// ��ü ����
		FarmMachine fm = new FarmMachine();
		System.out.println(fm);
		// ��ü �Ӽ� �Է�
		fm.price = 2000;
		fm.year = 2022;
		fm.color = "red";
		// ��ü �Ӽ� ���
		// [1] ���ο� ��ü�� �ޱ�
		String fm_price = String.format("%,d", fm.price);
		System.out.println(fm_price);
		// [2] �ٷ� String.format() �޼��� ���
		System.out.println(String.format("%,d", fm.year));
		// ��ü ���� �Է�
		fm.move();
		fm.dig();
		fm.grind();
	}
}