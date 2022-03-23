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
		// 객체 생성
		FarmMachine fm = new FarmMachine();
		System.out.println(fm);
		// 객체 속성 입력
		fm.price = 2000;
		fm.year = 2022;
		fm.color = "red";
		// 객체 속성 출력
		// [1] 새로운 객체로 받기
		String fm_price = String.format("%,d", fm.price);
		System.out.println(fm_price);
		// [2] 바로 String.format() 메서드 사용
		System.out.println(String.format("%,d", fm.year));
		// 객체 동작 입력
		fm.move();
		fm.dig();
		fm.grind();
	}
}