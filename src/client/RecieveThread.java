package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class RecieveThread implements Runnable{
	Socket socket=null;
	BufferedReader recieve=null;

	public RecieveThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{

			recieve = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));//get inputstream
			String msgRecieved = null;
			while((msgRecieved = recieve.readLine())!= null){
				if(msgRecieved.equals("EXIT")){
					break;
				}
				System.out.println("P1 says: " + msgRecieved);
			}

			System.out.println("P1 is Disconnect");
			this.socket.close();

		}
		catch(Exception e){System.out.println(e.getMessage());}
	}

}
