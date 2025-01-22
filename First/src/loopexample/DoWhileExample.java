package loopexample;
//while문으로 만든 1부터 10까지 더하는 프로그램을 do-while문으로 바꿔 봅시다.
public class DoWhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
			
		}while(num<=10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
