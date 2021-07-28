package ch03_1_operator_example;

public class BitOperation {
	public static void main(String[] args) {
		
		int a = 9;
		int b = 11;
		
//		String str = "71";
//		int num = Integer.parseInt(str);
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("10진수: " + (a & b));
		System.out.println("10진수: " + (a | b));

		System.out.println("3<<2: " + (a | b));
		
	}
}
