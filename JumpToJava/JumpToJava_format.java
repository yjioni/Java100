public class JumpToJava_format{
	public static void main(String[] args){
		System.out.println(String.format("왼쪽정렬:  %10s Jane", "hi"));
		System.out.println(String.format("오른쪽정렬: %-10s Jane", "hi"));
		
		System.out.println(String.format("%.4f", 3.42134234));
		System.out.println(String.format("%10.4f", 3.42134234));
	}
}