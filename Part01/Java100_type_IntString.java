public class Java100_type_IntString{
	public static void main(String[] args){
		int a = 12345;
		String str = "12345";
		
		// System.out.println(a.length());
		System.out.println(str.length());
		
		String stra = String.valueOf(a);
		System.out.println(stra.length());
		
		System.out.println(stra+11);
		System.out.println(a+11);
		
		int b = Integer.valueOf(stra);
		System.out.println(b);
		System.out.println(b+9);
		
	}
}