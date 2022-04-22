import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Collections;

public class MyLotto{
	
	// 사용자 입력 받기 > ArrayList<Integer>
	public static ArrayList<Integer> userInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~50 사이의 숫자를 쉼표(,)를 이용해 입력하세요: ");
		String userNum = scanner.nextLine();
		// 쉼표 기준 분리 작업
		String[] userNums = userNum.split("\\s*,\\s*");
		
		// 형변환 저장 배열
		ArrayList<Integer> userNumsArr = new ArrayList<Integer>();
		// 형변환: String --> Integer
		for (int i=0;i<userNums.length;i++){
			userNumsArr.add(Integer.parseInt(userNums[i]));
		}
		
		return userNumsArr;
	}
	
	// 배열 점검: 숫자!(1~50)제거 > 중복값제거 > 정렬
	public static ArrayList<Integer> checkNums(ArrayList<Integer> userNumsArr){ 
		ArrayList<Integer> checkedNums = new ArrayList<Integer>();
		
		for (int i=0;i<userNumsArr.size();i++){
			// 숫자 확인
			int temp = userNumsArr.get(i);
			
			if (temp>0 && temp<51){
				if (!checkedNums.contains(temp)){checkedNums.add(temp);}
			}
		}
		// 오름차순 정렬
		Collections.sort(checkedNums);
		
		// 확인 출력
		// System.out.print("조정된 번호: ");
		// for (int i=0; i<checkedNums.size(); i++){System.out.print(checkedNums.get(i) +" ");}
		// System.out.println();
		
		return checkedNums; 
	}
	
	// txt파일 저장
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
	
	// ArrayList --> Array로 변경
	// public static Integer[][] changeArray(ArrayList<Integer> checkedNums){
		// return 1;
	// }
	
	// 메인 메서드
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("로또를 몇장 구매하시겠습니까? : ");
		int cnt = Integer.parseInt(scanner.nextLine());
				
		Integer[][] finLotto = new Integer[cnt][0];
		
		for (int j=0; j<cnt; j++){
			// [1] Array 변수 생성 - 사용자 입력 받기
			ArrayList<Integer> userNums = userInput();
			
			System.out.print("사용자가 입력한 값: ");
			for(int i : userNums){System.out.print(i + " ");}
			System.out.println();
			
			// [2] 사용자 입력 배열 점검
			ArrayList<Integer> checked = checkNums(userNums);
			
			System.out.print("유효 값: ");
			for(int i : checked){System.out.print(i + " ");}
			System.out.println();
			
			System.out.println("-------------------------------");
			int n = 6-checked.size();
			System.out.println("나머지 " + n + "개 숫자는 자동 추첨합니다.");
			
			
			// [3] 로또 배열 만들기
			int count = 0;
			while (checked.size()<6){
				// 랜덤 값 추가
				int tmp = (int)(Math.random()*50+1);
				
				if(!checked.contains(tmp)){
					checked.add(tmp);
				}
			}
			Collections.sort(checked);
			
			System.out.print("최종 로또 번호: ");
			for(int i : checked){System.out.print(i + " ");}
			System.out.println();
			System.out.println();
			
			// 2차 배열에 넣기
			Integer[] ar = checked.toArray(new Integer[6]);
			finLotto[j] = ar;
		}
		
		System.out.println();
		System.out.println("------------->> 로또 <<--------------");
		
		for (int i=0; i<finLotto.length; i++){
			for (int j=0; j<finLotto[i].length; j++){
				System.out.print(finLotto[i][j] + " "); 
			}
			System.out.println();
		}
		
		// [4] txt 파일 저장
		String addr = "C:\\Users\\oing9\\Desktop\\lotto.txt";
		saveFile(finLotto, addr);
		
		}
}