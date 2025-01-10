package test3;
/*
 * 날짜 : 2025/01/10
 * 이름 : 주솔지
 * 내용 : 클래스 상속 연습문제
 */
class Customer {
	???????? int id;
			 String name;
			 String grade;
			 int point;
			 double pointRatio;
			 
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("==================");
		System.out.println("고객번호 : "+id);
		System.out.println("고객이름 : "+name);
		System.out.println("고객등급 : "+grade);
		System.out.println("현재 포인트 : "+point);
		System.out.println("포인트 적립율 : "+pointRatio);
		System.out.println("------------------");
	}
}


class VipCustomer ??? {
	
	private double saleRatio;
	
	public VipCustomer(int id, String name) {
		???
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		super.saleRatio = 0.1;
	}
	
	public int calc
	}
}







public class Test07 {

}
