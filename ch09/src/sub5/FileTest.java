package sub5;

import java.io.File;
import java.io.IOException;

/*
 * 날짜 : 2025/01/16 
 * 이름 : 주솔지
 * 내용 : Java File 실습하기
 */
public class FileTest {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\lotte6\\Desktop\\Test.txt";
		String path2 = "C:\\Users\\lotte6\\Desktop\\Test";
		
		//파일객체생성
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		try {
			f1.createNewFile(); //파일생성
			f2.mkdir();			//디렉토리생성
			
			System.out.println("f1 존재여부 : "+f1.exists());
			System.out.println("f2 존재여부 : "+f1.exists());
			System.out.println("f1 파일여부 : "+f1.isFile());
			System.out.println("f2 존재여부 : "+f2.isFile());
			System.out.println("f1 디렉토리여부 : "+f1.isDirectory());
			System.out.println("f2 디렉토리여부 : "+f2.isDirectory());
			System.out.println("f1 파일이름 : "+f1.getName());
			System.out.println("f2 파일이름 : "+f1.getName());
			System.out.println("f1 파일경로 : "+f1.getPath());
			System.out.println("f1 파일경로 : "+f1.getPath());
			System.out.println("f1 파일경로 : "+f1.getAbsolutePath());
			System.out.println("f2 파일경로 : "+f1.getAbsolutePath());
			
			f1.delete();//파일삭제
			f2.delete();//디렉토리삭제

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
