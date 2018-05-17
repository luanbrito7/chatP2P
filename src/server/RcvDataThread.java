package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class RcvDataThread implements Runnable{
	Socket clientSocket = null;
	BufferedReader buffer = null;
	public RcvDataThread(Socket clientSocket){
		this.clientSocket = clientSocket;
	}
	@Override
	public void run() {
		try{
			buffer = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
			String msg;
			while(true){
				while((msg = buffer.readLine())!=null){
					if(msg.equals("EXIT")){
						break; 
					}
					System.out.println("P2 says: " + msg);
				}
				System.out.println("P2 Disconnected");
				this.clientSocket.close();
			}
			
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
}
