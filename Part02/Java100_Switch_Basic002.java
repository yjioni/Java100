public class Java100_Switch_Basic002{
	public static void main(String[] args){
		
		int age=20;
		
		if (age>10 && age<20){
			System.out.println("10������ �Է����ּ���. ���α׷� ����");
			System.exit(0);
		}
		else if (age>20 && age<30){
			System.out.println("10������ �Է����ּ���. ���α׷� ����");
			System.exit(0);
		}
		
		switch(age) {
			case 10:
				System.out.println("�ڽ��� �ڳʴ� A����");
				break;
			case 20:
				System.out.println("����ũ �ڳʴ� B����");
				break;
			case 30:
				System.out.println("������ �ڳʴ� C����");
				break;
			default:
				System.out.println(age+"�� �Դϴ�. �����մϴ�.");
				break;
		}
		
	}
}