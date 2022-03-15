public class Java100_while_WithIf{
	public static void main(String[] args){
		int num = 1;
		while (num<29){
			// System.out.print(num + " ");
			
			// Á¶°Ç¹®
			if (num%2 == 0) {
				System.out.print(num + " ");
			}
			num++;
		}
		System.out.println();
	}
}