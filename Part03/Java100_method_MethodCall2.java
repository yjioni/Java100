public class Java100_method_MethodCall2{
	public static void sum(Integer a){
		a += 500;
		System.out.println(a);
	}
	
	
	public static void main(String[] args){
		Integer a = new Integer(100);
		sum(a);
		System.out.println(a);
	}
}