package server;


import user.User;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer implements Runnable{

	public static void main(String[] args) throws IOException {
		int port = 3001;
		boolean connected = false;
		try {
			ServerSocket tmpSocket = new ServerSocket(port);
			while(true){
				System.out.println("Aguardando p1");
				Socket socket = tmpSocket.accept();
				DataInputStream input = new DataInputStream(socket.getInputStream());
				connected = true;
				System.out.println("Conexão estabelecida");
				while(connected){
					System.out.println(input.readUTF());
					if(input.readUTF().equals("bye")){
						connected = false;
					}
				}
				socket.close();
			}
			
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
