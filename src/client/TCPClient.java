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

public class TCPClient {
	 public static void main(String args[]) {
		final int portaDestino = 3001;
		try {
			Socket client = new Socket("localhost", portaDestino);
			SendThread sendThread = new SendThread(client);
			Thread thread = new Thread(sendThread);
			thread.start();
			RecieveThread recieveThread = new RecieveThread(client);
			Thread thread2 =new Thread(recieveThread);
			thread2.start();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	 }
}
