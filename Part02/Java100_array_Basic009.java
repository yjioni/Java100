import java.util.Arrays;

public class Java100_array_Basic009{
	public static void main(String[] args){
		
		int[] ar = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(ar));
		int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(ar2));
		
		int[] ar_copy;
		
		// System.arraycopy(������, ������-�����ε���, �ٿ��ֱ� ���, �ٿ��ֱ�-�����ε���, �迭����);
		System.arraycopy(ar, 1, ar2, 4, 3);
		System.out.println(Arrays.toString(ar2));		
	}
}