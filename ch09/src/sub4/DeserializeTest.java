package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2025/01/16 
 * 이름 : 주솔지
 * 내용 : Java 역직렬화 실습하기
 */
public class DeserializeTest {
	
	public static void main(String[] args) {
	
		String source = "C:\\Users\\lotte6\\Desktop\\Apple.txt";
		
		//기본 스트림 생성
		try {
			FileInputStream fis = new FileInputStream(source);
			
			 
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Apple apple = (Apple) ois.readObject();
			apple.show();
			//스트림해제
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		System.out.println("프로그램 종료...");
		
	}}

