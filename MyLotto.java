import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Collections;

public class MyLotto1{
	public static void main(String[] args){
		// [1]���� ����: ����� �Է�
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~50 ������ ��ȣ�� �Է��ϼ���: ");
		String user = scanner.nextLine();
		
		// [2]��ǥ�� �и� & ����ȯ
		String[] str = user.split("\\s*,\\s*");
		// ArrayList ����
		ArrayList<Integer> userAL = new ArrayList<Integer>();
		//����ȯ �ϸ鼭 ArrayList�� �ֱ�
		for (int i=0;i<str.length;i++){ userAL.add(Integer.parseInt(str[i])); }
		
		// [3]�ߺ� ����
		ArrayList<Integer> lottoAL = new ArrayList<Integer>();
		
		for (int i=0;i<userAL.size();i++){
			// System.out.println(userAL.get(i));
			if (!lottoAL.contains( userAL.get(i) )){ lottoAL.add( userAL.get(i) ); }
		}
		
		// [4]��� ���� 6 �����̸�, �������� �߰�
		while (lottoAL.size()<6){
			lottoAL.add((int)(Math.random() * 50 +1 ));
		}
		// Ȯ�� ���
		// System.out.println("---------");
		// for (int i=0;i<lottoAL.size();i++){ System.out.print(lottoAL.get(i) +" "); }
		// System.out.println("---------");
		System.out.println();
		
		// [5]�������� ���� 
		Collections.sort(lottoAL);
		
		// [6].txt�� �����ϱ� 
		String fileNm = "C:\\Users\\oing9\\Desktop\\date_file.txt";
		try{
			File file = new File(fileNm);
			BufferedWriter fileWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			
			for (int i=0; i<lottoAL.size(); i++){
				String text = Integer.toString(lottoAL.get(i));
				text += " ";
				fileWrite.write(text);
				// Ȯ�� ���
				// System.out.print(lottoAL.get(i) + " ");
			}
			
			fileWrite.flush(); 
			fileWrite.close();
			} catch (Exception e){
				e.printStackTrace(); 
			}
		}
	}