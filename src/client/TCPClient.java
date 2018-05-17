package client;

import user.User;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient implements Runnable{
	 public static void main(String args[]) {
		 Scanner in = new Scanner(System.in);
		 int port = 3001;
		 String address = "localhost";
		 String text = "";
		 try {
			Socket socket = new Socket(address, port);
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			while(true){
				System.out.println("Digite sua mensagem!");
				text = in.nextLine();
				output.writeUTF(text);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
