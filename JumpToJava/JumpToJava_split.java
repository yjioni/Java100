import java.util.Arrays;

public class JumpToJava_split{
	public static void main(String[] args){
		String c = "Hello, Java";
		String[] result = c.split(",");
		
		System.out.println(Arrays.toString(result));
	}
}