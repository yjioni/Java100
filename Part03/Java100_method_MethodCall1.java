public class Java100_method_MethodCall1{
	public static void sum(int a){
		a += 500;
		System.out.println(a);
	}
	
	public static void main(String[] args){
		int a = 400;
		sum(a);
		System.out.println(a);
	}
}