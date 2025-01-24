package loopexample;
//0부터 시작해 숫자를 1씩 늘리면서 합을 계산할 때 숫자를 몇까지 더하면 100이 넘나
public class BreakExample1 {
	public static void main(String[] args) {
			int sum = 0;
			int num = 0;
			
			for(num = 0; sum < 100; num++) {
				sum += num;
			}
			
			System.out.println("num : " + num);
			System.out.println("sum : " + sum);
	}

}
