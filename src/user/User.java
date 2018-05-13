package user;
import java.io.Serializable;

public class User implements Serializable{

	private String name;
	private String ipAddress;
	private int port;
	
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
