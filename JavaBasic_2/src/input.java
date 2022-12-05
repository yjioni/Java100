import java.util.Scanner;

class input{
	public static void main(String[] args) {

	    String name;
		int age;
		double height;
		
		String intro;
		String buffer;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		System.out.println();
		
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		System.out.println();
		
		System.out.print("키를 입력하세요: ");
		height = sc.nextDouble();
		System.out.println();
		
		System.out.print("자기소개를 입력하세요: ");
		buffer = sc.nextLine();
		intro = sc.nextLine();
		System.out.println();
		
		System.out.println("이름: "+name+", 나이: "+age+", 키: "+height);
		System.out.println("자기소개: "+intro);

	}
}