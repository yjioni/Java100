public class Java100_method_MethodCall1{
	public static void sum(int a){
		a += 500;
		System.out.println(a);
	}
	
	public void sum2(int a2){
		a2 += 100;
		System.out.println(a2);
	}
	
	public static void main(String[] args){
		
		int a = 400;
		System.out.println(a);
		
		sum(a);
				
		Java100_method_MethodCall1 jmm = new Java100_method_MethodCall1();
		jmm.sum2(a);
		
	}
}