import java.util.Arrays;

public class Java100_array_Basic003{
	public static void main(String[] args){
		
		int[] sales_table = new int[5];
		
		sales_table[0] = 99;
		sales_table[2] = 380;
		sales_table[sales_table.length - 1] = 100;
		
		System.out.println(sales_table[sales_table.length - 1]);
		System.out.println(Arrays.toString(sales_table));
		
		for (int i=0;i<sales_table.length;i++){
			System.out.print(sales_table[i] + " ");
		}
		System.out.println();
	}
}