public class Java100_Switch_Basic001 {
	public static void main(String[] args){
		
	int age=20;
	
	if (age>10 && age<20) {
		System.out.println("10���� �Է��ϼ���. ���α׷� ����.");
		System.exit(0);
	} 
	
	else if (age>20 && age<30) {
		System.out.println("20���� �Է��ϼ���. ���α׷� ����.");
		System.exit(0);
	}
	else {
		if (age < 10){
			System.out.println("10 �Ǵ� 20 �Է�. ���α׷� ����.");
			System.exit(0);
		}
	}

	
	switch(age){
		case 10:
			System.out.println(age + " >> ���� �ڳʴ� A�� �Դϴ�.");
			break;
		
		case 20:
			System.out.println(age+ " >> ����ũ ������ B���� �ֽ��ϴ�.");
			break;
		
		default:
			System.out.println(age+ ">> ��õ ������ 10, 20�븸 �����մϴ�. ���α׷� ����.");
			break;
		}
	}
}