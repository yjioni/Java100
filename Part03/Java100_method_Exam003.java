public class Java100_method_Exam003{
	public static int returnMethod(){
		int rst = 100;
		rst *= 100;
		return rst;
	}
	public static void main(String[] args){
		int rst;
		rst = returnMethod();
		System.out.println("returnMethod() 호출 후 리턴된 값:" + rst);
		System.out.println(returnMethod());
	}
}