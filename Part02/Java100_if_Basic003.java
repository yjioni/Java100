public class Java100_if_Basic003{
	public static void main(String[] args){
		
		int kor=60, eng=95, math=80;
		int total_score;
		total_score = kor + eng + math;
		
		if (total_score >= 250){
			System.out.println("Total Score:" + total_score);
			System.out.println("수고하셨습니다.");
		}
		else if (total_score >= 230){
			System.out.println("Total Score:" + total_score);
			System.out.println("조금 더 노력하세요.");
		}
		else {
			System.out.println("Total Score:" + total_score);
			System.out.println("재수강 대상입니다.");
		}
		
	}
}