public class Java100_method_ExamStatic3{
	
	public static void sum( int a ){
		a += 500;
		System.out.println(a);
	}
	
	public static void main(String[] args){
		int a = 100;
		System.out.print("sum() method ȣ������ �� a: ");
		sum(a);
	
		System.out.println("�׳� a ȣ������ ��: " + a);
	}
}