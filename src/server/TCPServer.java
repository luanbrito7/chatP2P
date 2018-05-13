package server;

import user.UserRepository;
import user.User;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer implements Runnable{

	public static void main(String[] args) {
		UserRepository repository = new UserRepository();
		try {
			ServerSocket serverSocket = new ServerSocket();
			while(true){
				Socket clientSocket = serverSocket.accept();
				String clientAddress = clientSocket.getInetAddress().getHostAddress();
				int clientPort = clientSocket.getPort();
				String clientName;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
