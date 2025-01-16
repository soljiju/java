package sub4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2025/01/16 
 * 이름 : 주솔지
 * 내용 : Java Properties 실습하기
 */
public class PropertiesTest {
	public static void main(String[] args) {
		
		//프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		//프로퍼티 파일 저장(직렬화)
		String target = "C:\\Users\\lotte6\\Desktop\\Fruit.properties"; //확장자 priperties
		
		try {
			FileOutputStream fos = new FileOutputStream(target);
			prop.store(fos, null);
		
			fos.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
			
		}
		/////////////////////////////////
		String source = "C:\\Users\\lotte6\\Desktop\\City.properties"; 
		
		Properties sourceProp = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(source);
			
			// 프로퍼터 파일 읽기
			sourceProp.load(fis);
		
			// 스트림 해제
			fis.close();
		
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sourceProp);
		System.out.println("kor 키값 : " + sourceProp.getProperty("kor"));
		System.out.println("usa 키값 : " + sourceProp.getProperty("usa"));
		System.out.println("jpn 키값 : " + sourceProp.getProperty("jpn"));
		System.out.println("chi 키값 : " + sourceProp.getProperty("chi"));
		}
	}
	

