package server;

import user.UserRepository;
import user.User;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		UserRepository repository = new UserRepository();
		try {
			ServerSocket serverSocket = new ServerSocket();
			while(true){
				Socket clientSocket = serverSocket.accept();
				String clientAddress = clientSocket.getInetAddress().toString();
				int clientPort = clientSocket.getPort();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

}
