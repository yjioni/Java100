import java.util.Arrays;

public class Java100_array_OneTwoArray4{
	public static void main(String[] args){
		String[] strAr = {"김영어", "이국어", "박수학"};
		System.out.println(strAr[0].charAt(1)); // 영
		
		// System.out.println(strAr[0].length());
		for (int i=0; i<strAr.length; i++){
			for (int j=0; j<strAr[i].length(); j++){
				System.out.print(strAr[i].charAt(j));
			}
			System.out.println();
		}
	}
}