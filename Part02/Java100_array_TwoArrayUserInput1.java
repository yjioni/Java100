import java.util.Scanner;
import java.util.Arrays;

public class Java100_array_TwoArrayUserInput1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 개수를 입력하고 [Enter] 입력: ");
		int R = sc.nextInt();
		System.out.print("열의 개수를 입력하고 [Enter] 입력: ");
		int C = sc.nextInt();
		
		char[][] userMap = new char[R][C];
		
		String[] strAr = new String[R];
		System.out.println(Arrays.toString(strAr));
		
		for (int i=0; i<R; i++){
			System.out.printf("%d번째 행에 입력할 문자%d개를 차례대로 입력 후 [Enter] 입력: ", i+1, R);
			strAr[i] = sc.next();
			for (int j=0; j<C; j++){
				userMap[i][j] = strAr[i].charAt(j);
			}
		}
		
		System.out.println("-------------------------");
		System.out.println("배열 참조주소: " + strAr);
		System.out.println("사용자 입력값: " + Arrays.toString(strAr));
		
		System.out.println("-------------------------");
		for (int k=0;k<R;k++){
			for (int l=0;l<C;l++){System.out.print(userMap[k][l] + " ");}
			System.out.println();
		}
		
	}
}