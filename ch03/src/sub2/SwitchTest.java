package sub2;

import java.util.Scanner;

/*
 * 날짜
 * 이름
 * 내용
 */
public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("숫자 입력 : ");
		
		//사용자입력
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.err.println("입력 숫자 :" + number);
		
		switch(number % 2) {
		
		case 0:
			
			System.out.println("number는 짝수");
			break;
		
		case 1:
			
			System.out.println("number는 홀수");
			break;
			
		default:
			
			System.out.println("number는 숫자가 아님");
			break;
		}
	}
}
