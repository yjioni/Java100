class TestNumber{
	int num;
	TestNumber(int num){
		this.num = num;
	}
}

public class Java100_method_MethodCall3{
	public static void sum(TestNumber a){
		System.out.println("TestNumber a=(������) " + a);
		System.out.println("a.num: " + a.num);
		
		a.num += 1000;
		System.out.println("a.num: " + a.num);
	}
	
	public static void main(String[] args){
		TestNumber a = new TestNumber(100);
		sum(a);
		System.out.println("main �޼��� ������ a.num: " + a.num);
	}
}