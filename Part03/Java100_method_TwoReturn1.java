import java.util.Arrays;

public class Java100_method_TwoReturn1{
	public static int[] testMethod(){
		int num1=100, num2=200, num3=300;
		return new int[]{num1, num2, num3};
	}
	
	
	public static void main(String[] args){
		int rst[] = testMethod();
		
		// �迭 index�� ����ϱ�
		System.out.println(rst[0]);
		System.out.println(rst[1]);
		System.out.println(rst[2]);
		
		// for�� ����ؼ� �迭 ����ϱ�
		for (int i=0;i<rst.length;i++){
			System.out.print(rst[i] + " ");
		}
		System.out.println();
		
		// �迭 �ѹ��� ����ϱ�
		System.out.println(Arrays.toString(rst));
		
		// ���� �ּ� ���
		System.out.println(rst);
		
		
	}
}