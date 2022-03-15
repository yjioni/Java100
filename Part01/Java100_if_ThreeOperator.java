public class Java100_if_ThreeOperator{
	public static void main(String[] args){
		int hour=12;
		int test = hour<=10 ? hour*100: hour; 
		
		System.out.println(test);
		
		String name = hour<12 ? "오전": "오후";
		System.out.println(name);
		
	}
}