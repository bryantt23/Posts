import java.util.*;

public class User {
		
	static int nextAvailableUserId;
	int userId;
	String name;
	
	public User(String name) {
		this.userId=nextAvailableUserId++;
		this.name=name;
	}
	
	void createPost(String title,String body) {
		new Post(title, body, this.userId);
	}
	
	void printUserPosts() {
		Database.printPosts(this);
	}
}
