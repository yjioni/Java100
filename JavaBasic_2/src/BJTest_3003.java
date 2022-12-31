import java.util.Scanner;

public class BJTest_3003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String piesces = sc.nextLine();
		int k, q, l, b, n, p;
		k = sc.nextInt();
		q = sc.nextInt();
		l = sc.nextInt();
		b = sc.nextInt();
		n = sc.nextInt();
		p = sc.nextInt();		
		
		int K, Q, L, B, N, P;
		K = 1;
		Q = 1;
		L = 2;
		B = 2;
		N = 2;
		P = 8;
		
		System.out.println((K-k) + " " + (Q-q) + " " + (L-l) + " " + (B-b) + " " + (N-n) + " " + (P-p));
		
	}
}
