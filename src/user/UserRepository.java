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
		
	}
	
	private void increaseRepository(){
		
	}
}
