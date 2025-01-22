package chapter3;
//p88 연습문제

//Q1
public class OperationEx1 {
 public static void main(String[] args) {
	int myAge = 23; //myAge 변수에 값 23을 대입할 때 사용하는 연산자
	int teacherAge = 38;
	
	boolean value = (myAge >25);
	System.out.println(value);
	
	System.out.println(myAge <=25);
	System.out.println(myAge == teacherAge); //myAge 변수 값과 teacherAge 변수값이 같은지 비교하는 연산자
	
	char ch;
	ch = (myAge > teacherAge) ? 'T':'F'; // 조건식이 참인 경우와 거짓인 경우 다른 결과 값을 출력하는 연산자
	
	System.out.println(ch);
	
	//Q2 다음 코드가 수행될 때 출력되는 값을 적어 보세요.
	int num;
	num = -5 + 3 * 10 /2;
	System.out.println(num); //값 : 10
	
	
	//Q3 다음 코드가 수행될 때 출력되는 값을 적어 보세요.
	int nm = 10;
	
	
	System.out.println(nm); //10
	System.out.println(nm++); //10
	System.out.println(nm); //11
	System.out.println(--nm); //10
	
	//Q4 다음 코드가 수행될 때 출력되는 값을 적어 보세요.
	
	int num1 = 10;
	int num2 = 20;
	boolean result;
	
	result = ((num1 > 10) && ( num2 > 10 )); 
	System.out.println(result);//false
	result = ((num1 > 10) || (num2 > 10));
	System.out.println(result); //true
	System.out.println(!result); //false
	
	//Q5 다음 코드가 수행될 때 출력되는 값을 적어보세요. 모르겠음;;
	int num11 = 2;
	int num22 = 10;
	
	System.out.println(num11 & num22);
	System.out.println(num11 | num22);
	System.out.println(num11 ^ num22);
	System.out.println(~num11);
	
	//Q6 다음 코드가 수행될 때 출력되는 값을 적어 보세요.
	int num3 = 8;
	
	System.out.println(num3 += 10); //18
	System.out.println(num3 -= 10); //8
	System.out.println(num3 >>= 2); //몰라
		
	//Q7 다음 코드가 수행될 때 출력되는 값을 적어 보세요.
	
	int num4 = 10;
	int num5 = 20;
	
	int result1 = (num4 > 10) ? num5 + 10 : num5 - 10;
	System.out.println(result1); // 10
	
	
}
}
