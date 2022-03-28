public class JumpToJava_equal{
	public static void main(String[] args){
		String a = "Hello";
		String b = "Java";
		
		System.out.println(a.equals(b));
		
		String c = new String("Hello");
		System.out.println(a.equals(c));
		
		System.out.println(a == b);
	}
}