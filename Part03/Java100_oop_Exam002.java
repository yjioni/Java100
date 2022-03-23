class FarmMachine{
	// Attribute 속성
	int price;
	int year;
	String color;
	// Method 동작
	void move(){ System.out.println("FarmMachine is moving."); }
	void dig(){ System.out.println("FarmMachine is digging."); }
	void grind(){ System.out.println("FarmMachine is grinding."); }
}

public class Java100_oop_Exam002{
	public static void main(String[] args){
		// 객체 생성
		FarmMachine fm = new FarmMachine();
		System.out.println(fm);
		// 객체에 속성값 입력
		fm.price = 1000;
		fm.year = 2022;
		fm.color = "black";
		// 속성 값 출력
		System.out.println(fm.price);
		System.out.println(fm.year);
		System.out.println(fm.color);
		// 동작 수행
		fm.move();
		fm.dig();
		fm.grind();
	}
}