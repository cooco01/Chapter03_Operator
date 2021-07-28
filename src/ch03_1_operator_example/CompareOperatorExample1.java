package ch03_1_operator_example;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
//		boolean result1 = (num1 == num2);
//		boolean result2 = (num1 != num2);
//		boolean result3 = (num1 <= num2);
//		System.out.println("result1=" + result1);
//		System.out.println("result2=" + result2);
//		System.out.println("result3=" + result3);

		System.out.printf("result1: %b\n", num1 == num2);
		System.out.printf("result2: %b\n", num1 != num2);
		System.out.printf("result3: %b\n", num1 <= num2);
		
		
		
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4);
	}
}
