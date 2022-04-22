import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Collections;

public class MyLotto{
	
	// ����� �Է� �ޱ� > ArrayList<Integer>
	public static ArrayList<Integer> userInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~50 ������ ���ڸ� ��ǥ(,)�� �̿��� �Է��ϼ���: ");
		String userNum = scanner.nextLine();
		// ��ǥ ���� �и� �۾�
		String[] userNums = userNum.split("\\s*,\\s*");
		
		// ����ȯ ���� �迭
		ArrayList<Integer> userNumsArr = new ArrayList<Integer>();
		// ����ȯ: String --> Integer
		for (int i=0;i<userNums.length;i++){
			userNumsArr.add(Integer.parseInt(userNums[i]));
		}
		
		return userNumsArr;
	}
	
	// �迭 ����: ����!(1~50)���� > �ߺ������� > ����
	public static ArrayList<Integer> checkNums(ArrayList<Integer> userNumsArr){ 
		ArrayList<Integer> checkedNums = new ArrayList<Integer>();
		
		for (int i=0;i<userNumsArr.size();i++){
			// ���� Ȯ��
			int temp = userNumsArr.get(i);
			
			if (temp>0 && temp<51){
				if (!checkedNums.contains(temp)){checkedNums.add(temp);}
			}
		}
		// �������� ����
		Collections.sort(checkedNums);
		
		// Ȯ�� ���
		// System.out.print("������ ��ȣ: ");
		// for (int i=0; i<checkedNums.size(); i++){System.out.print(checkedNums.get(i) +" ");}
		// System.out.println();
		
		return checkedNums; 
	}
	
	// txt���� ����
	public static void saveFile(Integer[][] finLotto, String addr){
		String fileNm = addr;
		try{
			File file = new File(fileNm);
			BufferedWriter fileWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			
			for (int i=0; i<finLotto.length; i++){
				for (int j=0; j<finLotto[i].length; j++){
					String text = Integer.toString(finLotto[i][j]);
					text += " ";
					fileWrite.write(text);
				}
				fileWrite.newLine();
			}
			
			fileWrite.flush(); 
			fileWrite.close();
			} 
			catch (Exception e){
				e.printStackTrace(); 
			}
	}
	
	// ArrayList --> Array�� ����
	// public static Integer[][] changeArray(ArrayList<Integer> checkedNums){
		// return 1;
	// }
	
	// ���� �޼���
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ζǸ� ���� �����Ͻðڽ��ϱ�? : ");
		int cnt = Integer.parseInt(scanner.nextLine());
				
		Integer[][] finLotto = new Integer[cnt][0];
		
		for (int j=0; j<cnt; j++){
			// [1] Array ���� ���� - ����� �Է� �ޱ�
			ArrayList<Integer> userNums = userInput();
			
			System.out.print("����ڰ� �Է��� ��: ");
			for(int i : userNums){System.out.print(i + " ");}
			System.out.println();
			
			// [2] ����� �Է� �迭 ����
			ArrayList<Integer> checked = checkNums(userNums);
			
			System.out.print("��ȿ ��: ");
			for(int i : checked){System.out.print(i + " ");}
			System.out.println();
			
			System.out.println("-------------------------------");
			int n = 6-checked.size();
			System.out.println("������ " + n + "�� ���ڴ� �ڵ� ��÷�մϴ�.");
			
			
			// [3] �ζ� �迭 �����
			int count = 0;
			while (checked.size()<6){
				// ���� �� �߰�
				int tmp = (int)(Math.random()*50+1);
				
				if(!checked.contains(tmp)){
					checked.add(tmp);
				}
			}
			Collections.sort(checked);
			
			System.out.print("���� �ζ� ��ȣ: ");
			for(int i : checked){System.out.print(i + " ");}
			System.out.println();
			System.out.println();
			
			// 2�� �迭�� �ֱ�
			Integer[] ar = checked.toArray(new Integer[6]);
			finLotto[j] = ar;
		}
		
		System.out.println();
		System.out.println("------------->> �ζ� <<--------------");
		
		for (int i=0; i<finLotto.length; i++){
			for (int j=0; j<finLotto[i].length; j++){
				System.out.print(finLotto[i][j] + " "); 
			}
			System.out.println();
		}
		
		// [4] txt ���� ����
		String addr = "C:\\Users\\oing9\\Desktop\\lotto.txt";
		saveFile(finLotto, addr);
		
		}
}