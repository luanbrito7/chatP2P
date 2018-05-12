package user;

public class User {

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
		return name;
	}
	public String getIPAddress(){
		return ipAddress;
	}
	public int getPort(){
		return port;
	}
	public void changeUserName(String name){
		this.name = name;
	}

}
