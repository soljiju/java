package sub2;

public class DataTypeTest {
	public static void main(String[] args) {
		
		//정수형
		byte  num1 = 127;
		short num2 = 32767;
		int   num3 = 2147483647;
		long  num4 = 922337203685477507L;
		
		System.out.println("num1 : " + num1);
		System.out.println("num1 : " + num2);
		System.out.println("num1 : " + num3);
		System.out.println("num1 : " + num4);
				
		//실수형
		float  var1 = 0.123456789f;
		double var2 = 0.123456789123456789;
		
		System.out.println("var1 :" + var1); // 소수점 8자리까지 출력
		System.out.println("var1 :" + var2); // 소수점 17자리까지 출력
		
		//논리형
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println("data1 :" + data1);
		System.out.println("data1 :" + data2);
		
		
		//문자형
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 : " + c1);
		System.out.println("c1 : " + c2);
		
		
		//문자열
		String word1 = "A";
		String word2 = "가";
		String word3 = "Apple";
		String word4 = "가을";
		
		System.out.println("word1 : " + word1);
		System.out.println("word1 : " + word2);
		System.out.println("word1 : " + word3);
		System.out.println("word1 : " + word4);
		
	}
}
