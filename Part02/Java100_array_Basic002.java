public class Java100_array_Basic002{
	public static void main(String[] args){
		
		int[] scores = new int[10];
		int s_size = scores.length;
		
		System.out.println(s_size);
		scores[9] = 100;
		
		System.out.println(scores[s_size-1]);
		
	}
}