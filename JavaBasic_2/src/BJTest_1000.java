// #1000. A+B

 // 1 2
 // 3
 
 
 import java.util.Scanner;
 
 public class BJTest_1000{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ip;
		
		str = sc.next();  >이 경우, 1자만 저장
		ip = sc.nextLine();
		System.out.println(ip);
		
		int sum=0;
		
		String[] ip_list= ip.split(" ");
		for (int i=0; i<ip_list.length; i++){
			sum += Integer.parseInt(ip_list[i]);
		}
						
		System.out.println(sum);
		
		// Scanner sc = new Scanner(System.in);
		// int a, b;
		// a = sc.nextInt();
		// b = sc.nextInt();
		// System.out.println(a+b);
	}
 }