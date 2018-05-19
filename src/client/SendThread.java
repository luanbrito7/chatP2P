package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread implements Runnable{
	Socket socket = null;

	PrintWriter print=null;
	BufferedReader brinput=null;

	public SendThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			if(socket.isConnected()){
				System.out.println("Connected. Type EXIT to Disconnect");
				this.print = new PrintWriter(socket.getOutputStream(), true); 
				while(true){
					brinput = new BufferedReader(new InputStreamReader(System.in));
					String msgtoServerString=null;
					msgtoServerString = brinput.readLine();
					this.print.println(msgtoServerString);
					this.print.flush();

					if(msgtoServerString.equals("EXIT")){
						break;
					};
				}
				socket.close();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
