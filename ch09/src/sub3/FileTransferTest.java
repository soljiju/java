package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransferTest {
	 
	public static void main(String[] args) {
			
		// 파일 경로 설정
		String source = "C:\\Users\\lotte6\\Desktop\\Sample.tif";
		String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif";
		
		try {
			//스트림생성
		
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//파일복사
			fis.transferTo(fos);
			
			//스트림해제
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




