import java.util.Arrays;

public class Java100_array_Basic005{
	public static void main(String[] args){
		
		int[] sales_table = {302, 404, 400, 404};
		
		for (int i=0; i<sales_table.length; i++){
			System.out.print(sales_table[i] + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(sales_table));
		
	}
}