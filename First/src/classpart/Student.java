package classpart;

public class Student { //클래스 선언
    
	//변수 선언
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	public static void main(String [] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	}


