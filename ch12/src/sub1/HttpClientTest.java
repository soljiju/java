package sub1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
/*
 * 날짜 : 2025/01/22
 * 이름 : 주솔지
 * 내용 : Java Http 통신 실습

 */
public class HttpClientTest {

	public static void main(String[] args) {
		
		HttpClient httpClient = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest
									.newBuilder()
									.uri(URI.create("http://google.com"))
									.GET()
									.build();
		
		HttpResponse<String> response;
		try {
			response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("상태코드 : " + response.statusCode());
			System.out.println("응답내용 : " + response.body());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		
		
	}
}
