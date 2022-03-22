import java.util.Arrays;

public class Java100_method_TwoReturn2{
	
	// input 값도 있고, return 값도 있음.
	public static String[] capitalMethod(String a, String b){
		String a_up = a.toUpperCase();
		String b_low = b.toLowerCase();
		
		System.out.println(a);
		System.out.println(b);
		
		String[] rst = {a_up, b_low};
		return rst;
	}
	
	public static void main(String[] args){
		String[] result = capitalMethod("korea", "USA");
		System.out.println(result);
		System.out.println(Arrays.toString(result));
	}
}