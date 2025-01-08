package sub3;

/*
 도서관 관리 시스템의 일부로 Book 클래스를 정의 하세요. 이 클래스는 다음 요구사항을 충족해야 합니다.
 */

//Car 클래스 정의(설계)
public class Car {

	
	//속성(멤버변수) - 클래스 속성은 캡슐화를 통해 무조건 private선언
	private String name;
	private String color;
	private int speed;
	
	// 클래스 변수 (정적변수) - 객체 생성 없이 클래스 이름으로 직접 참조
	public static int count;
	
	// 생성자 - 캡슐화된 속성을 초기화하기 위한 매서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	//기능(멤버 메서드) - 클래스 기능은 무조건 public 선언
	
	// 클래스 메서드(정적 메서드) - 객체 생성 없이 클래스 이름으로 직접 호출
	public static int getCount() {
		return count;
	}
	
	
	public void speedUp(int speed) {
		// 속성 speed에 매개변수값 대입 (갈색이 파란색으로 더해지는 것이다.)
		this.speed += speed;
		//this는 현재 클래스를 지칭
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void Show() {
	
		 System.out.println("차량명 : " + this.name);
		 System.out.println("차량색 : " + this.color);
		 System.out.println("현재속도 : " + this.speed);
}
	//Getter, Setter 정의(옵션) - 캡슐화된 속성을 수정하기 위한 메서드
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	}

