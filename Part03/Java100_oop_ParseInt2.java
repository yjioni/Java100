public class Java100_oop_ParseInt2{
	public static void main(String[] args){
		// ���ڳ����� ����
		int a=1, b=10, c=a+b;
		System.out.println("a+b=" + c);
		// ���ڳ����� ����
		String a1="1", b1="10", c1=a1+b1;
		System.out.println("a1+b1=" + c1);
		
		// .getClass() : ���� �����ϰ� �ִ� Ŭ���� Ȯ��
		System.out.println(c1.getClass());
		System.out.println(c1.getClass().getName());
	
		// Integer.parseInt() : ���ڿ� --> ���ڷ� ��ȯ
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		System.out.println("a2+b2=" + (a2+b2));
		
		// Integer.parseInt(���ڿ�, ��ȯ�� ������) : 10���� Integer������ ��ȯ
		System.out.println(Integer.parseInt("2022", 10));
		System.out.println(Integer.parseInt("2022", 8));
		System.out.println(Integer.parseInt("1", 2));
		System.out.println(Integer.parseInt("1001", 2)); // 2���� --> 10����
		System.out.println(Integer.parseInt("1011", 2));
		System.out.println(Integer.parseInt("A", 16));
		System.out.println(Integer.parseInt("FF", 16));
		
	}
}