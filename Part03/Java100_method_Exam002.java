public class Java100_method_Exam002{
	public static void plusMethod(int a, int b){
		System.out.printf("���ڷ� �Ѱܹ޴� 2���� ��: %d, %d%n", a, b);

		int rst = a+b;
		System.out.printf("%d + %d = %d%n", a, b, rst);
	}
	public static void main(String[] args){
		plusMethod(1, 2);
		System.out.println("------------------------------------------");
		
		int a=100, b=200;
		plusMethod(a, b);
	}
}