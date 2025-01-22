package sub3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class SenderThread extends Thread {
	 {

		private Socket socket;
		
		public SenderThread(Socket socket) {
			this.socket = socket;
			
		}
		
		@Override
		public void run() {
			
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				printWriter writer = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					String msg = br.readLine();
							
					if(msg.equals("bye")) {
						
						break;
					}
					
					writer.println(msg);
					writer.flush();
				}
				
			}
			}catch (Exception e) {
				e.printStackTrace();	
			} finally {
				try {
					socket.close();	
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			
			}
	 
		
		
	}

}
