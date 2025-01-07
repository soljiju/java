package sub2;
/*
 * 날짜 : 2025/01/07
 * 이름 : 주솔지
 * 내용 : Java 클래스 캡슐화 실습하기
 */
public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		
		// car 객체 생성 초기화
		Car sonata = new Car ();
		
		//캡슐화된 속성은 외부에서 참조할 수 없음
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 10;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.Show();
		
		/*
		 <출력>
		 차량명 : 아반테
		 차량색 : 검정
		 현재속도 : 20
		 
		 */
		
		Car avante = new Car ("아반테", "검정", 0);
		avante.speedUp(80);
		avante.speedDown(60);
	    avante.Show();
	}
}
