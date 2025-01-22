package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * 날짜 : 2025/01/21
 * 이름 : 주솔지
 * 내용 : Java Http 통신 실습

 */
public class HttpTest {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://google.com");
			
			
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./result.txt");
		
			String line = null;
			
			while((line= br.readLine()) != null) {
				System.out.println(line);
				fos.write(line.getBytes());
				
			}
			
			br.close();
			fos.close();
		
		
		}catch (IOException e) {
				e.printStackTrace();	
		}
		System.out.println("프로그램 통신 종료....");
	}
}
