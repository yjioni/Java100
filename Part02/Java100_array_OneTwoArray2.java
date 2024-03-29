import java.util.Arrays;

public class Java100_array_OneTwoArray2{
	public static void main(String[] args){
		String[][] asia_nations = {
			{"한국", "중국", "일본"},
			{"서울", "상하이", "도쿄"}
		};
		
		System.out.println(Arrays.toString(asia_nations));
		
		System.out.println(asia_nations[0][0]);
		System.out.println(asia_nations[0][1]);
		System.out.println(asia_nations[0][2]);
		
		System.out.println(asia_nations[1][0]);
		System.out.println(asia_nations[1][1]);
		System.out.println(asia_nations[1][2]);
		
		System.out.println("배열의 길이: " + asia_nations.length);
		
		System.out.println("------------------------");
		for (int i=0; i<asia_nations.length; i++) {
			System.out.printf("%d번째 행의 길이: %d%n", i, asia_nations[i].length);
		}
	}
}