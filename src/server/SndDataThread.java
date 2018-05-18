package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SndDataThread implements Runnable{
	PrintWriter pw;
	Socket socket = null;
	public SndDataThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			pw = new PrintWriter(new OutputStreamWriter(this.socket.getOutputStream()));
			
			while(true){
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				String msgToClient = input.readLine();
				pw.println(msgToClient);
				pw.flush();
				if(msgToClient.equals("EXIT")){
					break;
				}
			}
			socket.close();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
