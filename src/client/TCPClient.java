package client;

import user.User;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient implements Runnable{
	private static Socket client;
	private static int portaDestino = 3001;
	 public static void main(String args[]) {
		 int portaDestino = 3001;
		try {
			Socket client = new Socket("localhost", portaDestino);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 Scanner in = new Scanner(System.in);
		 boolean read = false;

		 try {
			 PrintStream saida = new PrintStream(client.getOutputStream());
			 read = true;
			 while (read) {
				 saida.println(in.nextLine());
			 }
//			text = in.nextLine();
//			output.writeUTF(text);
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
