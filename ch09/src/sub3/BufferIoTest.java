package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 날짜 : 2025/01/16 
 * 이름 : 주솔지
 * 내용 : Java 파일 입출력 버퍼스트림 실습하기
 */
public class BufferIoTest {
 public static void main(String[] args) {
		
		// 파일 경로 설정
		String source = "C:\\Users\\lotte6\\Desktop\\Sample.tif";
		String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif";
		
		
		//스트림생성
	try {
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(target);
		
		//보조 스트림 생성 후 기본 스트림 연결
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//스트림 데이터 전송
		while(true) {
			
			int data = bis.read();
			
			if(data == -1) {
				//읽을 파일 데이터가 없을때
				break;
			}
			
			//숫자를 문자로 변환
			//char ch = (char) data;
			//System.out.print(ch);
		
			//출력스트림으로 파일 데이터 쓰기
			bos.write(data);
		}
		// 스트림 해제
		bis.close();
		bos.flush();//출력버퍼는 해제 전에 비워줌
		bos.close();
		
		fis.close();

		fos.close();
		
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
	
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("프로그램 종료...");
		
}
}


