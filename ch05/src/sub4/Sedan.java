package sub4;

public class Sedan extends Car{

	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		// TODO Auto-generated constructor stub
	}

	public void turbo() {
		// 부모클래스 속성 speed 접근권한을 protected로 변경
		speed += 20;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("배기량 : " + this.cc);
	}
}

