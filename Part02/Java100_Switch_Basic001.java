public class Java100_Switch_Basic001{
	public static void main(String[] args){
		
		// ���� ������ �������̾�� �Ѵ�.
		// byte, short, int (longŸ�� ����) + char
		// break, default ������ �ʵ��� ����
		
		int age=10;
				
		
		switch(age) {
			case 10:
				System.out.println(age+"���Դϴ�. ������ A������ �ֽ��ϴ�.");
				break;
				
			case 20:
				System.out.println(age+"�� �Դϴ�. ����ũ ���� å�ڴ� B������ �ֽ��ϴ�.");
				break;
			default:
				System.out.println("���̸� �ٽ� Ȯ�����ּ���.");
				break;
		}
		
		
		
	}
}