public class Java100_if_Basic003{
	public static void main(String[] args){
		
		int kor=60, eng=95, math=80;
		int total_score;
		total_score = kor + eng + math;
		
		if (total_score >= 250){
			System.out.println("Total Score:" + total_score);
			System.out.println("�����ϼ̽��ϴ�.");
		}
		else if (total_score >= 230){
			System.out.println("Total Score:" + total_score);
			System.out.println("���� �� ����ϼ���.");
		}
		else {
			System.out.println("Total Score:" + total_score);
			System.out.println("����� ����Դϴ�.");
		}
		
	}
}