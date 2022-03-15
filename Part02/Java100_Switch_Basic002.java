public class Java100_Switch_Basic002{
	public static void main(String[] args){
		
		int age=20;
		
		if (age>10 && age<20){
			System.out.println("10단위로 입력해주세요. 프로그램 종료");
			System.exit(0);
		}
		else if (age>20 && age<30){
			System.out.println("10단위로 입력해주세요. 프로그램 종료");
			System.exit(0);
		}
		
		switch(age) {
			case 10:
				System.out.println("자습서 코너는 A구역");
				break;
			case 20:
				System.out.println("재태크 코너는 B구역");
				break;
			case 30:
				System.out.println("에세이 코너는 C구역");
				break;
			default:
				System.out.println(age+"대 입니다. 감사합니다.");
				break;
		}
		
	}
}