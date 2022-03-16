import java.util.Arrays;

public class Java100_array_OneTwoArray{
	public static void main(String[] args){
		String[] province = new String[3];
		System.out.println(Arrays.toString(province));
		
		province[0] = "강원도";
		province[1] = "서울";
		province[2] = "제주도";
		System.out.println(Arrays.toString(province));
		
		String[] nation = new String[] {"한국", "중국", "일본"};
		System.out.println(Arrays.toString(nation));
		
		String[] animal = {"강아지", "고양이", "호랑이", "앵무새"};
		System.out.println(Arrays.toString(animal));
		
		for (int i=0; i<animal.length; i++){
			System.out.print(animal[i] + " ");
		}
		System.out.println();
		
		// 향상된 for문
		for (String st: animal){
			System.out.print(st + " ");
		}
		System.out.println();
		
		// 향상된 for문 연습2
		int[] num = {1, 2, 3, 4};
		for (int i: num){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}