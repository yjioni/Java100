import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Collections;

public class MyLotto1{
	public static void main(String[] args){
		// [1]변수 생성: 사용자 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~50 사이의 번호를 입력하세요: ");
		String user = scanner.nextLine();
		
		// [2]쉼표로 분리 & 형변환
		String[] str = user.split("\\s*,\\s*");
		// ArrayList 선언
		ArrayList<Integer> userAL = new ArrayList<Integer>();
		//형변환 하면서 ArrayList에 넣기
		for (int i=0;i<str.length;i++){ userAL.add(Integer.parseInt(str[i])); }
		
		// [3]중복 제거
		ArrayList<Integer> lottoAL = new ArrayList<Integer>();
		
		for (int i=0;i<userAL.size();i++){
			// System.out.println(userAL.get(i));
			if (!lottoAL.contains( userAL.get(i) )){ lottoAL.add( userAL.get(i) ); }
		}
		
		// [4]요소 값이 6 이하이면, 랜덤숫자 추가
		while (lottoAL.size()<6){
			lottoAL.add((int)(Math.random() * 50 +1 ));
		}
		// 확인 출력
		// System.out.println("---------");
		// for (int i=0;i<lottoAL.size();i++){ System.out.print(lottoAL.get(i) +" "); }
		// System.out.println("---------");
		System.out.println();
		
		// [5]오름차순 정렬 
		Collections.sort(lottoAL);
		
		// [6].txt로 저장하기 
		String fileNm = "C:\\Users\\oing9\\Desktop\\date_file.txt";
		try{
			File file = new File(fileNm);
			BufferedWriter fileWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			
			for (int i=0; i<lottoAL.size(); i++){
				String text = Integer.toString(lottoAL.get(i));
				text += " ";
				fileWrite.write(text);
				// 확인 출력
				// System.out.print(lottoAL.get(i) + " ");
			}
			
			fileWrite.flush(); 
			fileWrite.close();
			} catch (Exception e){
				e.printStackTrace(); 
			}
		}
	}