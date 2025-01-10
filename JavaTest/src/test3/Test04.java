package test3;

/*
 * 날짜 : 2025/01/10
 * 이름 : 주솔지
 * 내용 : 정적변수 연습문제
 */
class Student {
	???? studentId;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("===========");
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
		System.out.println("===========");
	}
}


public class Test04 {
	public static void main(String[] args) {
		Student.studentId = 20201000;
		
		Student kim = ???
		kim.studentInfo();
		
		Student lee = ???
		lee.studentInfo();
		
		Student lim = ???
		lim.studentInfo();
	}

}
