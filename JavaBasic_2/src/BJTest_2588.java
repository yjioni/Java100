import java.util.Scanner;

public class BJTest_2588 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();

		String tmp = sc.next();	
		String[] tmpNums = tmp.split("(?<=.)");

		for (int i=1; i<=tmpNums.length; i++) {
			int b = Integer.parseInt(tmpNums[tmpNums.length-i]);
			System.out.println(a*b);
		}
		
		int result = a * Integer.parseInt(tmp);
		System.out.println(result);
		
	}
}