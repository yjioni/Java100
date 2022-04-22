import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Collections;

public class MyLotto{
	
	// 사용자 입력 함수
	static ArrayList<Integer> inputNumber(){
		// [1]변수 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~50 사이의 번호를 입력하세요: ");
		String user = scanner.nextLine();
	
		// [2]쉼표로 분리 & 형변환 & 유효값 확인 
		String[] str = user.split("\\s*,\\s*");
		ArrayList<Integer> userAL = new ArrayList<Integer>();
		for (int i=0;i<str.length;i++){ 
			int temp = Integer.parseInt(str[i]);
			if (temp>0 && temp<51){
				userAL.add(temp); 
			}
			else { System.out.print("입력하신 숫자" + temp + "는 범위 초과로 삭제합니다.");}
		}
		
		return userAL;
	}
	
	// 중복 제거 함수
	static ArrayList<Integer> deleteSameNumber(ArrayList<Integer> userAL){		
		
		ArrayList<Integer> lottoAL = new ArrayList<Integer>();
		
		for (int i=0;i<userAL.size();i++){
			if (!lottoAL.contains( userAL.get(i) )){ lottoAL.add( userAL.get(i) ); }
		}
		
		return lottoAL;
	}
	
	// 자동 번호 함수
	static ArrayList<Integer> autoNumber(ArrayList<Integer> lottoAL){
		// 요소가 6개 이하면, 추가
		while (lottoAL.size()<6){
			lottoAL.add((int)(Math.random() * 50 +1 ));
		}
		return lottoAL;
	}

	// 출력 저장 함수
	static void printSave(ArrayList<Integer> lottoAL, String addr){
		// 오름차순 정렬 
		Collections.sort(lottoAL);
	
		// [6].txt로 저장하기 
		try{
			File file = new File(addr); // 파라미터 addr
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
		// 사용자 입력 ArrayList
		ArrayList<Integer> userInput = new ArrayList<Integer>();
		userInput = inputNumber();
		
		System.out.println("사용자 입력 번호: " + userInput);
		
		// 자동 번호 추가 입력 ArrayList
		ArrayList<Integer> compNumber = new ArrayList<Integer>();
		
		while (compNumber.size() < 6){
			compNumber = autoNumber(userInput); 
			compNumber = deleteSameNumber(compNumber); // 중복 제거
		}
		
		System.out.println("최종 로또 번호: " + compNumber);
		
		// 출력 및 저장
		
		String addr = "C:\\Users\\admin\\Documents\\Java\\theBeeSoft\\MyLotto.txt";
		printSave(compNumber, addr);
		System.out.println("저장 위치: " + addr);
		System.out.println("저장한 로또 번호: " + compNumber);
		
		
	}
}