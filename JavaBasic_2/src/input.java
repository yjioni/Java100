import java.util.Scanner;

class input{
	public static void main(String[] args) {

	    String name;
		int age;
		double gender;
		
		String intro;
		String buffer;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		
		System.out.print("성별을 입력하세요 (남자1, 여자2): ");
		gender = sc.nextDouble();
				
		System.out.print("자기소개를 입력하세요: ");
		buffer = sc.nextLine();
		intro = sc.nextLine();
				
		System.out.println("이름: "+name+"("+age+", "+gender+")");
		System.out.println("자기소개: "+intro);
		
		// String.split(String regex, int limit) 특정 문자 기준으로 자르고, 문자 열로 리턴
		String[] str = intro.split(" ");
		
		for (int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}