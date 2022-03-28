public class GuGu {
	
	public static void dan(int n) {
		for (int i=1; i<10; i++){ 
		System.out.printf("%d * %d = %d%n", n, i, n*i); 
		} 
	}
	
	public static void main(String[] args){
		GuGu gugu = new GuGu();
		
		for (int i=2; i<10; i++){ 
			GuGu.dan(i);
			System.out.println();
		}
	}
}