package user;

public class UserRepository {
	private User [] array;
	private int currentUser;
	private int size;

	public UserRepository(){
		this.array = new User[1];
		this.size = 1;
		this.currentUser = 0;
	}
	public int getSize(){
		return this.size; 
	}
	public int getCurrentUser(){
		return this.currentUser;
	}
	
	public User [] getClientList(){
		return array;
	}
	
	public User findUser(String name){
		User user = null;
		for(int c = 0; c <= currentUser; c++){
			if(array[c].getName().equals(name)){
				user = array[c];
			}
		}
		return user;
	}
	public void addUser(User user){
		if(this.currentUser >= this.size){
			this.increaseRepository();
		}
		this.array[this.currentUser] = user;
		this.currentUser++;
	}
	
	 public void removeUser(String address, int port){
	        for(int c = 0; c < currentUser; c++){
	            if(array[c].getIPAddress().equals(address) && array[c].getPort() == port){
	                array[c] = array[this.currentUser-1];
	                this.currentUser--;
	            }
	        }
	    }
	
	private void increaseRepository(){
		this.size = this.size*2;
		User [] aux = new User [this.size];
		for(int c = 0; c < this.currentUser; c++){
			aux[c] = this.array[c];
		}
		this.array = aux;
	}
	
	public void showRepository(){
		for(int c = 0; c < this.currentUser; c++){
			System.out.print("Name: " + this.array[c].getName() + " ");
			System.out.print("Address: " + this.array[c].getIPAddress() + " ");
			System.out.println("Port: " + this.array[c].getPort());
		}
	}
}
