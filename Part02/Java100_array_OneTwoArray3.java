import java.util.Arrays;

public class Java100_array_OneTwoArray3{
	public static void main(String[] args){
		
		String[][] asia_nations = {
			{"한국", "일본", "중국"},
			{"태국", "베트남", "미얀마"}
		};
		
		System.out.println(Arrays.toString(asia_nations));
		
		for (int i=0; i<asia_nations.length; i++){
			for (int j=0; j<asia_nations[i].length; j++){
				System.out.print(asia_nations[i][j] + " ");
			}
			System.out.println();
		}
	}
}