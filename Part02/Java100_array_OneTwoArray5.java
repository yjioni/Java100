import java.util.Arrays;

public class Java100_array_OneTwoArray5{
	public static void main(String[] args){
		int[] aaa = new int[10];
		System.out.println(aaa.length);
		
		for (int i=0; i<10; i++){
			aaa[i] = i+1;
		}
		
		System.out.println(Arrays.toString(aaa));
		
		String bbb = "Welcome to Korea!";
		System.out.println(bbb.length());
		
		for (int j=0; j<bbb.length(); j++){
			System.out.print(bbb.charAt(j) + " ");
		}
		System.out.println();
	}
}