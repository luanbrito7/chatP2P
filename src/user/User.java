package user;
import java.io.Serializable;
import client.TCPClient;
import server.TCPServer;

public class User implements Serializable{

	private String name;
	private String ipAddress;
	private int port;
	public TCPClient cliente;
	public TCPServer server;
	
	public User(String name, String ipAddress, int port){
		this.name = name;
		this.ipAddress = ipAddress;
		this.port = port;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	public String getIPAddress(){
		return this.ipAddress;
	}
	public int getPort(){
		return this.port;
	}
	

}
