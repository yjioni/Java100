public class Java100_Switch_Basic001 {
	public static void main(String[] args){
		
	int age=20;
	
	if (age>10 && age<20) {
		System.out.println("10으로 입력하세요. 프로그램 종료.");
		System.exit(0);
	} 
	
	else if (age>20 && age<30) {
		System.out.println("20으로 입력하세요. 프로그램 종료.");
		System.exit(0);
	}
	else {
		if (age < 10){
			System.out.println("10 또는 20 입력. 프로그램 종료.");
			System.exit(0);
		}
	}

	
	switch(age){
		case 10:
			System.out.println(age + " >> 참고서 코너는 A열 입니다.");
			break;
		
		case 20:
			System.out.println(age+ " >> 재태크 서적은 B열에 있습니다.");
			break;
		
		default:
			System.out.println(age+ ">> 추천 서적은 10, 20대만 가능합니다. 프로그램 종료.");
			break;
		}
	}
}