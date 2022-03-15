public class Java100_Switch_Basic001{
	public static void main(String[] args){
		
		// 변수 조건은 정수형이어야 한다.
		// byte, short, int (long타입 제외) + char
		// break, default 빼먹지 않도록 주의
		
		int age=10;
				
		
		switch(age) {
			case 10:
				System.out.println(age+"대입니다. 참고서는 A구역에 있습니다.");
				break;
				
			case 20:
				System.out.println(age+"대 입니다. 재태크 관련 책자는 B구역에 있습니다.");
				break;
			default:
				System.out.println("나이를 다시 확인해주세요.");
				break;
		}
		
		
		
	}
}