package server;


import user.User;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer{

	public static void main(String[] args) throws IOException {
		final int portaLocal = 3001;
		ServerSocket ss = new ServerSocket(portaLocal);
		while(true){
			Socket clientSocket = ss.accept();
			System.out.println("Conection established. type QUIT to disconnect");
			RcvDataThread rcv = new RcvDataThread(clientSocket);
			
		}
			
	}

}
