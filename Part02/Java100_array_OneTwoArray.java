import java.util.Arrays;

public class Java100_array_OneTwoArray{
	public static void main(String[] args){
		String[] province = new String[3];
		System.out.println(Arrays.toString(province));
		
		province[0] = "������";
		province[1] = "����";
		province[2] = "���ֵ�";
		System.out.println(Arrays.toString(province));
		
		String[] nation = new String[] {"�ѱ�", "�߱�", "�Ϻ�"};
		System.out.println(Arrays.toString(nation));
		
		String[] animal = {"������", "�����", "ȣ����", "�޹���"};
		System.out.println(Arrays.toString(animal));
		
		for (int i=0; i<animal.length; i++){
			System.out.print(animal[i] + " ");
		}
		System.out.println();
		
		// ���� for��
		for (String st: animal){
			System.out.print(st + " ");
		}
		System.out.println();
		
		// ���� for�� ����2
		int[] num = {1, 2, 3, 4};
		for (int i: num){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}