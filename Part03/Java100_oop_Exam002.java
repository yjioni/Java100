class FarmMachine{
	// Attribute �Ӽ�
	int price;
	int year;
	String color;
	// Method ����
	void move(){ System.out.println("FarmMachine is moving."); }
	void dig(){ System.out.println("FarmMachine is digging."); }
	void grind(){ System.out.println("FarmMachine is grinding."); }
}

public class Java100_oop_Exam002{
	public static void main(String[] args){
		// ��ü ����
		FarmMachine fm = new FarmMachine();
		System.out.println(fm);
		// ��ü�� �Ӽ��� �Է�
		fm.price = 1000;
		fm.year = 2022;
		fm.color = "black";
		// �Ӽ� �� ���
		System.out.println(fm.price);
		System.out.println(fm.year);
		System.out.println(fm.color);
		// ���� ����
		fm.move();
		fm.dig();
		fm.grind();
	}
}