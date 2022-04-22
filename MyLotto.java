import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Collections;

public class MyLotto{
	
	// ����� �Է� �Լ�
	static ArrayList<Integer> inputNumber(){
		// [1]���� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~50 ������ ��ȣ�� �Է��ϼ���: ");
		String user = scanner.nextLine();
	
		// [2]��ǥ�� �и� & ����ȯ & ��ȿ�� Ȯ�� 
		String[] str = user.split("\\s*,\\s*");
		ArrayList<Integer> userAL = new ArrayList<Integer>();
		for (int i=0;i<str.length;i++){ 
			int temp = Integer.parseInt(str[i]);
			if (temp>0 && temp<51){
				userAL.add(temp); 
			}
			else { System.out.print("�Է��Ͻ� ����" + temp + "�� ���� �ʰ��� �����մϴ�.");}
		}
		
		return userAL;
	}
	
	// �ߺ� ���� �Լ�
	static ArrayList<Integer> deleteSameNumber(ArrayList<Integer> userAL){		
		
		ArrayList<Integer> lottoAL = new ArrayList<Integer>();
		
		for (int i=0;i<userAL.size();i++){
			if (!lottoAL.contains( userAL.get(i) )){ lottoAL.add( userAL.get(i) ); }
		}
		
		return lottoAL;
	}
	
	// �ڵ� ��ȣ �Լ�
	static ArrayList<Integer> autoNumber(ArrayList<Integer> lottoAL){
		// ��Ұ� 6�� ���ϸ�, �߰�
		while (lottoAL.size()<6){
			lottoAL.add((int)(Math.random() * 50 +1 ));
		}
		return lottoAL;
	}

	// ��� ���� �Լ�
	static void printSave(ArrayList<Integer> lottoAL, String addr){
		// �������� ���� 
		Collections.sort(lottoAL);
	
		// [6].txt�� �����ϱ� 
		try{
			File file = new File(addr); // �Ķ���� addr
			BufferedWriter fileWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			
			for (int i=0; i<lottoAL.size(); i++){
				String text = Integer.toString(lottoAL.get(i));
				text += " ";
				fileWrite.write(text);
			}
			
			fileWrite.flush(); 
			fileWrite.close();
			} catch (Exception e){
				e.printStackTrace(); 
		}
	}
	
	public static void main(String[] args){
		// ����� �Է� ArrayList
		ArrayList<Integer> userInput = new ArrayList<Integer>();
		userInput = inputNumber();
		
		System.out.println("����� �Է� ��ȣ: " + userInput);
		
		// �ڵ� ��ȣ �߰� �Է� ArrayList
		ArrayList<Integer> compNumber = new ArrayList<Integer>();
		
		while (compNumber.size() < 6){
			compNumber = autoNumber(userInput); 
			compNumber = deleteSameNumber(compNumber); // �ߺ� ����
		}
		
		System.out.println("���� �ζ� ��ȣ: " + compNumber);
		
		// ��� �� ����
		
		String addr = "C:\\Users\\admin\\Documents\\Java\\theBeeSoft\\MyLotto.txt";
		printSave(compNumber, addr);
		System.out.println("���� ��ġ: " + addr);
		System.out.println("������ �ζ� ��ȣ: " + compNumber);
		
		
	}
}