import java.util.Scanner;
import java.util.Arrays;

public class Java100_array_TwoArrayUserInput1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϰ� [Enter] �Է�: ");
		int R = sc.nextInt();
		System.out.print("���� ������ �Է��ϰ� [Enter] �Է�: ");
		int C = sc.nextInt();
		
		char[][] userMap = new char[R][C];
		
		String[] strAr = new String[R];
		System.out.println(Arrays.toString(strAr));
		
		for (int i=0; i<R; i++){
			System.out.printf("%d��° �࿡ �Է��� ����%d���� ���ʴ�� �Է� �� [Enter] �Է�: ", i+1, R);
			strAr[i] = sc.next();
			for (int j=0; j<C; j++){
				userMap[i][j] = strAr[i].charAt(j);
			}
		}
		
		System.out.println("-------------------------");
		System.out.println("�迭 �����ּ�: " + strAr);
		System.out.println("����� �Է°�: " + Arrays.toString(strAr));
		
		System.out.println("-------------------------");
		for (int k=0;k<R;k++){
			for (int l=0;l<C;l++){System.out.print(userMap[k][l] + " ");}
			System.out.println();
		}
		
	}
}